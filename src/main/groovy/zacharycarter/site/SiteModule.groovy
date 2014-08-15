package zacharycarter.site

import com.fasterxml.jackson.databind.ObjectReader
import com.google.inject.AbstractModule
import com.google.inject.Provides
import ratpack.error.ClientErrorHandler
import ratpack.error.ServerErrorHandler
import ratpack.http.client.HttpClient
import ratpack.launch.LaunchConfig
import groovy.util.logging.Slf4j

@SuppressWarnings(["GrMethodMayBeStatic", "GroovyUnusedDeclaration"])
class SiteModule extends AbstractModule {

  private final LaunchConfig launchConfig

  SiteModule(LaunchConfig launchConfig) {
    this.launchConfig = launchConfig
  }

  @Override
  protected void configure() {
    bind(ClientErrorHandler).toInstance(new SiteErrorHandler())
    bind(ServerErrorHandler).toInstance(new SiteErrorHandler())
  }

}