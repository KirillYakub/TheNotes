package com.kiras.notes.elements.note.all.presentation

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kiras.notes.elements.note.domain.model.Notes
import com.kiras.notes.elements.note.all.repository.MongoNotesRep
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NotesListViewModel @Inject constructor(
    private val mongoNotesRep: MongoNotesRep
) : ViewModel() {

    var notesState: MutableState<List<Notes>> = mutableStateOf(emptyList())

    init {
        observeNotes()
    }

    private fun observeNotes() {
        viewModelScope.launch {
            mongoNotesRep.getAllNotes().collect { notesList ->
                notesState.value = notesList
            }
        }
    }
}