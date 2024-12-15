package com.example.myapplication.section5


fun main(args: Array<String>) {
//    println("Enter your age:")
//    var age: Int = readLine()!!.toInt()
//    if (age<13){
//        println("You are a child")
//    }else if (age<19){
//        println("You are a teenager")
//    }else{
//        if (age<60) {
//            println("You are an adult")
//        }else{
//            println("You are a senior citizen")
//        }
//    }

    println("Enter 3 numbers :")
    var num1: Int = readLine()!!.toInt()
    var num2: Int = readLine()!!.toInt()
    var num3: Int = readLine()!!.toInt()

    var largest: Int
    if (num1 >= num2) {
        if (num1 >= num3) {
            largest = num1
        } else {
            largest = num3
        }
    }else{
        if (num2 >= num3) {
            largest = num2
        } else {
            largest = num3
        }
    }

    println("Largest number is $largest")
}