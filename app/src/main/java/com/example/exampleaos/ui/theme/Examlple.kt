package com.example.exampleaos.ui.theme

fun main() {

    // 1. 익명함수
    // 2. 변수처럼 사용되서 , 함수의 argument , return
    // 3. 한번 사용되고 , 재사용되지 않는함수

    val a = fun() { println("helllo") };
    val b: Int = 10;
    val c: (Int) -> Int = {
        it * 15
    }


}