package com.arahansa.account

import com.arahansa.account.domain.Account
import com.arahansa.account.dto.AccountForm
import com.arahansa.core.loggerFor
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/account")
class AccountController(@Autowired val accountService: AccountService) {

    val log = loggerFor(AccountController::class.java)

    @GetMapping("/list")
    fun list(model: Model): String {
        log.info("hi~~")
        return "account/list"
    }

    @GetMapping("/form")
    fun form(@ModelAttribute("form") accountForm: AccountForm): String {
        return "account/form"
    }

    @PostMapping("/form")
    fun postForm(@Validated @ModelAttribute("form") form: AccountForm, bindingResult: BindingResult): String {
        if (bindingResult.hasErrors()) {
            return "account/form"
        }
        accountService.create(form)
        return "redirect:/account/list"
    }

    @GetMapping("/{account}")
    fun readAccount(@PathVariable account: Account, model: Model): String{
        model.addAttribute("readObj", account)
        return "account/read"
    }

    @GetMapping("/form/{account}")
    fun edit(@PathVariable account:Account, model: Model): String {
        model.addAttribute("form", account)
        return "account/edit"
    }

    @PostMapping("/form/{account}1")
    fun postEdit(form: AccountForm, bindingResult: BindingResult): String{
        if (bindingResult.hasErrors()) {
            log.debug("binding result : {}", bindingResult)
            return "account/form"
        }
        accountService.update(form)
        return "redirect:read/"
    }




}