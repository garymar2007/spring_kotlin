package com.gary.blog.service

import com.gary.blog.entities.User
import com.gary.blog.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val repository: UserRepository) {
    fun findAll() = repository.findAll()
    fun findByLogin(id: String): User? = repository.findByLogin(id)
}