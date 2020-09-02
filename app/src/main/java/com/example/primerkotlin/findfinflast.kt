package com.example.primerkotlin

fun main(){

    val words = listOf("Lests","find","something","in","someHow")

    val first= words.find { it.startsWith("some") } //primera palabra con el prefijo
    val last= words.findLast { it.startsWith("some") }//el ultimo

    println(first)
    println(last)

    val numbers= listOf(10,9,1,-2,23,3,-4,5,6)

    val naturalOrden=numbers.sorted()
    println(naturalOrden)//ordena en orden natural

    val inverted=numbers.sortedBy { -it }//ordenainvertido
    println(inverted)

    //CLASE LIBRO
   val list: MutableList<Libro>= mutableListOf(
    Libro("algo","ASS26",300,1000.000,"yoyo",1956"Santillana","D")
    )

}

data class Libro(
    val name:String,
    val isbn:String,
    val pages:Int,
    val prince:Double,
    val author:String,
    val publishYear:Int,
    val editorial:String,
    val type: String
)