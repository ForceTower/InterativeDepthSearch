package dev.forcetower.search.elements

data class StateContext (
    val to: State,
    var depth: Int = 0,
    var previousContext: StateContext? = null,
    var success: Boolean = false
)