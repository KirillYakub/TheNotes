package com.kiras.notes.elements.note.all.repository

import com.kiras.notes.elements.note.domain.model.Notes
import kotlinx.coroutines.flow.Flow

interface MongoNotesRep {

    suspend fun getAllNotes(): Flow<List<Notes>>
}