package com.example.kotlinpractice.functions

import java.net.URI

class FunctionDemo {

    fun print() : Unit
    {
        println("Hello Kunal")
    }

    fun print(name :String , age: Int) : Unit
    {
        println("Hello $name and my age is $age")
    }

    fun print(name :String) : String
        {
            return name;
        }


    // Functinal expression

    fun maxValue(a:Int, b:Int):Int  = if (a>b) a else b
}