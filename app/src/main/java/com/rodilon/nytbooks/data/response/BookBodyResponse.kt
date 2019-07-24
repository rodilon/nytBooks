package com.rodilon.nytbooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookBodyResponse(
    @Json(name = "results") val bookResults: List<BookResultResponse>
)

@JsonClass(generateAdapter = true)
data class BookResultResponse(
    @Json(name = "book_details") val bookDetailsResponse: List<BookDetailsResponse>
)

@JsonClass(generateAdapter = true)
data class BookDetailsResponse(
    @Json(name = "author") val author: String,
    @Json(name = "title") val title: String,
    @Json(name = "description") val description: String
)