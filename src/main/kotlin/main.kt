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
// Complete the 'birthdayCakeCandles' function below.
//
// The function is expected to return an INTEGER.
// The function accepts INTEGER_ARRAY candles as parameter.
//
fun birthdayCakeCandles(candles: Array<Int>): Int {
    var number = 0
    var current = 0
    for (iter in 0 until candles.size) {
        if (candles[iter] > current) {
            current = candles[iter]
        } // end if

    } // end for

  for (iter in 0 until candles.size) {
      if (candles[iter] < current) {
        continue
      } // end if 
      else {
          ++number
      } // end else

  } // end for
  return number
} // end of function birthdayCakeCandles

//
// function main begins all program execution
//
fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
} // end of function main
