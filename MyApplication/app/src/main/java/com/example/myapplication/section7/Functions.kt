package com.example.myapplication.section7

fun main(args: Array<String>) {

    println("Enter number 1:")
    var num1 = readLine()!!.toInt()
    println("Enter number 2:")
    var num2 = readLine()!!.toInt()

    show(num1, num2)
    println("Sum is ${add(num1, num2)}")
    println("Minimum number is ${findMin(num1, num2)}")

}

fun show(num1: Int, num2: Int) {
    println("Number 1 is $num1")
    println("Number 2 is $num2")
}

fun add(num1: Int, num2: Int) : Int {
    var sum = num1 + num2
    return sum
}

fun findMin(num1: Int, num2: Int) : Int {
    if(num1 < num2) {
        return num1
    }else {
        return num2
    }
}