package com.gooker.kotlin.base

/**
 * a_b_d e_f_j n_h_i_k
 */
fun main(args: Array<String>) {


    map(args)

    flatMap(args)
}

fun flatMap(args: Array<String>) {
    args.flatMap { it.split("_") }
            .map { print("$it ") }
}

fun map(args: Array<String>) {
    args.map(::println)
}
