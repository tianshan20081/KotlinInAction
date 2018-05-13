package com.gooker.kotlin.base

enum class Lang(val hello: String) {
    CHINESE("您好"),
    ENGLISH("hello"),
    JAPANESE("!@#$%^^&");


    fun sayHello() {
        println(hello)
    }

    init {

    }

    /**
     * 伴生对象 -> java 静态方法
     */
    companion object {
        fun parse(name: String): Lang {
            return Lang.valueOf(name.toUpperCase())
        }

        fun test(age: Int) {
            println(age)
        }
    }

}

fun Lang.sayBye() {
    val bye = when (this) {
        Lang.CHINESE -> "再见"
        Lang.ENGLISH -> "bye"
        Lang.JAPANESE -> ")*&^%%$$"
    }
    println(bye)
}


fun main(args: Array<String>) {
    val name = args[0]
    val lang = Lang.parse(name)
    println(lang)
    Lang.test(10000000)
    lang.sayHello()
    lang.sayBye()
}