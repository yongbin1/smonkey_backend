package com.project.smonkey.domain.user.entity

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class User(
    val accountId: String,
    val password: String,
    val name: String,
    val email: String,
    val age: Int,
    val amount: Int,
    val price: Int,
    val smokingDate: LocalDateTime,
    val noSmokingDate: LocalDateTime,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
}
