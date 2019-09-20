package com.arahansa.account

import com.arahansa.account.data.AccountRegisterReq
import com.arahansa.account.domain.Account

interface AccountService {

    fun register(req: AccountRegisterReq)

    fun quit(account: Account)
}