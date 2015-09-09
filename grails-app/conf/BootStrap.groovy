import org.ravishingme.Person
import org.ravishingme.Role
import org.ravishingme.User
import org.ravishingme.UserRole

class BootStrap {
	def springSecurityService
	
    def init = { servletContext ->
		def userRole = Role.findByAuthority('ROLE_USER') ?: new Role(authority: 'ROLE_USER').save(failOnError: true)
		def userUser = User.findByUsername('user') ?: new User(
			username: 'user',
			password: 'password',
			enabled: true).save(failOnError: true)

		if (!userUser.authorities.contains(userRole)) {
			UserRole.create userUser, userRole
		}
		
		if (!Person.count()) {
            new Person(firstName: "fname1").save(failOnError: true)
            new Person(firstName: "fname2").save(failOnError: true)
            new Person(firstName: "fname3").save(failOnError: true)
            new Person(firstName: "fname4").save(failOnError: true)
            new Person(firstName: "fname5").save(failOnError: true)
            new Person(firstName: "fname6").save(failOnError: true)
            new Person(firstName: "fname7").save(failOnError: true)
            new Person(firstName: "fname8").save(failOnError: true)
            new Person(firstName: "fname9").save(failOnError: true)
        }
		
		
    }
    def destroy = {
    }
}
