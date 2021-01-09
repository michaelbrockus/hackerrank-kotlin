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
// Complete the compareTriplets function below.
//
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var countAlice: Int = 0;
    var countBob: Int = 0;

    
    for (iter in 0 until a.size)
    {
        if (a[iter] > b[iter])
        {
            countAlice++
        }
        else if (a[iter] < b[iter])
        {
            countBob++
        }
    }
    return arrayOf(countAlice, countBob)
}

//
// function main begins all program execution
//
fun main(args: Array<String>) {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
