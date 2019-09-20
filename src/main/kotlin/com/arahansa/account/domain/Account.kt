package com.arahansa.account.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

/**
 * 계정 클래스
 */
@Entity
class Account(
        @Column(length=40, nullable = false)
        val email: String,

        @Column(length = 200, nullable = false)
        var password: String
) : BaseEntity()