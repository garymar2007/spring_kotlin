package com.gary.blog.service

import com.gary.blog.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService (private val repository: ArticleRepository) {
    fun findAllByOrderByAddedAtDesc() = repository.findAllByOrderByAddedAtDesc()
    fun findBySlug(slug: String) = repository.findBySlug(slug)
}