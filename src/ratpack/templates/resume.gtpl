layout 'layout.gtpl',
bodyContents: contents {
section(id: "main") {
  article(class: "content") {
		div(class: 'self-portrait') {
			img(src: "/assets/images/portrait.png", alt: "Zachary Carter", width: 100, height: 145)
		}
		h2('Contact')
		def links = [
			[link: [href: 'mailto:carterza@gmail.com'], title: 'carterza@gmail.com'],
			[link: [href: 'tel:+1.571.315.1128'], title: '571.315.1128'],
			[link: [href: 'http://www.zacharycarter.com'], title: 'http://www.zacharycarter.com'],
		]
		ul(id: "contact") {
			links.each { link ->
				li { a(link.link, link.title) }
			}
		}
		h2('Experience')
		def experiences = [
			[
				company: 'CARFAX',
				website: [href: 'http://www.carfax.com/', target:'_blank'],
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
				],
				technologies: [
					[href: 'http://www.java.com/', target: '_blank', img: [src: 'java.png', alt: 'Java', width: 24, height: 40]],
					[href: 'http://groovy.codehaus.org/', target: '_blank', img: [src: 'groovy.png', alt: 'Groovy', width: 80, height: 40]],
					[href: 'http://www.gradle.org/', target: '_blank', img: [src: 'gradle.png', alt: 'Java', width: 149, height: 40]],
					[href: 'http://grails.org/', target: '_blank', img: [src: 'grails.png', alt: 'Grails', width: 166, height: 39]],
					[href: 'http://www.jenkins-ci.org/', target: '_blank', img: [src: 'jenkins.png', alt: 'Jenkins', width: 124, height: 40]],
					[href: 'http://www.spring.io/', target: '_blank', img: [src: 'spring.png', alt: 'Spring', width: 123, height: 40]],
					[href: 'http://npmjs.org/', target: '_blank', img: [src: 'npm.png', alt: 'NPM', width: 103, height: 40]],
					[href: 'http://bower.io/', target: '_blank', img: [src: 'bower.png', alt: 'Bower', width: 46, height: 40]],
					[href: 'http://salesforce.com/', target: '_blank', img: [src: 'salesforce.png', alt: 'Salesforce.com', width: 56, height: 40]],
					[href: 'http://postgresql.org/', target: '_blank', img: [src: 'postgresql.png', alt: 'PostgreSQL', width: 51, height: 40]],
					[href: 'http://gulpjs.com/', target: '_blank', img: [src: 'gulp.png', alt: 'Gulp', width: 18, height: 40]]
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
				],
				technologies: [
					[href: 'http://www.java.com/', target: '_blank', img: [src: 'java.png', alt: 'Java', width: 24, height: 40]],
					[href: 'http://tibco.com/', target: '_blank', img: [src: 'tibco.png', alt: 'Tibco', width: 159, height: 40]]
				]
			],
			[
				company: 'American Cadastre LLC',
				website: [href: 'http://www.amcad.com/', target:'_blank'],
				tenure: '2009 to 2011',
				position: 'Software Engineer',
				notes: [
					'Enhanced and maintained line of business applications',
					'Integrated internal software systems with Microsoft Sharepoint 2007 and 2010',
					'Developed and maintained internal revenue forecasting web application hosted in Sharepoint 2010',
					'Developed automated solution for testing OCR process accuracy',
					'Developed automated patch management solution for distributing product updates to clients',
					'Enhanced internal Apache SOLR web application',
					'Administered Sharepoint 2007 and 2010 servers'
				],
				technologies: [
					[href: 'http://www.microsoft.com/net', target: '_blank', img: [src: 'dotnet.png', alt: 'Microsoft .NET', width: 40, height: 40]]
				]
			],
			[
				company: 'American Cadastre LLC',
				website: [href: 'http://www.amcad.com/', target:'_blank'],
				tenure: '2008 to 2009',
				position: 'Quality Assurance Analyst',
				notes: [
					'Developed and implemented functional and regression test plans for line of business applications',
					'Worked closely with customer support managers to rapidly troubleshoot and triage product defects',
					'Assisted developers in analysing stack traces to identify problems in code',
					'Authored T-SQL scripts to assist with automated testing'
				],
				technologies: [
					[href: 'http://www.microsoft.com/net', target: '_blank', img: [src: 'dotnet.png', alt: 'Microsoft .NET', width: 40, height: 40]]
				]
			]
		]
		ul(id: "experiences") {
			experiences.each { experience ->
				li { 
					h4 { a(experience.website, rel: 'external', experience.company) }
					p { 
						h5(experience.tenure + ' : ' + experience.position)
					}
					ul {
						experience.notes.each { note ->
							li note
						}
					}
					h5('Technologies used : ')
					experience.technologies.each { technology ->
						a(href: technology.href, rel: 'external', target: technology.target) {
							img(class: "tech", src: "/assets/images/${technology.img.src}", alt: technology.img.alt, width: technology.img.width, height: technology.img.height)
						}
					}
				}
			}
		}
		h2('Education')
		ul(id: "education") {
			li { span strong('2008') + ' : BA in ' a(href: 'http://www.pubapps.vcu.edu/bulletins/undergraduate/?did=20522', rel: 'external', target: '_blank', 'History') span ', Virginia Commonwealth University' }
		}
		h2('Honors')
		ul(id: "honors") {
			li { span strong('2013') + ' : Lemon achievement award, ' a(href: 'http://www.carfax.com/', rel: 'external', target: '_blank', 'CARFAX') }
			li { span strong('2010') + ' : Associate of the year, ' a(href: 'http://www.amcad.com/', rel: 'external', target: '_blank', 'American Cadastre LLC') }
			li { span strong('2003') + ' : Eagle Scout, ' a(href: 'http://www.scouting.org/About/FactSheets/EagleScouts.aspx', rel: 'external', target: '_blank', 'Boy Scouts of America') }
		}
  }
}
}