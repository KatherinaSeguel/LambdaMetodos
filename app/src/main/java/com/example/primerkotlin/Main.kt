package com.example.primerkotlin

fun main(){
   // println("Hola katthy...")   //el ; es opcional

    var number22: Int  = 10 //se declara la variable number
    val number2: Int =20 //esta es val, no le puedo asignar otro valor, esto es inmutable

    var number1=10 // igual se puede hacer
    var nombre="kkk" //asume que es un string , variable por inferencia

   //val son inmutable . no cambia su valor, pueden ser de cualquier tipo

    //no puedo repetir los nombres de las variables

    val palabra01 ="Hola que tal"
    val number =10
    val concatenado ="El valor de la palabra 01 es : ${palabra01.length}"
    println(concatenado)

    val concatenado11 ="El valor de la palabra 01 es : $number"
    println(concatenado11)

    val concatenado33 ="El valor de la palabra 01 es : ${palabra01.trim()}"//trim saca los espacios en blanco de inio y final
    println(concatenado33)

   //replace para reemplaza
}