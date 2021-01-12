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
// Complete the plusMinus function below.
//
fun plusMinus(arr: Array<Int>): Unit {
    println(arr.fold(Triple(0, 0, 0), { acc: Triple<Int, Int, Int>, i: Int ->
            when {
                i > 0 -> acc.copy(first = acc.first.inc())
                i < 0 -> acc.copy(second = acc.second.inc())
                else -> acc.copy(third = acc.third.inc())
            } // end when
        }).toList().zip(listOf(RoundingMode.CEILING, RoundingMode.FLOOR, RoundingMode.CEILING))
        { number, roundingMode ->
            number.toBigDecimal().divide(arr.size.toBigDecimal(), 6, roundingMode)
        }.joinToString("\n"))
} // end of function plusMinus

//
// function main begins all program execution
//
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
} // end of function main
