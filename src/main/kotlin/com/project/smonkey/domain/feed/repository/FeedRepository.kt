package com.project.smonkey.domain.feed.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface FeedRepository : CrudRepository<com.project.smonkey.domain.feed.entity.Feed, Long> {
    override fun findAll(): List<com.project.smonkey.domain.feed.entity.Feed>
}
