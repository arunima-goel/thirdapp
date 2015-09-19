package org.ravishingme

class Person extends User {
	String firstName
	String lastName
	
	static transients = ['displayName']
	String getDisplayName() { firstName + " " + lastName }
	
	static hasMany = [favorites: Person]
	static hasOne = [profile: Profile]
	
	static constraints = {
		firstName blank:false, nullable:false
		lastName blank:false, nullable:false
	}
	
	Person(String username, String password, String firstName, String lastName) {
		super(username, password);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
