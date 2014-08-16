import groovy.text.markup.TemplateConfiguration
import ratpack.codahale.metrics.CodaHaleMetricsModule
import ratpack.file.internal.DefaultFileSystemBinding
import ratpack.groovy.markuptemplates.MarkupTemplatingModule
import ratpack.groovy.templating.TemplatingModule
import ratpack.jackson.JacksonModule
import ratpack.newrelic.NewRelicModule
import ratpack.remote.RemoteControlModule
import ratpack.rx.RxRatpack
import zacharycarter.site.SiteModule
// import ratpack.site.github.GitHubApi
// import ratpack.site.github.GitHubData
// import ratpack.site.github.RatpackVersions

import static ratpack.groovy.Groovy.*
import static ratpack.registry.Registries.just

ratpack {
  bindings {
    add \
      new JacksonModule(),
      new CodaHaleMetricsModule().metrics(),
      new SiteModule(launchConfig),
      new RemoteControlModule(),
      new NewRelicModule(),
      new MarkupTemplatingModule()

    config(TemplatingModule).staticallyCompile = true

    RxRatpack.initialize()
    init { TemplateConfiguration templateConfiguration ->
      templateConfiguration.with {
        autoNewLine = true
        useDoubleQuotes = true
        autoIndent = true
      }
    }
  }

  handlers {

    def longCache = 60 * 60 * 24 * 365
    def shortCache = 60 * 10 // ten mins

    handler {
      if (request.path.empty || request.path == "index.html") {
        response.headers.set "X-UA-Compatible", "IE=edge,chrome=1"
      }

      next()
    }

    prefix("assets") {
      handler {
        response.headers.add("Cache-Control", "max-age=$shortCache, public")
        next()
      }
      assets "assets"
    }

    // The generated CSS has links to /images, remap
    // https://github.com/robfletcher/gradle-compass/issues/12
    prefix("images") {
      handler {
        response.headers.add("Cache-Control", "max-age=$shortCache, public")
        next()
      }
      assets "assets/images"
    }

    get("index.html") {
      redirect 301, "/"
    }

    get {
      render groovyMarkupTemplate("index.gtpl")
    }
	
		prefix("resume") {
			get {
				render groovyMarkupTemplate("resume.gtpl")
			}
    }
		
		prefix("portfolio") {
			get {
				render groovyMarkupTemplate("portfolio.gtpl")
			}
    }
		
		prefix("blog") {
			get {
				render groovyMarkupTemplate("blog.gtpl")
			}
    }

    assets "public"
  }
}