package com.example.myapplication.section6

fun main(args: Array<String>) {
//    for (num in 1..10) {
//        println(num)
//    }

//    var sum:Int = 0
//    for (num in 1..10) {
//
//        if (num % 2 == 0) {
//            println(num)
//            sum += num
//
//        }
//    }
//    println("Sum: $sum")

//    var numArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//    for (num in 0..numArray.size-1) {
//        println("Index: $num Value: ${numArray[num]}")
//    }

//    var numArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
//    for (num in numArray.indices) {
//        println("Index: $num Value: ${numArray[num]}")
//    }
//
    // for each loop
    var numArray = arrayListOf<Int>(1,2,3,4,5,6,7,8,9,10)
    numArray.forEach() {
        println(it)
    }

}