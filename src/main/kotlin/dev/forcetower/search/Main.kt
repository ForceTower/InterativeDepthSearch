package dev.forcetower.search

import dev.forcetower.search.impl.IterativeDepthSearch
import dev.forcetower.search.problem.RomaniaProblem

fun main() {
    IterativeDepthSearch.search(RomaniaProblem("Oradea", "Neamt"))
}