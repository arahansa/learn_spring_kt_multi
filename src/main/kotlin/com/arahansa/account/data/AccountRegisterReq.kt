package com.arahansa.account.data

import org.hibernate.validator.constraints.Length
import javax.validation.Constraint
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext
import javax.validation.Payload
import javax.validation.constraints.Email
import javax.validation.constraints.NotBlank
import kotlin.reflect.KClass

/**
 * 아이디(email), 비밀번호, 비밀번호확인,
 * 이름, 주소 (addr1, addr2, 우편번호),
 *
 * 일반전화, 휴대전화,
 *
 * SMS수신여부, 이메일수신여부,
 *
 * 유저에게는 안 보이는 화면 회원등급, 회원상태(가입한,탈퇴한)
 */
@StringMatch(first="password", second = "passwordConfirm")
data class AccountRegisterReq (
        /*------ 기본 정보 ------ */
        @NotBlank
        @Length(max = 50)
        @Email
        val email: String? = null,

        @NotBlank
        @Length(min = 8, max = 20)
        val password: String? = null,

        @NotBlank
        val passwordConfirm: String? = null,

        /*------ 신상 정보 ------ */

        @NotBlank
        @Length(max = 10)
        val name: String? = null,

        @Length(max = 20)
        val phoneNumber: String? = null,

        @Length(max = 100)
        val addr1: String? = null,

        @Length(max = 100)
        val addr2: String? = null,

        @Length(max = 10)
        val postcode: String? = null,

        /*------ 동의 여부 등등 ------ */

        val smsRecv: Boolean = false,

        val emailRecv: Boolean = false){

}

@Target(AnnotationTarget.TYPE, AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [StringMatchValidator::class])
annotation class StringMatch(
    val message : String = "",
    val groups: Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>> = [],

    val first: String = "first",
    val second: String = "second"
)

class StringMatchValidator : ConstraintValidator<StringMatch, Any>{
    override fun isValid(value: Any?, context: ConstraintValidatorContext?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

