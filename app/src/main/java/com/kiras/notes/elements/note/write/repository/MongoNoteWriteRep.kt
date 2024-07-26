package com.kiras.notes.elements.note.write.repository

import com.kiras.notes.elements.note.domain.model.Notes
import kotlinx.coroutines.flow.Flow

interface MongoNoteWriteRep {

    suspend fun insertNote(notes: Notes)
}