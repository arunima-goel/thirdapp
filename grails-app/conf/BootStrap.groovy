import org.ravishingme.Person
import org.ravishingme.Role
import org.ravishingme.User
import org.ravishingme.UserRole
import org.ravishingme.Profile
import org.ravishingme.Service

class BootStrap {
	def springSecurityService

	def init = { servletContext ->
		def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
		def fbUserRole = Role.findByAuthority('ROLE_FACEBOOK') ?: new Role(authority: 'ROLE_FACEBOOK').save(failOnError: true)
		

//		def samples = [
//			[username: "first@first.com", password: "password", firstName: "fname1", lastName: "lname1"] 
//			: [username: "fname1lname1", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				 baseLocation: "Delhi", createDate: new Date(),
//				  phoneNumber: "12345678", businessHours: "hours",
//				  startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				  isArtist: false, socialNetworks: "facebook"],
//			[username: "second@second.com", password: "password", firstName: "fname2", lastName: "lname2"]
//			: [username: "fname2lname2", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				 baseLocation: "Delhi", createDate: new Date(),
//				  phoneNumber: "12345678", businessHours: "hours",
//				  startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				  isArtist: false, socialNetworks: "facebook"],,
//			[username: "third@third.com", password: "password", firstName: "fname3", lastName: "lname3"]
//			: [username: "fname3lname3", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				 baseLocation: "Delhi", createDate: new Date(),
//				  phoneNumber: "12345678", businessHours: "hours",
//				  startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				  isArtist: false, socialNetworks: "facebook"],
//			[username: "fourth@fourth.com", password: "password", firstName: "fname4", lastName: "lname4"]
//			: [username: "fname4lname4", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				 baseLocation: "Delhi", createDate: new Date(),
//				  phoneNumber: "12345678", businessHours: "hours",
//				  startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				  isArtist: false, socialNetworks: "facebook"],
//			[username: "fifth@fifth.com", password: "password", firstName: "fname5", lastName: "lname5"]
//			: [username: "fname5lname5", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				 baseLocation: "Delhi", createDate: new Date(),
//				  phoneNumber: "12345678", businessHours: "hours",
//				  startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				  isArtist: false, socialNetworks: "facebook"],
//			[username: "sixth@sixth.com", password: "password", firstName: "fname6", lastName: "lname6"]
//			: [username: "fname6lname6", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				 baseLocation: "Delhi", createDate: new Date(),
//				  phoneNumber: "12345678", businessHours: "hours",
//				  startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				  isArtist: false, socialNetworks: "facebook"],
//			[username: "seventh@seventh.com", password: "password", firstName: "fname7", lastName: "lname7"]
//			: [username: "fname7lname7", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				 baseLocation: "Delhi", createDate: new Date(),
//				  phoneNumber: "12345678", businessHours: "hours",
//				  startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				  isArtist: false, socialNetworks: "facebook"],
//			[username: "eighth@eighth.com", password: "password", firstName: "fname8", lastName: "lname8"]
//			: [username: "fname8lname8", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				 baseLocation: "Delhi", createDate: new Date(),
//				  phoneNumber: "12345678", businessHours: "hours",
//				  startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				  isArtist: false, socialNetworks: "facebook"],
//			[username: "ninth@ninth.com", password: "password", firstName: "fname9", lastName: "lname9"]
//			: [username: "fname9lname9", aboutYou: "Test about you", locationsServed: "Delhi, Chandigarh",
//				baseLocation: "Delhi", createDate: new Date(),
//				 phoneNumber: "12345678", businessHours: "hours",
//				 startingPrice: 1000.00, accomplishments: "Test accomplishments", yearsOfExperience: 3,
//				 isArtist: false, socialNetworks: "facebook"]
//		]
//
//		samples.each { personAttrs, profileAttrs ->
//
//			def personUser = Person.findByUsername(personAttrs.username) ?: new Person(personAttrs)
//						
//			def personProfile = new Profile(profileAttrs)
//			personProfile.person = personUser
//			personProfile.lastUpdated = new Date()
//			personProfile.modesOfPayment = ['Cash', 'Cheque'] as String[]
//			personProfile.cosmeticBrands = ['Brand1', 'Brand2'] as String[]
//			personProfile.specialities = ['Speciality1', 'Speciality2'] as String[]
//			
//			def profileService = new Service()
//			profileService.serviceGroup = "Service Group"
//			profileService.serviceName = "Service Name"
//			profileService.price = 10.22
//			profileService.profile = personProfile
//			profileService.save(failOnError:true)
//			
//			personProfile.addToServices(profileService)
//			personProfile.save(failOnError:true)
//			
//			
//			
//			personUser.profile = personProfile
//			if (Person.findByUsername("first@first.com")) {
//				personUser.addToFavorites(Person.findByUsername("first@first.com"))
//			}
//			
//			personUser.save(failOnError:true);
//			
//			if (!personUser.authorities.contains(userRole)) {
//				UserRole.create personUser, userRole
//			}
//		}
//		
		

	}
	def destroy = {
	}
}
