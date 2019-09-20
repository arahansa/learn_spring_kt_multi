package com.arahansa.account.domain

import javax.persistence.Column

class AccountDetail : BaseEntity() {
        @Column(length = 100)
        var addr1: String? = null
        @Column(length = 100)
        var addr2: String? = null
        @Column(length = 20)
        var phoneNumber: String? = null
        var smsRecv: Boolean = false
        var emailRecv: Boolean = false



}