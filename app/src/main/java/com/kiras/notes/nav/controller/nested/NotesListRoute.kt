package com.kiras.notes.nav.controller.nested

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.kiras.notes.nav.routes.nested.NestedScreenRoutes
import com.kiras.notes.nav.routes.notes.NotesScreenRoutes
import com.kiras.notes.elements.note.all.presentation.basic.NotesBackground
import com.kiras.notes.elements.note.write.presentation.NotesWrite
import com.kiras.notes.elements.note.write.presentation.NotesWriteViewModel

fun NavGraphBuilder.notesListRoute(controller: NavController) {
    navigation(
        startDestination = NotesScreenRoutes.NotesList.route,
        route = NestedScreenRoutes.Notes.route
    ) {
        composable(route = NotesScreenRoutes.NotesList.route) {
            NotesBackground(
                onSearchClick = {

                },
                onWriteClick = {
                    controller.navigate(NotesScreenRoutes.NoteEdit.route)
                }
            )
        }
        composable(route = NotesScreenRoutes.NoteEdit.route) {
            val viewModel: NotesWriteViewModel = hiltViewModel()
            NotesWrite(
                onNewNote = { newNote ->
                    viewModel.insertNote(
                        newNote,
                        onSaveSuccess = {
                            controller.popBackStack()
                        }
                    )
                }
            )
        }
    }
}