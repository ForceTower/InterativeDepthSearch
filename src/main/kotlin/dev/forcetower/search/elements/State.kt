package dev.forcetower.search.elements

data class State(
    val name: String,
    val directions: MutableList<State> = mutableListOf()
)