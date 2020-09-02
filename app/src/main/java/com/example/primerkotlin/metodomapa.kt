package com.example.primerkotlin

fun main(){

    val numbers = listOf(1,-2,3,-4,5,6)
    val double = numbers.map { x->x*2 } //multiplica a todos los elementos
    val tripled= numbers.map { it *3 } //se lo hace a todos los elementos de la lista

    println(double)
    println(tripled)

    val anyNegativw= numbers.any{it < 0} //responde true con un negativo
    println(anyNegativw)

    val anyGT6 = numbers.any{it>6}//no hay mayor a 6 devuelve false

    println(anyGT6)

    //any pregunta si alguno cumple la condición el all pregunta si todos cumplen la condición

    val allEven = numbers.all {it % 2 ==0} //resto de la división MOD  con pares pasa true porque los 2 a todos

    println(allEven)

    val allnone= numbers.none{it % 2==1} //ninguno sea divisible par
    val allnone2= numbers.none {it>6}//ninguno menor a 6 booleano

    println(allnone)
}

//el mapa aplica la información al elemneto y el filtro iltra los elementos
