package com.saehyun.smonkey.domain.smoking.controller

import com.saehyun.smonkey.domain.smoking.payload.request.PostSmokingRequest
import com.saehyun.smonkey.domain.smoking.service.DeductedPointService
import com.saehyun.smonkey.domain.smoking.service.PostSmokingService
import com.saehyun.smonkey.global.payload.BaseResponse
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@Api(tags = ["금연 API"], description = "금연 API")
@RequestMapping("/smoking")
@RestController
class SmokingController(
    private val postSmokingService: PostSmokingService,
    private val deductedPointService: DeductedPointService,
) {

    @ApiOperation(value = "금연 정보 등록")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun postSmoking(
        @RequestBody request: PostSmokingRequest,
    ): BaseResponse<Unit> {
        return postSmokingService.postSmoking(
            request = request,
        )
    }

    @ApiOperation(value = "금연 실패")
    @PostMapping("/failed")
    fun deductedPoint(): BaseResponse<Unit> {
        return deductedPointService.pointDeducted()
    }
}
