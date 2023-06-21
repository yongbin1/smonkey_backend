package com.saehyun.smonkey.domain.like.service

import com.saehyun.smonkey.domain.feed.facade.FeedFacade
import com.saehyun.smonkey.domain.like.entity.FeedLike
import com.saehyun.smonkey.domain.like.facade.LikeFacade
import com.saehyun.smonkey.domain.user.facade.UserFacade
import com.saehyun.smonkey.global.payload.BaseResponse
import org.springframework.stereotype.Service

@Service
class FeedLikeService(
    private val userFacade: UserFacade,
    private val feedFacade: FeedFacade,
    private val likeFacade: LikeFacade,
) {

    fun like(
        feedId: Long
    ): BaseResponse<Unit> {
        val user = userFacade.getCurrentUser()
        val feed = feedFacade.getFeedById(feedId)

        likeFacade.like(
            feedLike = FeedLike(
                user = user,
                feed = feed,
            )
        )

        return BaseResponse(
            status = 201,
            message = FEED_LIKE_SUCCESS,
            content = null,
        )
    }

    companion object {
        const val FEED_LIKE_SUCCESS = "success to like feed"
    }
}
