package com.manuel.evafinal.data.repository

import com.manuel.evafinal.data.response.ListNoteResponse
import com.manuel.evafinal.data.retrofit.RetrofitHelper

class NoteRepository {
    suspend fun getNotes(): NoteServiceResult<ListNoteResponse> {
        return try {
            val response = RetrofitHelper.noteService.getAllNotes()
            NoteServiceResult.Success(response)
        } catch (e: java.lang.Exception) {
            NoteServiceResult.Error(e)
        }
    }
}