package com.example.kotlinpractice



/*
*  Classes are final byDefault
*  classes class public by default
*  Kotlin has sealed classes
*   Constructor
*  Data classes = Hashcode implementation  , data storing classes
* */

fun main(args: Array<String>) {

    // function call
    val openclass = OpenClassesInKotlin()
    println(openclass.addition(2,3))


    // Method overiding
    val anotherClass2 = AnotherClass2()
    println(anotherClass2.addition(1,2,3))


    // Static functiopn
    println(OpenClassesInKotlin.add(5,2))
}

open class OpenClassesInKotlin {

    open fun addition(a :Int ,b :Int):Int
    {
        return a+b
    }

    companion object
    {
        open fun add(a :Int ,b :Int):Int
        {
            return a+b
        }
    }

    open fun addition(a: Int, b: Int, c: Int): Int {

        return 0
    }
}
class FinalClassesInKotlin {


}

// This type is final, so it cannot be inherited from
/*
* Class is final
* method is also final
* we cant override the the class methods
* */

//class AnotherClass : FinalClassesInKotlin()
//{
//}

class AnotherClass2: OpenClassesInKotlin()
{
    override fun addition(a: Int, b: Int , c: Int): Int {
        return a+b+c;
    }
}

//SealedClasses


 sealed class Event
 {
     class  SendEvent : Event()
     class  ReceiveEvent : Event()


 }
fun handleEvent(event: Event)
{
    when(event)
    {
        is Event.SendEvent ->   println("Send")
        is Event.ReceiveEvent ->   println("Received")

    }
}

// Primary and secondery Constructor private constructor

class ConstrtorClass(val item : Int)
{

    constructor(item:Int,name : String) :this(item)
}


