package com.arahansa.account.domain

class AccountDetail : BaseEntity()(
        var addr1: String,
        var addr2: String,
        var phoneNumber: String,
        var smsRecv: Boolean,
        var emailRecv: Boolean
){

}