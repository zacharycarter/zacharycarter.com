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
			[
				company: 'CARFAX',
				website: [href: 'http://www.carfax.com', target:'_blank'],
				tenure: '2012 to Present', 
				position: 'Web Application Developer',
				notes: [
					'Billing and pricing system maintenance and enhancement',
					'Gradle, gulp, npm build automation', 
					'Jenkins continuous integration',
					'CentOS server administration',
					'Systems integration with Salesforce.com',
					'Internal RESTful API design and development',
					'Batch job and process development',
					'Legacy ColdFusion application maintenance and enhancement'
				]
			],
			[
				company: 'Epsilon',
				website: [href: 'http://www.epsilon.com/', target:'_blank'],
				tenure: '2011 to 2012',
				position: 'Software Engineer',
				notes: [
					'Contributed to design and architecture of greenfield e-mail campaign management project',
					'Developed SOAP over JMS web services',
					'Established JVM performance monitoring and instrumentation',
					'Introduced test automation and database bootstrapping',
					'ETL process development'
				]
			],
			[
				company: 'American Cadastre LLC',
				tenure: '2009 to 2011',
				position: 'Software Engineer',
				notes: []
			],
			[
				company: 'American Cadastre LLC',
				tenure: '2008 to 2009',
				position: 'Quality Assurance Analyst',
				notes: []
			]
		]
		ul(id: "experiences") {
			experiences.each { experience ->
				li { 
					h4 { a(experience.website, experience.company) }
					p { 
						h5(experience.tenure + ' : ' + experience.position)
					}
					ul {
						experience.notes.each { note ->
							li note
						}
					}
				}
			}
		}
  }
}
}