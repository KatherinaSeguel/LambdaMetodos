package com.example.primerkotlin

fun main(){

    val upperCase1:(String)->String= {str:String-> str.toUpperCase()}//lo que está entre {} es LAmbda

    val upperCase2:(String)->String ={str->str.toUpperCase()}//se infiere que el dato es String

    val upperCase3={str:String->str.toUpperCase()}

    //val upperCase4= {str->str.toUpperCase} //Está erroneo no lo entiende el sist.

    //val upperCase5=(String)->String={ it.toUpperCase() } it sirve para definir????

    val upperCase6: (String)-> String = String::toUpperCase

    println(upperCase1 ("esto en minusculas"))


}//fin main