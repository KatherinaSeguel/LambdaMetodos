package com.example.primerkotlin

class Cat(){
    val breed:String= ""
    var legs: Int=4
    val tail:Boolean=true
    var life: Int=7

    fun makeNoise():String{
      return "Miau"
    }

    override fun toString(): String {   ///esto lo genero con menu Code Generar ToString
        return "Cat(breed='$breed', legs=$legs, tail=$tail, life=$life)"
    }

}