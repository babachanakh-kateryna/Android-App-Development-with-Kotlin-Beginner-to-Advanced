package com.example.myapplication.section4

fun main(args: Array<String>) {
    println("What is your name?")
    var name: String? = readLine()
    println("Hello $name")
    println("How old are you?")
    var age: Int = readLine()!!.toInt()
    println("Your age is $age")
}