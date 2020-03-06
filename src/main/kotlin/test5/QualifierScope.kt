package test5

enum class My {
    FIRST;

    companion object {
        fun values() {}
        val FIRST = 1;
    }
}

fun test() {
    My.values()
    My.Companion.values()
    My.FIRST
    My.Companion.FIRST
    My.FIRST.name
    //My.Companion.FIRST.name
}