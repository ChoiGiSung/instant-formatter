package com.example.instant

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @PostMapping("/sample")
    fun sample(@RequestBody sample: Sample): Sample {
        return sample
    }

    @PostMapping("/sample2")
    fun sample2(@RequestBody sample: Sample2): Sample2 {
        return sample
    }
}