package com.kiras.notes.elements.note.all.repository

import android.util.Log
import com.kiras.notes.data.database.MongoDB.getRealm
import com.kiras.notes.elements.note.domain.model.Notes
import io.realm.kotlin.Realm
import io.realm.kotlin.ext.query
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MongoNotesRepImpl : MongoNotesRep {

    private val realm: Realm = getRealm()

    override suspend fun getAllNotes(): Flow<List<Notes>> {
        return realm.query<Notes>()
            .asFlow()
            .map { result ->
                result.list.toList()
            }
    }
}