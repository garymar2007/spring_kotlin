package com.gary.blog.controller

import com.gary.blog.repository.ArticleRepository
import com.gary.blog.repository.UserRepository
import com.gary.blog.service.ArticleService
import com.gary.blog.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/article")
class ArticleController(private val articalService: ArticleService) {
    @GetMapping("/")
    fun findAll() = articalService.findAllByOrderByAddedAtDesc()

    @GetMapping("/{slug}")
    fun findOne(@PathVariable slug: String) =
        articalService.findBySlug(slug) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "This article does not exist")

}

@RestController
@RequestMapping("/api/user")
class UserController(private val userService: UserService) {

    @GetMapping("/")
    fun findAll() = userService.findAll()

    @GetMapping("/{login}")
    fun findOne(@PathVariable login: String) = userService.findByLogin(login) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "This user does not exist")
}