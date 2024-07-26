package com.kiras.notes.elements.note.write.repository

import com.kiras.notes.data.database.MongoDB.getRealm
import com.kiras.notes.elements.note.all.repository.MongoNotesRep
import com.kiras.notes.elements.note.domain.model.Notes
import io.realm.kotlin.Realm
import io.realm.kotlin.ext.query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MongoNoteWriteRepImpl : MongoNoteWriteRep {

    private val realm: Realm = getRealm()

    override suspend fun insertNote(notes: Notes) {
        realm.write {
            copyToRealm(notes)
        }
    }
}