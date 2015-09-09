package org.ravishingme

import grails.plugin.springsecurity.annotation.Secured;

class PersonController {
	
	@Secured(['ROLE_USER'])
	def index() {
		render "<html>Hi there!</html>"
		//redirect action:"list"
	}
	
	def list() {
		log.info("List all people");
		def personList = Person.list();
		[ personList : personList ]
	}
}
