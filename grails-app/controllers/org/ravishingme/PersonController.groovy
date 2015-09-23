package org.ravishingme

import grails.plugin.springsecurity.annotation.Secured;
import org.scribe.model.Token
import uk.co.desirableobjects.oauth.scribe.OauthService

class PersonController {
	OauthService oauthService
	
	@Secured(['ROLE_USER'])
	def index() {
		redirect action:"list"
	}
	
	def list() {
		log.info("List all people");
		def personList = Person.list();
		[ personList : personList ]
	}
	
	def loginSuccess() {
		log.info("fb login success");
		
		log.info("List all people");
		Map data 
		Token facebookAccessToken = (Token) session[oauthService.findSessionKeyForAccessToken('facebook')]
        if (facebookAccessToken) {
			data = [name: "test name", last_name: "test last name", success: "true"]
			//            def facebookResource = oauthService.getFacebookResource(facebookAccessToken, "https://graph.facebook.com/me")
//            def facebookResponse = JSON.parse(facebookResource?.getBody())
//
//            Map data = [id: facebookResponse.id, username: facebookResponse.username, name: facebookResponse.name, email: facebookResponse.email,
//                    first_name: facebookResponse.first_name, last_name: facebookResponse.last_name, birthday: facebookResponse.birthday,
//                    gender: facebookResponse.gender, link: facebookResponse.link, work: facebookResponse.work, hometown: facebookResponse.hometown,
//                    education: facebookResponse.education]
//
//            [data: data]
        } else {
			data = [name: "test name", last_name: "test last name", success: "false"]
//            flash.error = "Token not found."
//            render view: '/index'
        }
		[data : data]
	}
	
	def show() {
		log.info("Show person with id");
		def person = Person.get(params.id);
		[person : person]
	}
}
