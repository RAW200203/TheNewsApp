package com.example.thenewsflash.api

import com.example.thenewsflash.models.NewsResponse
import com.example.thenewsflash.util.Constance.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPI {
    //request

    @GET("v2/top-headlines")
        suspend fun getHeadLines(
            @Query("country")
            countryCode: String = "es",
            @Query("page")
            pageNumber: Int = 1,
            @Query("apiKey")
            apiKey: String = API_KEY
        ):Response<NewsResponse>

        @GET("v2/everything")
        suspend fun searchForNews(
            @Query("q")
            searchQuery: String,
            @Query("page")
            pageNumber: Int = 1,
            @Query("apiKey")
            apikey: String = API_KEY
        ): Response<NewsResponse>

}