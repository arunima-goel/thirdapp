<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Render Domain</title>
</head>
<body>
<table>
<tr>
    <td>Actions</td>
    <td>Name</td>
</tr>
<g:each in="${personList}" var="person">
    <tr>
        <td>
            <g:link class="btn btn-small btn-inverse" action="edit" id="${person.id}">
                Edit
            </g:link>/
            <g:link class="btn btn-small btn-inverse" action="delete" id="${person.id}">
                Delete
            </g:link>
        </td>
        <td>
            <g:link class="btn btn-small btn-inverse" action="show" id="${person.id}">
                ${person.firstName} ${person.lastName}
            </g:link>
            Name: ${person.displayName} </br>
            Username: ${person.profile.username} </br>
            About You: ${person.profile.aboutYou} </br>
            Locations Served: ${person.profile.locationsServed} </br>
            Base Location: ${person.profile.baseLocation} </br>
            <g:each in="${person.profile.cosmeticBrands}" var="cosmeticBrand">
            	Cosmetic Brands: ${cosmeticBrand} </br>
            </g:each>
            <g:each in="${person.profile.specialities}" var="speciality">
            	Specialities: ${speciality} </br>
            </g:each>
            <g:each in="${person.profile.modesOfPayment}" var="modeOfPayment">
            	Modes of Payment: ${modeOfPayment} </br>
            </g:each>
            Phone: ${person.profile.phoneNumber} </br>
            Business Hours: ${person.profile.businessHours} </br>
            Starting Price: ${person.profile.startingPrice} </br>
            Accomplishments: ${person.profile.accomplishments} </br>
            Years of Experience: ${person.profile.yearsOfExperience} </br>
            Is Artist: ${person.profile.isArtist} </br>
            Social Networks: ${person.profile.socialNetworks} </br>
            <g:each in="${person.profile.services}" var="service">
            	Service - Service group: ${service.serviceGroup}, Service name: ${service.serviceName}, Price: ${service.price} </br>
            </g:each>
            
        </td>
    </tr>
</g:each>
</table>
<g:link class="btn btn-small btn-inverse" action="create">
    Create new person
</g:link>
</body>
</html>