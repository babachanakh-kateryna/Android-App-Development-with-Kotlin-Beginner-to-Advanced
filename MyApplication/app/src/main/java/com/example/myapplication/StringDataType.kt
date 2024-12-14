package com.example.myapplication

fun main(args: Array<String>) {
    val a:String = "Hello"
    val b:String = "World"
    var age:Int = 25
    println("$a $b")
    println("Age: $age")

    var x:String = "Kotlin"
    var i:Int = x.length
    println("Length of $x is $i")

   var b1: Boolean = x.equals("Kotlin")
    println(b1)

    println(x.isEmpty())

    println(x.plus(" Programming"))

    println(x.lowercase())
    println(x.uppercase())

    var t:String = "   Android   "
    println(x+t)
    println(x+t.trim())
}
