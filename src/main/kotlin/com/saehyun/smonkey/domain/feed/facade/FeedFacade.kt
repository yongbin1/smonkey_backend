package com.saehyun.smonkey.domain.feed.facade

import com.saehyun.smonkey.domain.feed.entity.Feed

interface FeedFacade {

    fun getFeedById(feedId: Long): com.saehyun.smonkey.domain.feed.entity.Feed

    fun getFeedAll(): List<com.saehyun.smonkey.domain.feed.entity.Feed>

    fun saveFeed(feed: com.saehyun.smonkey.domain.feed.entity.Feed)

    fun deleteFeedById(feed: com.saehyun.smonkey.domain.feed.entity.Feed)
}
