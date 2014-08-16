layout 'layout.gtpl',
bodyContents: contents {
section(id: "promo") {
  div(class:"content") {
    article {
      h2('Welcome!')

      p('My name is Zachary Carter. I build web, desktop, and mobile software applications. I also develop video games in my spare time.')

      p {
        yield 'I work with a variety of technologies and programming languages like '
        a(href:"http://www.java.com/", 'Java')
				yield ', '
				a(href:"http://groovy.codehaus.org/", 'Groovy')
				yield ', and'
				a(href:"http://spring.io/", ' Spring')
        yield '.'
      }

      p('My portfolio and blog are both works in progress, so please bear with me as I finish their development. In the mean time feel free to check out my resume, github, and twitter accounts.')
    }

    nav {
      h2('Links')
      def links = [
        [link: [href: '/resume'], title: 'R&#233;sum&#233;'],
        [link: [href: '/portfolio'], title: 'Portfolio'],
				[link: [href: '/blog'], title: 'Blog']
      ]
      ul {
        links.each { link ->
          li { a(link.link, link.title) }
        }
      }

    }
  }
}

section(id: "main") {
  article(class: "content") {
    p {
      strong('Want to contact me?')
      yield ' Drop me a line at : '
      a(href: "mailto:carterza@gmail.com", target: "_top", 'carterza@gmail.com')
      yield '.'
    }
    p {
      strong('Found an issue with the website?')
      yield ' Let me know about it via the '
      a(href: "http://github.com/zacharycarter/zacharycarter.com/issues", 'issue tracker')
      yield '.'
    }
    p {
      strong('Want to collaborate with me on a project?')
      yield ' I am always eager to work with talented artists and developers. Feel free to send me a '
      a(href: "http://twitter.com/home?status=@hahaitsfunny", 'tweet')
      yield ' about your project or idea.'
    }
  }
}
}