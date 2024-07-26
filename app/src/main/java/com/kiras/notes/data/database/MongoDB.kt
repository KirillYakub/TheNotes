package com.kiras.notes.data.database

import com.kiras.notes.elements.note.domain.model.Notes
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

object MongoDB {

    private lateinit var realm: Realm

    fun getRealm(): Realm {
        if(!::realm.isInitialized) {
            realm = Realm.open(
                configuration = RealmConfiguration.create(
                    schema = setOf(
                        Notes::class
                    )
                )
            )
        }
        return realm
    }
}