package com.gary.blog

import com.gary.blog.config.BlogProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class SpringbootKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringbootKotlinApplication>(*args)
}
