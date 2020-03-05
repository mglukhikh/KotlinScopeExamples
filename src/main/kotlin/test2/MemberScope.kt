package test2

class My {
    fun foo() {}
    fun bar() {
        fun foo() {}
        foo()
        this.foo()
    }
}

fun My.foo() {}

fun bar(my: My) {
    fun My.foo() {}
    my.foo()
}