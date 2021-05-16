package com.example.kotlinpractice.samInterfaceEx


fun main(args: Array<String>) {

    var user = User("Kunal")

        user.create {
            println("${it.name} created")
        }
}