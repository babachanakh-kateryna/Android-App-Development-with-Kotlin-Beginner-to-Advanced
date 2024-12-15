package com.example.myapplication.section5

fun main(args: Array<String>) {
    println("Enter a day number of week:")
    var dayNum = readLine()!!.toInt()
    var day:String

    when(dayNum){
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else ->  day = "Invalid day number"
    }

    println("Day is " + day)
}