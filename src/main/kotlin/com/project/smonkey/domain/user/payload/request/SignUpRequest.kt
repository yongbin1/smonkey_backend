package com.project.smonkey.domain.user.payload.request

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDateTime

data class SignUpRequest(
    val accountId: String,
    val password: String,
    val name: String,
    val email: String,
    val age: Int,
    val amount: Int,
    val price: Int,
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm")
    val smokingDate: LocalDateTime,
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm")
    val noSmokingDate: LocalDateTime,
    val reason: String,
    val cigaretteAmount: Int,
    val sMonkeyName: String,
    val backgroundColor: String,
)
