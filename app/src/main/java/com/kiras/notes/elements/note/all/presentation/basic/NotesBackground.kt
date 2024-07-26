package com.kiras.notes.elements.note.all.presentation.basic

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.kiras.notes.R

@Composable
fun NotesBackground(
    onSearchClick: () -> Unit,
    onWriteClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            modifier = Modifier
                .fillMaxSize(),
            painter = painterResource(id = R.drawable.notes_bg),
            contentScale = ContentScale.Crop,
            contentDescription = stringResource(id = R.string.notes_bg_description),
        )
        NotesElements(
            onSearchClick = onSearchClick,
            onWriteClick = onWriteClick
        )
    }
}