package com.dicoding.aplikasiberitakorupsi.di

import android.content.Context
import com.dicoding.aplikasiberitakorupsi.data.NewsRepository
import com.dicoding.aplikasiberitakorupsi.data.local.room.NewsDatabase
import com.dicoding.aplikasiberitakorupsi.data.remote.retrofit.ApiConfig

object Injection {
    fun provideRepository(context: Context): NewsRepository {
        val apiService = ApiConfig.getApiService()
        val database = NewsDatabase.getInstance(context)
        val dao = database.newsDao()
        return NewsRepository.getInstance(apiService, dao)
    }
}