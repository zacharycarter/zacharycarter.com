yieldUnescaped '''<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
'''
html {
  head {
    meta(charset:'utf-8')
    title('zacharycarter.com')

    meta(name: 'apple-mobile-web-app-title', content: 'zacharycarter.com')
    meta(name: 'description', content: 'Zachary Carter&#39;s blog, portfolio, and resume.')
    meta(name: 'viewport', content: 'width=device-width, initial-scale=1')
	
    link(rel: 'author', href: '/assets/humans.txt')
		link(rel: 'stylesheet', href: '/assets/lib/normalize/normalize.css')
    link(rel: 'stylesheet', href: '/assets/styles/zacharycarter.css')
		
		script(src: '/assets/lib/modernizr/modernizr.js') {}
    script(src: '/assets/lib/prism/prism.js') {}
  }
  body {
		div(id: 'wrapper') {
			header(id: 'page-header') {
				div(class: 'ratpack-logo') {
					a(href: '/') { h1('Zachary Carter') }
					p('Web application, systems &amp; game developer')
				}

				nav(class: 'social') {
					h2('I am on&hellip;')
					a(href: 'http://github.com/zacharycarter/', title: 'Zachary Carter on GitHub', rel: 'external', 'GitHub')
					newLine()
					span(class: 'join', '&amp;')
					newLine()
					a(href: 'http://twitter.com/hahaitsfunny', title: '@hahaitsfunny on Twitter', rel: 'external', 'Twitter')
				}

			}
			
			bodyContents()
			div(id: 'wrapper-footer') {}
		}
			
		if (!nobanner) {
			footer(id: 'page-footer') {
				div(class: 'content') {
					section(class: 'about') {
						p {
							yield 'This web application is '
							a(href: 'https://github.com/zacharycarter/zacharycarter.com', rel: 'external', 'open source')
							yield ', and licensed under the '
							a(href: 'http://www.apache.org/licenses/LICENSE-2.0.html', rel: 'external', 'Apache License, Version 2.0')
							yield '.'
						}
						p {
							yield 'This site is a '
							a(href: 'http://www.ratpack.io/', rel: 'external', 'Ratpack')
							yield ' application running on '
							a(href: 'https://www.heroku.com/', rel: 'external', 'Heroku')
							yield '.'
						}
						p {
							yield 'This web application was made possible by : '
						}
					}
					def credits = [
						[href: 'https://github.com/', img: [src: 'github.png', alt: 'Octocat', width: 122, height: 40]],
						[href: 'http://www.gradle.org/', img: [src: 'gradle.png', alt: 'Gradle logo', width: 149, height: 40]],
						[href: 'http://groovy.codehaus.org/', img: [src: 'groovy.png', alt: 'Groovy logo', width: 80, height: 40]],
						[href: 'https://www.heroku.com/', img: [src: 'heroku.png', alt: 'Heroku logo', width: 120, height: 40]],
						[href: 'http://ratpack.io', img: [src: 'ratpack-logo-small.png', alt: 'Ratpack logo', width: 156, height: 40]]
					]
					section(class: 'credits') {
						credits.each { credit ->
							a(href: credit.href, rel: 'external') {
								img(src: "/assets/images/${credit.img.src}", alt: credit.img.alt, width: credit.img.width, height: credit.img.height)
							}
						}
					}
				}
			}
		}
	}
}