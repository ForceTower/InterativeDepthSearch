package dev.forcetower.search.impl

import dev.forcetower.search.elements.State
import dev.forcetower.search.elements.StateContext
import dev.forcetower.search.problem.RomaniaProblem

object LimitedDepthSearch {
    fun search(problem: RomaniaProblem, depth: Int): StateContext {
        val explored = mutableListOf<State>()
        val edge = mutableListOf<StateContext>()
        var maxDepth = 0

        edge += StateContext(problem.start)

        while (edge.isNotEmpty()) {
            val context = edge.removeAt(0)
            explored += context.to

            // Objective test
            if (context.to == problem.end) {
                println("Found!")
                context.success = true
                return context
            }

            if (context.depth < depth) {
                // Next Function
                val nextDepth = context.depth + 1
                val successors = context.to.directions
                    .filter { !explored.contains(it) }
                    .map {
                        StateContext(
                            to = it,
                            depth = nextDepth,
                            previousContext = context
                        )
                    }

                if (maxDepth < nextDepth) {
                    maxDepth = nextDepth
                }
                edge += successors
            }
        }

        println("Not found :(")
        return StateContext(problem.start, depth = maxDepth)
    }
}