package com.project.smonkey.domain.smonkey.service

import com.project.smonkey.domain.smonkey.facade.SMonkeyFacade
import com.project.smonkey.domain.smonkey.mapper.levelToNextMaxPoint
import com.project.smonkey.domain.smonkey.mapper.pointToCurrentPoint
import com.project.smonkey.domain.smonkey.mapper.toLevel
import com.project.smonkey.domain.smonkey.mapper.toStep
import com.project.smonkey.domain.smonkey.payload.response.GetSMonkeyResponse
import com.project.smonkey.domain.user.facade.UserFacade
import com.project.smonkey.global.payload.BaseResponse
import org.springframework.stereotype.Service

@Service
class GetSMonkeyService(
    private val sMonkeyFacade: SMonkeyFacade,
    private val userFacade: UserFacade,
) {

    fun getMonkey(): BaseResponse<GetSMonkeyResponse> {
        val user = userFacade.getCurrentUser()
        val smonkey = sMonkeyFacade.getSMonkeyById(
            userId = user.id,
        )

        val level = smonkey.point.toLevel()

        val getSMonkeyResponse = GetSMonkeyResponse(
            userName = user.name,
            smonkeyName = smonkey.name,
            backgroundColor = smonkey.backgroundColor,
            level = level,
            step = level.toStep(),
            point = smonkey.point.pointToCurrentPoint(),
            nextPoint = level.levelToNextMaxPoint(),
        )

        return BaseResponse(
            status = 201,
            message = GetSMonkeySuccessMessage,
            content = getSMonkeyResponse,
        )
    }

    companion object {
        const val GetSMonkeySuccessMessage = "success to get smonkey"
    }
}
