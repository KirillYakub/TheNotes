package com.kiras.notes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.kiras.notes.R

val typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.open_sans_medium)),
        fontSize = 72.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.open_sans_medium)),
        fontSize = 56.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.open_sans_medium)),
        fontSize = 40.sp
    ),
    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_medium)),
        fontSize = 32.sp
    ),
    titleMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_medium)),
        fontSize = 28.sp
    ),
    titleSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_medium)),
        fontSize = 24.sp
    ),
    labelLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 20.sp
    ),
    labelMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 16.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_regular)),
        fontSize = 12.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_light)),
        fontSize = 26.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_light)),
        fontSize = 22.sp
    ),
    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.roboto_light)),
        fontSize = 18.sp
    )
)