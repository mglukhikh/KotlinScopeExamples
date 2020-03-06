package test3

fun foo() {}
fun test() {
    operator fun Int.invoke() {}
    val foo = 42
    foo() // ?
}

val bar = 1
operator fun Double.invoke() {}
fun test2() {
    val bar = 2.0
    operator fun Int.invoke() {}
    bar() // ?
}