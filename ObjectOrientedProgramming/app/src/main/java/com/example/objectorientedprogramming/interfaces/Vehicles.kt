package com.example.objectorientedprogramming.interfaces

class Vehicles:CanGo, CanStop {
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("vehicles can stop")
    }
}