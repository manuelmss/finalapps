package com.manuel.evafinal.ui.fragments.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manuel.evafinal.data.repository.NoteRepository
import com.manuel.evafinal.data.repository.NoteServiceResult
import com.manuel.evafinal.model.Note
import com.manuel.evafinal.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NoteListViewModel: ViewModel() {
    val notes: MutableLiveData<List<Note>> = MutableLiveData<List<Note>>()
    val repository = NoteRepository()

    fun getAllNotes() {
        val noteList = getData()
        notes.value = noteList
    }

    fun getNotesFromService() {
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getNotes()
            when(response) {
                is NoteServiceResult.Success -> {
                    notes.postValue(response.data.album)
                }
                is NoteServiceResult.Error -> {
                    //
                }
            }
        }
    }
}