package com.kiras.notes.elements.note.domain.model

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

open class Notes : RealmObject {
    @PrimaryKey
    var _id: ObjectId = ObjectId.invoke()
    var title: String = ""
    var description: String = ""

}
