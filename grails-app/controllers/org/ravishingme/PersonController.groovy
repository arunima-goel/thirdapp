package org.ravishingme

import grails.plugin.springsecurity.annotation.Secured;

class PersonController {
	
	@Secured(['ROLE_USER'])
	def index() {
		redirect action:"list"
	}
	
	def list() {
		log.info("List all people");
		def personList = Person.list();
		[ personList : personList ]
	}
	
	def show() {
		log.info("Show person with id");
		def person = Person.get(params.id);
		[person : person]
	}
}
