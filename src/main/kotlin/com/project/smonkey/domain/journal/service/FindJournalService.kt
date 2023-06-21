package com.project.smonkey.domain.journal.service

import com.project.smonkey.domain.journal.domain.repository.JournalRepository
import com.project.smonkey.domain.journal.exception.NotMyJournalException
import com.project.smonkey.domain.journal.presentation.dto.response.JournalResponse
import com.project.smonkey.domain.user.facade.UserFacade
import com.project.smonkey.global.payload.BaseResponse
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class FindJournalService(
    private val userFacade: UserFacade,
    private val journalRepository: JournalRepository
) {

    fun execute(
        date: LocalDateTime
    ): BaseResponse<JournalResponse> {
        val author = userFacade.getCurrentUser()
        val journal = journalRepository.getByDate(date)

        if (journal.author != author) {
            throw NotMyJournalException
        }

        return BaseResponse(
            status = 200,
            message = "success get journal",
            content = JournalResponse(
                title = journal.title,
                content = journal.content,
                date = journal.date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
                userName = journal.author.name
            )
        )
    }

}
