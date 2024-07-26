package com.kiras.notes.elements.welcome.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kiras.notes.R

@Composable
fun ItemsTitle() {
    Column {
        Text(
            text = stringResource(id = R.string.the_prefix),
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = stringResource(id = R.string.notes),
            style = MaterialTheme.typography.headlineLarge
        )
    }
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Spacer(
            modifier = Modifier
                .weight(0.8f)
                .height(5.dp)
        )
        Spacer(
            modifier = Modifier
                .weight(0.2f)
        )
    }
}