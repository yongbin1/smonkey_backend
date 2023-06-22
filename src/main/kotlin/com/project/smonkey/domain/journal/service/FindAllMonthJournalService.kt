package com.project.smonkey.domain.journal.service

import com.project.smonkey.domain.journal.domain.repository.JournalRepository
import com.project.smonkey.domain.journal.presentation.dto.response.JournalListResponse
import com.project.smonkey.domain.user.facade.UserFacade
import com.project.smonkey.global.payload.BaseResponse
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class FindAllMonthJournalService(
    private val userFacade: UserFacade,
    private val journalRepository: JournalRepository,
) {

    @Transactional
    fun execute(
        month: Int,
    ): BaseResponse<JournalListResponse> {
        val user = userFacade.getCurrentUser()

        var days = 0
        if (month == 2) {
            days = 27
        } else {
            days = if (month < 8) {
                if (month % 2 == 0) 30 else 31
            } else {
                if (month % 2 == 0) 31 else 30
            }
        }

        return BaseResponse(
            status = 200,
            message = "success find journal data",
            content = null
        )
    }

}
