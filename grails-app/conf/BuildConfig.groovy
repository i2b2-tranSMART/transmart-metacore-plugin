grails.project.work.dir = 'target'

grails.project.dependency.resolver = 'maven'
grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		mavenLocal() // Note: use 'grails maven-install' to install required plugins locally
		grailsCentral()
		mavenCentral()
		mavenRepo 'https://repo.transmartfoundation.org/content/repositories/public/'
	}

	dependencies {
		compile 'org.codehaus.groovy.modules.http-builder:http-builder:0.5.1', {
			excludes 'groovy', 'nekohtml'
		}
		compile 'org.apache.httpcomponents:httpclient:4.4.1'
		compile 'net.sf.opencsv:opencsv:2.3'
	}

	plugins {
		build ':release:3.1.2', ':rest-client-builder:2.1.1', {
			export = false
		}
	}
}
