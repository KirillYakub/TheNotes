package com.kiras.notes.elements.welcome.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.kiras.notes.elements.welcome.domain.ItemsSelectionData.Companion.selectionList

@Composable
fun ItemsSelection(onCardElementClick: (Int) -> Unit) {
    selectionList.forEach { noteType ->
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onCardElementClick.invoke(noteType.title)
                },
            shape = CircleShape,
            elevation = CardDefaults.cardElevation(
                defaultElevation = 5.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.inverseSurface,
            )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                horizontalArrangement = Arrangement.spacedBy(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = noteType.imageRes),
                    contentDescription = stringResource(id = noteType.imageDescription)
                )
                Column {
                    Text(
                        text = stringResource(id = noteType.title),
                        style = MaterialTheme.typography.titleSmall,
                    )
                    Text(
                        text = stringResource(id = noteType.text),
                        style = MaterialTheme.typography.labelLarge,
                    )
                }
            }
        }
    }
}