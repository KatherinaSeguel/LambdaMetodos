package com.example.primerkotlin

fun main() {

    // val cakes = listOf("carrot","chess","chocolte","fresa","guinda")

//    for (element in cakes){//imprime una linea por cada elemento//recorre la lista
//        println("el pastel es de ${element}")
//    }

/*
    var cakesEaten=0
    var cakeBaked=0

    while (cakesEaten<5){
        eatAcake()
        cakesEaten++
    }

    do{

        bakeAcake()
        cakeBaked++
    }while (cakeBaked< cakesEaten)
*/


    for (item in 0..3) {
        println(item)
    }

    println("")
    for (item in 2..9 step 2){//rangos con step
        println(item)
    }

    for (item in 5 downTo 0){//cuenta hacia atrás
        println(item)
    }


//    //los rangos pueden ser char//
//
//    for (c in 'a'..'z'){//se imprimen ascii , están ordenados como el ascii
//        println(c)
//    }
//    for (c in 'z' downTo 'a' step 2){
//        println(c)
//    }

//    var num=3
//    if(num in 1..4){
//        println("es verdadero")
//    }
//
//    if (num !in 6..10){
//        println("no está en el rango")
//    }
//
//    //que pasa si yo no quiero incluir el cero y el último número del rango

   /* val authores= setOf("shakespear","Hemingway","Twait") //set de datos compara y da un true o false
    val writers = setOf("Twait","Shakespeare","Hemingway")

    println (authores==writers)//le dá lo mismo mientras no se repiten los elemnetos , estructura de datos

    println(authores===writers)//compara la referrencia

    val name="criss"
    val name2="criss"

    //esto es lo mismo
    println(name==name2)
    println(name.equals(name2))*/


   // println(name===name2)

    println(max(99,-43))

}
fun max(a:Int, b:Int)= if (a>b) a else b


fun eatAcake()= println("comer pastel")
fun bakeAcake()= println("preparar pastel")