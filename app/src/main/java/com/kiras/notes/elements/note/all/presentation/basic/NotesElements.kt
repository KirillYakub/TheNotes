package com.kiras.notes.elements.note.all.presentation.basic

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.kiras.notes.R
import com.kiras.notes.elements.note.all.presentation.NotesListViewModel
import com.kiras.notes.elements.note.all.presentation.components.NotesTopBar

@Composable
fun NotesElements(
    onSearchClick: () -> Unit,
    onWriteClick: () -> Unit
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            NotesTopBar(onSearchClick = onSearchClick)
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    onWriteClick.invoke()
                }
            ) {
                Icon(
                    imageVector = Icons.Default.Create, 
                    contentDescription = stringResource(id = R.string.new_note)
                )
            }
        },
        containerColor = Color.Transparent
    ) { scaffoldPaddings ->
        val viewModel: NotesListViewModel = hiltViewModel()
        val notesList by viewModel.notesState
        if(notesList.isNotEmpty()) {
            LazyColumn(
                modifier = Modifier
                    .padding(scaffoldPaddings)
                    .padding(horizontal = 20.dp),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                items(
                    items = notesList,
                    key = { note -> note._id.toString() }
                ) { note ->
                    Column {
                        Text(text = note.title)
                        Text(text = note.description)
                    }
                }
            }
        }
        else
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Notes list is empty")
            }
    }
}