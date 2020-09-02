package com.example.primerkotlin

fun main(){

//función FILTER


    val numbers= listOf(1,-2,3,-4,5,6)
    val positives= numbers.filter { num-> num>0 } //método que recibe un predicado

    val negative= numbers.filter { it< 0 }//it identica uno de los elementos
    println(negative)
    println(positives)

}

