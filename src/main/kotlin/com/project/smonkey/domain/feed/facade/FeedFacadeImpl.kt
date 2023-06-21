package com.project.smonkey.domain.feed.facade

import com.project.smonkey.domain.feed.repository.FeedRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class FeedFacadeImpl(
    private val feedRepository: FeedRepository,
) : com.project.smonkey.domain.feed.facade.FeedFacade {

    override fun getFeedById(feedId: Long): com.project.smonkey.domain.feed.entity.Feed {
        return feedRepository.findByIdOrNull(feedId) ?: throw com.project.smonkey.domain.feed.exception.FeedNotFoundException
    }

    override fun getFeedAll(): List<com.project.smonkey.domain.feed.entity.Feed> {
        return feedRepository.findAll()
    }

    override fun saveFeed(feed: com.project.smonkey.domain.feed.entity.Feed) {
        feedRepository.save(feed)
    }

    override fun deleteFeedById(feed: com.project.smonkey.domain.feed.entity.Feed) {
        feedRepository.delete(feed)
    }
}
