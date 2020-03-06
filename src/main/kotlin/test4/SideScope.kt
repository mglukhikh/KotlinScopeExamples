package test4

class My {
    fun foo() {}

    companion object {
        fun foo() {}
    }

    fun test() {
        foo()
        this.foo()
    }

    fun test2() {
        Companion.foo()
        //this.Companion.foo()
    }
}

fun test(my: My) {
    my.foo()
    My.foo()
}