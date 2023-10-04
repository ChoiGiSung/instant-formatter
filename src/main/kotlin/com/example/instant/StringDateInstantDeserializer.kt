package com.example.instant

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

class StringDateInstantDeserializer : JsonDeserializer<Instant>() {
    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): Instant {
        val localDate = LocalDate.parse(p.text, DateTimeFormatter.ISO_DATE)
        return localDate.atStartOfDay(ZoneId.of("Asia/Seoul")).toInstant()
    }
}