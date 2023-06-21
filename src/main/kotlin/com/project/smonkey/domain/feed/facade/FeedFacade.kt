package com.project.smonkey.domain.feed.facade

interface FeedFacade {

    fun getFeedById(feedId: Long): com.project.smonkey.domain.feed.entity.Feed

    fun getFeedAll(): List<com.project.smonkey.domain.feed.entity.Feed>

    fun saveFeed(feed: com.project.smonkey.domain.feed.entity.Feed)

    fun deleteFeedById(feed: com.project.smonkey.domain.feed.entity.Feed)
}
