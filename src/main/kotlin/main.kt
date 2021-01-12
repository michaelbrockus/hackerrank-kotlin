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
// Complete the timeConversion function below.
//
fun timeConversion(s: String): String {
    val amOrPm = s.takeLast(2)
    val hour = s.take(2).toInt()
    val stringFromHour: (Int) -> String = {
        it.toString().padStart(2, '0') + s.substring(2, s.length - 2)
    }
    return when {
        amOrPm.equals("am", ignoreCase = true) -> when {
            hour < 12 -> s.take(8)
            else -> stringFromHour(hour - 12)
        } // end when
        else -> stringFromHour(if (hour < 12) (hour + 12) else hour)
    } // end when

} // end of function timeConversion

//
// function main begins all program execution
//
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
} // end of function main
