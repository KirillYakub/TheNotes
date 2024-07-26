package com.kiras.notes.nav.controller

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.kiras.notes.R
import com.kiras.notes.nav.controller.nested.notesListRoute
import com.kiras.notes.nav.controller.nested.tasksListRoute
import com.kiras.notes.nav.routes.nested.NestedScreenRoutes
import com.kiras.notes.elements.welcome.presentation.basic.WelcomeBackground

@Composable
fun NavGraph(controller: NavHostController) {
    NavHost(
        modifier = Modifier
            .fillMaxSize(),
        navController = controller,
        startDestination = NestedScreenRoutes.Welcome.route
    ) {
        notesListRoute(controller)
        tasksListRoute(controller)
        composable(route = NestedScreenRoutes.Welcome.route) {
            WelcomeBackground(
                onCardElementClick = { resTitle ->
                    controller.navigate(
                        when (resTitle) {
                            R.string.notes -> NestedScreenRoutes.Notes.route
                            else -> NestedScreenRoutes.Notes.route
                        }
                    )
                }
            )
        }
    }
}