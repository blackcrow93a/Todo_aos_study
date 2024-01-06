package com.example.exampleaos.ui.theme

fun main(){

    // 1. fun 함수
    // fun main() {} : 메인함수

    // 2. Variables
    // 1) val : read-only ( 읽기 전용 )
    // 2) var : mutable ( 가변 함수 )

    var popcorn = 5;
    var hotDog = 10;
    println(popcorn + hotDog)

    // 3. String templates
    // $ 를 통해서 표현

    println( "팝콘의 가격은 $popcorn 입니다");
    println( "핫도그의 가격은 ${popcorn + 10} 입니다");

    maryFun();
}

fun maryFun(){
    val name = "Mary";
    val age = 20;
    println("$name is $age years old");
}