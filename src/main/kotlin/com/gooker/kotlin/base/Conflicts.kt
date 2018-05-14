package com.gooker.kotlin.base

interface A {
    fun x(): Int = 10
}

interface B {
    fun x(): Int = 0
}

abstract class C {
    open fun x(): Int = 2
}


class D(val y: Int) : C(), A, B {
    override fun x(): Int {
        if (y > 10) {
            return super<A>.x()
        } else if (y > -1) {
            return super<B>.x()
        } else {
            return super<C>.x()
        }
    }
}

fun main(args: Array<String>) {
    println(D(100).x())
    println(D(0).x())
    println(D(-10).x())
}