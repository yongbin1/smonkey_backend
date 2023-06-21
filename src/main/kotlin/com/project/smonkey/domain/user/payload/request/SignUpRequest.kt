package com.project.smonkey.domain.user.payload.request

import java.time.LocalDateTime

data class SignUpRequest(
    val accountId: String,
    val password: String,
    val name: String,
    val email: String,
    val age: Int,
    val amount: Int,
    val price: Int,
    val smokingDate: LocalDateTime,
    val noSmokingDate: LocalDateTime,
    val reason: String,
)
