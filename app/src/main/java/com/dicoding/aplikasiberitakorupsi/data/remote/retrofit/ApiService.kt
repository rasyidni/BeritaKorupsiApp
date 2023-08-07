package com.dicoding.aplikasiberitakorupsi.data.remote.retrofit

import com.dicoding.aplikasiberitakorupsi.data.remote.response.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("everything?q=korupsi&from=2023-04-14&sortBy=publishedAt")
    suspend fun getNews(@Query("apiKey") apiKey: String): NewsResponse
}