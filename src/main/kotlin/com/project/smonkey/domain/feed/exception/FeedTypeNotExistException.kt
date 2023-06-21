package com.project.smonkey.domain.feed.exception

import com.project.smonkey.global.exception.GlobalException

object FeedTypeNotExistException : GlobalException(com.project.smonkey.domain.feed.exception.error.FeedErrorCode.FEED_TYPE_NOT_EXIST) {
    val EXCEPTION = com.project.smonkey.domain.feed.exception.FeedTypeNotExistException
}
