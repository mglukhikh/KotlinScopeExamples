package test1

import kotlin.collections.*

fun List<String>.map(f: (String) -> Int): List<Int> = TODO()

fun testImportScope() {
    listOf("Alpha", "Omega").map { it.toInt() }
    listOf(1.0, 2.0).map { it.toInt() }
}