package com.example.kotlinpractice;

import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;

import static com.example.kotlinpractice.CallFromJavaKt.printLog;
import static com.example.kotlinpractice.CallFromJavaKt.printLogWIthDefault;

public class App {

    // Run kotlin code from java

    public static void main(String[] args) {
        CallFromJavaKt.print();


        printLog("THis is not default");

        printLogWIthDefault();
    }



}
