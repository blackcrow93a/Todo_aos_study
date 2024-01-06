package com.example.exampleaos.ui.theme

fun main(){

    // if or when

    val obj = "Hello";
    val result = when(obj){
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }
    println(result);

}