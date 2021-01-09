//
// file: main.kt
// author: Michael Brockus
// gmail: <michaelbrockus@gmail.com>
// github: https://github.com/michaelbrockus
//
import java.util.*

//
// function main begins all program execution
//
fun solveMeFirst(a: Int, b: Int): Int {
    return a + b
} // end of function solveMeFirst

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
} // end of function main
