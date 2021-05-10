package com.example.kotlinpractice.functions

import kotlin.math.log


fun main(args: Array<String>) {

    val a = Header("Header1")
    val b  = Header("Header2")

    val c = a.plus(b)

    val d = a add b

    println(c.name)

    println(d.name)



}

class Header(var name: String)
{}


        // without infix
    fun Header.plus(other :Header) : Header{

        return Header(this.name + other.name)
    }


        //   WITH INFIX
  infix fun Header.add(other :Header) : Header{

    return Header(this.name + other.name)
}




