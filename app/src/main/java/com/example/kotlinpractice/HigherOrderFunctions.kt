package com.example.kotlinpractice


fun main(args: Array<String>) {

    val program = HigherOrderFunctions()
    var total= 0

    program.fibbonacci(13,::println)

    // Mutable value
    program.fibbonacci(13,{
        total+=it
    })
    println("Total $total")
}
class HigherOrderFunctions {

    fun  fibbonacci (limit:Int,action :(Int) ->Unit)
    {
        var prev=0;
        var prevprev = 0;
        var current = 1

        for (i:Int in 1..limit)
        {
            action(current)
            var temp = current
            prevprev = prev
            prev = temp

            current = prev + prevprev
        }
    }

}