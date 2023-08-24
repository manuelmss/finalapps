package com.manuel.evafinal.data.retrofit

import com.manuel.evafinal.data.response.ListNoteResponse
import retrofit2.http.GET

interface NoteService {
    @GET("discography.php?s=coldplay")
    suspend fun getAllNotes(): ListNoteResponse
}