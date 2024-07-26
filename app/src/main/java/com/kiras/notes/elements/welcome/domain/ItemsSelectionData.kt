package com.kiras.notes.elements.welcome.domain

import com.kiras.notes.R

data class ItemsSelectionData (
    val imageRes: Int,
    val imageDescription: Int,
    val title: Int,
    val text: Int,
) {
    companion object {
        val selectionList = listOf(
            ItemsSelectionData(
                R.drawable.welcome_selection_note,
                R.string.note_icon_description,
                R.string.notes,
                R.string.notes_about
            ),
            ItemsSelectionData(
                R.drawable.welcome_selection_task,
                R.string.tasks_icon_description,
                R.string.tasks,
                R.string.tasks_about
            )
        )
    }
}