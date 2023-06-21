package com.project.smonkey.domain.journal.domain.repository

import com.project.smonkey.domain.journal.domain.Journal
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDateTime

interface JournalRepository: JpaRepository<Journal, Long> {

    fun existsByDate(date: LocalDateTime): Boolean

    fun getByDate(date: LocalDateTime): Journal

}
