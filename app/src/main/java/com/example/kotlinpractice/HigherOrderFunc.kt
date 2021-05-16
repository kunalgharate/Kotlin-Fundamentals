package com.example.kotlinpractice


fun main(args: Array<String>) {
            printAddition(Calc(1,2))
}

fun  printAddition(addfunc: Int)
{
    print(addfunc)
}

fun Calc(a:Int,b:Int) : Int{
   return a+b
}