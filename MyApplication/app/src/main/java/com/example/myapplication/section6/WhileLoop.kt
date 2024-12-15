package com.example.myapplication.section6

import kotlin.random.Random

fun main(args: Array<String>) {
//    var i = 1
//    while (i <= 5) {
//        println("Hello World")
//        i++
//    }
//
//    var k = 1
//    var fact = 1
//    while (k <= 5) {
//        fact *= k
//        k++
//        println("Factorial: $fact")
//    }

    // infinite loop
    val num = Random.nextInt(0, 100)
    println("Enter number between 0 and 100")
    while (true){
        val guess = readLine()!!.toInt()
        if (guess == num) {
            println("You guessed it right")
            break
        } else if (guess < num) {
            println("Try higher")
        } else {
            println("Try lower")
        }
    }
}