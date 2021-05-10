package com.example.kotlinpractice

fun main(args: Array<String>) {

    val text = " A   New            version 1.4.32        realease - studin      4.1. b.3       the kotlin plugin"

    println(replaceWhiteSpace("Print with  Normal fuction $text"))
    println("Print with extension fuction ${text.extensionWhiteSpaceFunction()}")
}
fun String.extensionWhiteSpaceFunction(): String {
    var regex = Regex("\\s+")
    return regex.replace(this," ")

}

fun replaceWhiteSpace(value : String):String
{
    var regex = Regex("\\s+")
    return regex.replace(value," ")

}
