package com.example.kotlinpractice

fun main(args: Array<String>) {

}
fun print() : Unit
{
    println("Hello Kunal")
}

fun printLog(log: String = "This is default log" )
{
    println("Hello $log")
}

@JvmOverloads // Used here to use default parameter
fun printLogWIthDefault(log: String = "This is default log" )
{
    println("Hello $log")
}
