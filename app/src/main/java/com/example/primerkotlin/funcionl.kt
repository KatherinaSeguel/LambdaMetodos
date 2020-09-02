package com.example.primerkotlin
//programación funcional


fun main(){
    //funciones de altoorden:
    //una función que retorna o toma como parámetro de otra función. ciudadano de primer clase
    //es la función

    val resument = calculate(10,10,::sum)//:: llama a la funcion
    println(resument)

    val multiresul= calculate(7,9){a,b-> a*b}
    println(multiresul)

    val divisionResult= calculate(6,2){a,b->a/b} //da lo mismo l operación que quiera, LAMDA {}
    println(divisionResult)

    val func= operation()

    println(func(3))



}//fin main


fun sum_(x:Int, y:Int)= x+y

fun calculate (x:Int, y:Int, operation:(Int,Int)->Int):Int{//operacion palabra reservada
    return operation(x,y)
}

fun operation():(Int)->Int{
    return ::square
}

fun square (x:Int)=x*x

