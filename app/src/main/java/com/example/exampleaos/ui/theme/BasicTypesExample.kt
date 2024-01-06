package com.example.exampleaos.ui.theme

import androidx.compose.runtime.produceState

fun main(){

    // 1. Basic Types
    val d : Int = 3;
    val e : String = "hello";

    // 2. Collections
    // - Collection type
    // 1) Lists
    // 2) Sets
    // 3) Maps

    val readOnlyShapes = listOf("triangle","square","circle");
    println(readOnlyShapes);

    val shapes : MutableList<String> = mutableListOf("triangle","square","circle");
    shapes.add("pentagon");
    println(shapes);
    shapes.remove("triangle");
    println(shapes);

    //------------------------------------------------------------------------

    val readOnlyFruit = setOf("apple","banana","cherry","cherry");
    println(readOnlyFruit.count());
    println("banana" in readOnlyFruit);

    val fruit : MutableSet<String> = mutableSetOf("apple","banana","cherry","cherry");
    fruit.add("dragonfruit");
    println(fruit);

    fruit.remove("dragonfruit");
    println(fruit);

    // -------------------------------------------------------------------------

    val readOnlyJuiceMenu = mapOf("apple" to 100 , "kiwi" to 190 , "orange" to 100);
    println(readOnlyJuiceMenu);

    val juiceMenu : MutableMap<String,Int> = mutableMapOf("apple" to 100 , "kiwi" to 190 , "orange" to 100);

    juiceMenu.put("banana",200);

    println(juiceMenu.containsKey("apple"));
    println(juiceMenu.keys);
    println(juiceMenu.values);





}