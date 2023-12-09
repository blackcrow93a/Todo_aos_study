package com.example.exampleaos.ui.theme

fun main(){

    // let , run , apply , alse , with
    // 1.let

    val a = 3 ;
    val user = User ("조수영",30,false);

    // 수신객체.let
    // 마지막줄 // return
   val age =  user.let { user ->
         user.age
    }
    println(age);

    // 2. run
    // 수긴객체.run { this->
    //
    // 마지막 줄
    // }

    val kid = User("아이",4,true);
    var kidAge = kid.run {
        this.age
    }
    println(kidAge);

    //3. apply
    // 수신객체.apply {
    //
    // }
    // return 값이 수신객체
    var kidName = kid.apply {
        name

    }

    //4 . also
    // 수신객체.also {
    //
    // 마지막줄 return
    // }

    //5 . with
    // 수신객체.with {
    //
    // 마지막줄 return
    // }





}

class User (
    var name : String,
    var age : Int,
    var gender : Boolean,
)