package com.saehyun.smonkey.domain.feed.facade

import com.saehyun.smonkey.domain.feed.entity.Feed
import com.saehyun.smonkey.domain.feed.repository.FeedRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class FeedFacadeImpl(
    private val feedRepository: FeedRepository,
) : com.saehyun.smonkey.domain.feed.facade.FeedFacade {

    override fun getFeedById(feedId: Long): com.saehyun.smonkey.domain.feed.entity.Feed {
        return feedRepository.findByIdOrNull(feedId) ?: throw com.saehyun.smonkey.domain.feed.exception.FeedNotFoundException
    }

    override fun getFeedAll(): List<com.saehyun.smonkey.domain.feed.entity.Feed> {
        return feedRepository.findAll()
    }

    override fun saveFeed(feed: com.saehyun.smonkey.domain.feed.entity.Feed) {
        feedRepository.save(feed)
    }

    override fun deleteFeedById(feed: com.saehyun.smonkey.domain.feed.entity.Feed) {
        feedRepository.delete(feed)
    }
}
