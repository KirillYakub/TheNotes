package com.kiras.notes.nav.routes.notes

import com.kiras.notes.nav.routes.notes.NotesRoutesNames.NOTES_LIST
import com.kiras.notes.nav.routes.notes.NotesRoutesNames.NOTE_EDIT

sealed class NotesScreenRoutes(val route: String) {
    data object NotesList : NotesScreenRoutes(route = NOTES_LIST)
    data object NoteEdit : NotesScreenRoutes(route = NOTE_EDIT)
}