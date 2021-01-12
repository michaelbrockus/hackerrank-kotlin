//
// file: main.kt
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//
import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


//
// Complete the staircase function below.
//
fun staircase(n: Int): Unit {
    val staircaseArr = Array<Array<Char>>(n) { Array<Char>(n) {' '} }
    for(iter in 0..n - 1) {
        var step = 0
        for (subIter in n-1 downTo 0) {
            if (step < iter + 1) {
                staircaseArr[iter][subIter] = '#'
                step++
            } // end if

        } // end for
        println((staircaseArr[iter]).joinToString(""))
    } // end for
} // end of function staircase

//
// function main begins all program execution
//
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
} // end of function main
