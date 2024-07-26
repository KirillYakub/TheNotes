package com.kiras.notes.elements.note.all.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kiras.notes.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotesTopBar(onSearchClick: () -> Unit) {
    CenterAlignedTopAppBar(
        modifier = Modifier
            .padding(vertical = 15.dp),
        title = {
            Text(
                text = stringResource(id = R.string.notes),
                style = MaterialTheme.typography.titleSmall,
            )
        },
        actions = {
            IconButton(
                onClick = {
                    onSearchClick.invoke()
                }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.notes_search_loop),
                    contentDescription = stringResource(id = R.string.search_note),
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent
        )
    )
}