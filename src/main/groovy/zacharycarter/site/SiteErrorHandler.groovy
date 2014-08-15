package zacharycarter.site

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import ratpack.error.ClientErrorHandler
import ratpack.error.ServerErrorHandler
import ratpack.handling.Context

import static ratpack.groovy.Groovy.groovyMarkupTemplate

@Slf4j
@CompileStatic
class SiteErrorHandler implements ClientErrorHandler, ServerErrorHandler {

  @Override
  void error(Context context, int statusCode) {
    context.response.status(statusCode)
    message(context, statusCode == 404 ? "The page you have requested does not exist." : "The request is invalid (HTTP $statusCode).")
    if (statusCode == 404) {
      log.error "404 for $context.request.path"
    }
  }

  @Override
  void error(Context context, Exception exception) throws Exception {
    context.with {
      response.status(500)
      message(context, exception.message ?: "<no message>")
      blocking { log.error "", exception }.then {}
    }
  }

  void message(Context context, CharSequence message) {
    context.render(groovyMarkupTemplate("error.gtpl", message: message.toString(), statusCode: context.response.status.code))
  }

}