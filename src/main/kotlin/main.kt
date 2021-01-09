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
// Complete the miniMaxSum function below.
//
fun miniMaxSum(arr: Array<Int>): Unit {
    var sum: Int = 0
    var min: Int = 2
    var max: Int = 2
    var num: Int

    for (secret in arr)
    {
        num = secret
        sum += num
        if (secret == 0) {
            max = num
            min = num
        } // end if

        else {
            if (num > max)
            {
                max = num
            } // end if
            else if (num < min)
            {
                min = num
            } // end else if

        } // end else

    } // end for
    println("${sum - max} ${sum - min}")
} // end of function miniMaxSum

//
// function main begins all program execution
//
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
} // end of function main
