package com.project.smonkey.domain.feed.exception

import com.project.smonkey.global.exception.GlobalException

object NotMyFeedException : GlobalException(com.project.smonkey.domain.feed.exception.error.FeedErrorCode.NOT_MY_FEED) {
    val EXCEPTION = com.project.smonkey.domain.feed.exception.NotMyFeedException
}
