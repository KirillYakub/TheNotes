package com.kiras.notes.elements.note.write.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kiras.notes.elements.note.domain.model.Notes
import com.kiras.notes.elements.note.write.repository.MongoNoteWriteRep
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class NotesWriteViewModel @Inject constructor(
    private val noteWriteRep: MongoNoteWriteRep
) : ViewModel() {

    fun insertNote(
        notes: Notes,
        onSaveSuccess: () -> Unit
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            noteWriteRep.insertNote(notes)
            withContext(Dispatchers.Main) {
                onSaveSuccess.invoke()
            }
        }
    }

}