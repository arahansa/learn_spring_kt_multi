package com.arahansa.account

import com.arahansa.account.domain.Account
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * 어카운트 관련 api
 */
@RestController
@RequestMapping("/account")
class AccountApi {

    @GetMapping("/", "")
    fun list(model:Model): List<Account>{
        val a = Account("arahansa")
        return listOf(a)
    }
}