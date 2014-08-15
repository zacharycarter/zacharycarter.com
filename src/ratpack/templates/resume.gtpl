layout 'layout.gtpl',
bodyContents: contents {
section(id: "main") {
  article(class: "content") {
		h2('Contact')
		def links = [
			[link: [href: 'mailto:carterza@gmail.com'], title: 'carterza@gmail.com'],
			[link: [href: 'tel:+1.571.315.1128'], title: '571.315.1128'],
			[link: [href: 'http://www.zacharycarter.com'], title: 'http://www.zacharycarter.com'],
		]
		ul {
			links.each { link ->
				li { a(link.link, link.title) }
			}
		}
		h2('Experience')
		def experiences = [
			[company: 'CARFAX'],
			[company: 'Epsilon'],
			[company: 'American Cadastre LLC']
		]
		ul {
			experiences.each { experience ->
				li { 
					h5(experience.company)
				}
			}
		}
  }
}
}