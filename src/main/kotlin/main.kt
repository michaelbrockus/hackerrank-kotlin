//
// file: main.kt
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//
import java.io.*
import java.math.*
import java.text.*
import java.util.*
import java.util.regex.*

//
// Complete the simpleArraySum function below.
//
fun simpleArraySum(ar: Array<Int>): Int {
     var summary = 0
     for (len in ar) {
        summary += len
     } // end for
     return summary
} // end of function simpleArraySum

//
// function main begins all program execution
//
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    val result = simpleArraySum(ar)

    println(result)
} // end of function main
