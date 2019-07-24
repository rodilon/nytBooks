package com.rodilon.nytbooks.data

import com.rodilon.nytbooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface NYTService {
    @GET("lists.json")
    fun listRepos(
        @Query("api-key") apiKey: String = "no3KpOr0KhjV5PJGLFeKU0fCQ9cJm6rq",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}