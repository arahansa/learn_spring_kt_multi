package com.arahansa.account.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class AccountForm (
        @NotNull
        val id: Long,

        @NotBlank
        val name: String,

        @NotBlank
        val password: String,

        @NotBlank
        val passwordConfirm: String,
        val addr: String
) {
}