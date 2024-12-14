package com.example.myapplication.section4

fun main(args: Array<String>) {

    var x:Int = 20
    var y:Int = 10
    var c:Int = 0

    c = x + y

    println("c =  x + y = " + c)

    c += x
    println("c +=  x = " + c)
    c -= x
    println("c -=  x = " + c)
    c *= x
    println("c *=  x = " + c)
    c /= x
    println("c /=  x = " + c)
    c %= x
    println("c %=  x = " + c)

}