package com.saehyun.smonkey.domain.feed.mapper

import com.saehyun.smonkey.domain.feed.enum.FeedType
import com.saehyun.smonkey.domain.feed.exception.FeedTypeNotExistException

internal fun String.toFeedType(): com.saehyun.smonkey.domain.feed.enum.FeedType {

    for (feedType in com.saehyun.smonkey.domain.feed.enum.FeedType.values()) {
        if (feedType.toString() == this) return feedType
    }

    throw com.saehyun.smonkey.domain.feed.exception.FeedTypeNotExistException
}
