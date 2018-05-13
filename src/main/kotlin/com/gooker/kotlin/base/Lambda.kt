package com.gooker.kotlin.base

import io.reactivex.Observable
import java.io.File

fun main(args: Array<String>) {
    val content = File(ClassLoader.getSystemResource("input.txt").path).readText()
//    println(content)

    Observable.fromIterable(content.toCharArray().asIterable())
            .filter {
                !it.isWhitespace()
            }
            .groupBy { it }
            .map { o ->
                o.count().subscribe { t1, t2 ->
                    println("${o.key} $t1")
                }
            }
            .subscribe()


//    Observable.just(content.toCharArray().asIterable().iterator())
//            .filter {
//                //                println(it)
////                it.isNotEmpty()
////                it.isEmpty()
////                !it.none()
//            }
//            .map {
//                print(it.forEach { println(it) })
//            }
//            .subscribe()
}