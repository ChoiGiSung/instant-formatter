package com.example.instant

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InstantApplication

fun main(args: Array<String>) {
	runApplication<InstantApplication>(*args)
}
