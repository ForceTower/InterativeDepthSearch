package dev.forcetower.search.impl

import dev.forcetower.search.elements.State
import dev.forcetower.search.elements.StateContext
import dev.forcetower.search.problem.RomaniaProblem

object IterativeDepthSearch {
    fun search(problem: RomaniaProblem) {
        var depth = -1
        var result: StateContext? = null

//        var superError = false
//        var lastSearchDepth = -1

        while (result?.success != true) {
            depth++
            result = LimitedDepthSearch.search(problem, depth)
//            if (lastSearchDepth == result.depth) {
//                superError = true
//                println("Super error. This destination is not available")
//                break
//            }
//            lastSearchDepth = result.depth
        }
        println("Finished on depth $depth")

//        if (!superError) {
            val way = mutableListOf<State>()
            do {
                way += result!!.to
                result = result!!.previousContext
            } while (result != null)

            way.reverse()
            println("the way > ${way.map { it.name }}")
//        }
    }
}