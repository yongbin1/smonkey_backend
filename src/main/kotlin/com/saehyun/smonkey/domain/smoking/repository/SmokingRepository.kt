package com.saehyun.smonkey.domain.smoking.repository

import com.saehyun.smonkey.domain.smoking.entity.Smoking
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SmokingRepository : CrudRepository<Smoking, Long> {

    fun findByUserId(
        userId: Long
    ): Smoking?
}
