package com.manuel.evafinal.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private val retrofit: Retrofit =
        Retrofit.Builder().baseUrl("https://theaudiodb.com/api/v1/json/2/").addConverterFactory(
            GsonConverterFactory.create()).build()
    val noteService: NoteService = retrofit.create(NoteService::class.java)
}