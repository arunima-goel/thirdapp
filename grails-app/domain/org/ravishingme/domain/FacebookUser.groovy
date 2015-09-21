package org.ravishingme.domain

import org.ravishingme.User

class FacebookUser {

    Long uid
    String accessToken
    Date accessTokenExpires

    static belongsTo = [user: User]

    static constraints = {
        uid unique: true
    }
}
