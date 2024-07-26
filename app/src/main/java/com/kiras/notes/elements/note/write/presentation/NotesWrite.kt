package com.kiras.notes.elements.note.write.presentation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.kiras.notes.elements.note.domain.model.Notes

@Composable
fun NotesWrite(onNewNote: (Notes) -> Unit) {
    Button(
        onClick = {
            onNewNote.invoke(
                Notes().apply {
                    this.title = "New note"
                    this.description = "New description"
                }
            )
        }
    ) {
        Text(text = "Add button")
    }
}