package com.example.myapplication.section3

/*
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()
 */
fun main (args:Array<String>){
    var x:Byte = 127
    var y:Int = x.toInt()
    var z:Double = y.toDouble()

    println("Byte: $x")
    println("Int: $y")
    println("Double: $z")

    var a:Double = 123.456
    var b:Int = a.toInt()
    var c:Byte = b.toByte()

    println("Double: $a")
    println("Int: $b")
    println("Byte: $c")


}