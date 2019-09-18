package com.arahansa.account.domain

import javax.persistence.GeneratedValue
import javax.persistence.Id

open class BaseEntity {
    @Id
    @GeneratedValue
    var id: Long? = null
}