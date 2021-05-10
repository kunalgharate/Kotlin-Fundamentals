package com.example.kotlinpractice

import java.math.BigDecimal


fun main(args: Array<String>) {

        // TailRec handle the stackoverflow error like while you call function recersively


     // getting stackoverflow error while print large no ex : 10000
    println(Fibbonacci(10000, BigDecimal("1"), BigDecimal("0")))

    // Printing properly
    println(FibbonacciUsingTelRec(10000, BigDecimal("1"), BigDecimal("0")))


}
fun Fibbonacci (n:Int , a : BigDecimal , b : BigDecimal):BigDecimal{

   return if (n==0) b else FibbonacciUsingTelRec(n-1,a+b,a)
}

 tailrec fun FibbonacciUsingTelRec (n:Int , a : BigDecimal , b : BigDecimal):BigDecimal{

    return if (n==0) b else FibbonacciUsingTelRec(n-1,a+b,a)
}