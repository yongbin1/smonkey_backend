package com.project.smonkey.domain.feed.exception

import com.project.smonkey.global.exception.GlobalException

object FeedNotFoundException : GlobalException(com.project.smonkey.domain.feed.exception.error.FeedErrorCode.POST_NOT_FOUND) {
    val EXCEPTION = com.project.smonkey.domain.feed.exception.FeedNotFoundException
}
