package com.example.myapplication.section5

fun main(args: Array<String>) {
    println("Enter number:")

    var number:Int = readLine()!!.toInt()

    if(number % 2 == 0) {
        println("Even")
    }else {
        println("Odd")
    }

}