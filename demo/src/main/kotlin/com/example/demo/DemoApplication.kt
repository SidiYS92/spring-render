package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@RestController
class DemoController{
    

     @GetMapping("/")
    fun hello() : String {
        return "Welcome page of my first spring boot application"
    }

    @GetMapping("/hello")
    fun hello() : String {
        return "Hello from spring app "
    }
}