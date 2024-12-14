package com.example.myapplication.section4

fun main(args: Array<String>) {
    var result:Int = 5+2*4
    println("result of 5+2*4 = " + result)

    result = (5+2)*4
    println("result of (5+2)*4 = " + result)

    var x:Int = 8
    var y:Int = 4
    var z:Int = 2
    var sum : Int = 0

    sum = x + --y + --z
    println("sum = x + --y + --z = " + sum)

}