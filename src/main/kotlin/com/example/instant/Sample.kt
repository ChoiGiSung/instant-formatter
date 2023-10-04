package com.example.instant

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.Instant

data class Sample(
    @JsonDeserialize(using = StringDateInstantDeserializer::class)
    val date: Instant
)

