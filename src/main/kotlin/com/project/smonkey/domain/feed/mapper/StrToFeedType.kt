package com.project.smonkey.domain.feed.mapper

internal fun String.toFeedType(): com.project.smonkey.domain.feed.enum.FeedType {

    for (feedType in com.project.smonkey.domain.feed.enum.FeedType.values()) {
        if (feedType.toString() == this) return feedType
    }

    throw com.project.smonkey.domain.feed.exception.FeedTypeNotExistException
}
