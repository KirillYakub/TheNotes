package com.kiras.notes.nav.routes.nested

import com.kiras.notes.nav.routes.nested.NestedRoutesNames.NOTES_ROUTE
import com.kiras.notes.nav.routes.nested.NestedRoutesNames.TASKS_ROUTE
import com.kiras.notes.nav.routes.nested.NestedRoutesNames.WELCOME_ROUTE

sealed class NestedScreenRoutes(val route: String) {
    data object Welcome : NestedScreenRoutes(route = WELCOME_ROUTE)
    data object Notes : NestedScreenRoutes(route = NOTES_ROUTE)
    data object Tasks : NestedScreenRoutes(route = TASKS_ROUTE)
}