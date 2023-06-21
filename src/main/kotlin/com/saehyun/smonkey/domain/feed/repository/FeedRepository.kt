package com.saehyun.smonkey.domain.feed.repository

import com.saehyun.smonkey.domain.feed.entity.Feed
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface FeedRepository : CrudRepository<com.saehyun.smonkey.domain.feed.entity.Feed, Long> {
    override fun findAll(): List<com.saehyun.smonkey.domain.feed.entity.Feed>
}
