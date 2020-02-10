package dev.forcetower.search.problem

import dev.forcetower.search.elements.State

class RomaniaProblem(startString: String, endString: String) {
    private val states = createStates()
    val start = findStateByName(startString)
    val end = findStateByName(endString)

    private fun findStateByName(name: String): State {
        return states.first { it.name == name }
    }

    private fun createStates(): List<State> {
        val arad = State("Arad")
        val timissoara = State("Timissoara")
        val oradea = State("Oradea")
        val zerind = State("Zerind")
        val sibiu = State("Sibiu")
        val fagaras = State("Fagaras")
        val bucareste = State("Bucareste")
        val lugoj = State("Lugoj")
        val mehadia = State("Mehadia")
        val dobreta = State("Dobreta")
        val craiova = State("Craiova")
        val pitesti = State("Pitesti")
        val rimnieu = State("Rimnieu Vilcea")
        val giurgiu = State("Giurgiu")
        val urziceni = State("Urziceni")
        val eforie = State("Eforie")
        val vaslui = State("Vaslui")
        val iasi = State("Iasi")
        val neamt = State("Neamt")
        val hirsova = State("Hirsova")

        arad.directions += sibiu
        arad.directions += zerind
        arad.directions += timissoara

        timissoara.directions += arad
        timissoara.directions += lugoj

        oradea.directions += zerind
        oradea.directions += sibiu

        zerind.directions += oradea
        zerind.directions += arad
        zerind.directions += sibiu

        sibiu.directions += fagaras
        sibiu.directions += rimnieu
        sibiu.directions += oradea
        sibiu.directions += arad

        fagaras.directions += bucareste
        fagaras.directions += sibiu

        bucareste.directions += urziceni
        bucareste.directions += fagaras
        bucareste.directions += pitesti
        bucareste.directions += giurgiu

        lugoj.directions += timissoara
        lugoj.directions += mehadia

        mehadia.directions += dobreta
        mehadia.directions += lugoj

        dobreta.directions += craiova
        dobreta.directions += mehadia

        craiova.directions += pitesti
        craiova.directions += rimnieu
        craiova.directions += dobreta

        pitesti.directions += bucareste
        pitesti.directions += rimnieu
        pitesti.directions += craiova

        rimnieu.directions += pitesti
        rimnieu.directions += craiova
        rimnieu.directions += sibiu

        giurgiu.directions += bucareste

        urziceni.directions += hirsova
        urziceni.directions += vaslui
        urziceni.directions += bucareste

        eforie.directions += hirsova

        vaslui.directions += urziceni
        vaslui.directions += iasi

        iasi.directions += neamt
        iasi.directions += vaslui

        neamt.directions += iasi

        hirsova.directions += eforie
        hirsova.directions += urziceni

        return listOf(
            arad, bucareste, craiova, dobreta, eforie, fagaras, giurgiu, hirsova, iasi, lugoj,
            mehadia, neamt, oradea, pitesti, rimnieu, sibiu, timissoara, urziceni, vaslui, zerind,
            State("Abacaxi")
        )
    }
}