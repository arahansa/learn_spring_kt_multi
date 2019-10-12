package com.arahansa.account

import com.arahansa.account.data.AccountRegisterReq
import com.arahansa.account.domain.Account
import com.arahansa.account.dto.AccountForm

interface AccountService {
    fun create(form: AccountForm)
    fun update(form: AccountForm)

    fun quit(account: Account)
}