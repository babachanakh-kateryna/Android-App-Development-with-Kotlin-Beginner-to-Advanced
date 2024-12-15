package com.example.objectorientedprogramming.override

class Car:Vehicle() {
    fun superStart(){
        super.start()
    }

    fun superStop(){
        super.stop()
    }

    fun superAccelerate(){
        super.accelerate(50)
    }

    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

    override fun accelerate(speed: Int) {
        println("Car is accelerating at $speed km/h")
    }
}