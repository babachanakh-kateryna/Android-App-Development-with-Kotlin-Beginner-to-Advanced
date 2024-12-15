package com.example.objectorientedprogramming.override

open class Vehicle {

    open fun start(){
        println("Vehicle Started")
    }

    open fun stop(){
        println("Vehicle Stopped")
    }

    open fun accelerate(speed: Int){
        println("Vehicle is accelerating at $speed km/h")
    }
}