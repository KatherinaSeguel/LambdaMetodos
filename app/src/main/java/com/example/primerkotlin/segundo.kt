package com.example.primerkotlin

import kotlin.reflect.typeOf

fun main(){

 //   var mutable="Saludos"
   // val inmutable =10.0
   //println("$mutable $inmutable")
    //println(inmutable)

   // val nn=Long.MAX_VALUE  //maximo valor long
  //  println(nn+1)

 //   val decimal =2.0
 //   println(decimal.javaClass)//por defecto es double

 //   val decimalFloat=2.3f //la f define que es un decimal float
 //   println(decimalFloat)

 //   val y=false  //infiere que es un boolean

 //   var palabra:String
 //   var caract: Char = 'c' //se declara con comilla simple

    //declarar variable int,String,char yfloat e imprimir

  //  var num=10
    //var palabra2="Hola como estás?"
    //var caracter = 'c'
    //var decimalfloat= 2.5f
    //println("$num $palabra2 $caracter $decimalfloat")

    var v1= 10
    var v2= 33
    var  v3= 66
    var resultado=v1+v2+v3
    println("Resultado uno: $v1+$v2+$v3=$resultado")

     v1= 55
    resultado=v1+v2+v3
    println("Resultado dos: $v1+$v2+$v3= ${v1+v2+v3}")

    var prome= (v1+v2+v3)/3
    println("promedio: $prome")

    imprimirNombreCompleto("katty","seguel",49)
    var dd=devolverNombreCompleto("kathy","seguel",34)
    println(dd)
    mensajefijo("juan peréz")

    println(sum(2,3))
    println(multiplicar(4,5))

}//termina el main

fun mensajefijo (name:String,prefix:String="Estudiante"){ //se ocupa el prefix que es un mensaje fijo y cuando se ejecuta solo pide un parametro
    println("$prefix $name")
}

fun getNombreCompleto():String{
    return "Juan José"
}

fun getEdad():Int{

    return 10
}

fun imprimiralgo() { //existe el void pero no se coloca , lo que devuelve es un UNIT
    imprimirNombreCompleto("kathy","Seguel",49)

}



fun imprimirNombreCompleto(nombre:String,apellido:String,edad:Int){
    val edad=edad+1
  println( "Mi nombre es $nombre $apellido y tengo $edad")
}


fun devolverNombreCompleto(nombre:String,apellido:String,edad:Int):String{

   return "Mi nombre es $nombre $apellido y tengo $edad"
}

fun sum(x:Int,y:Int):Int{
    return x + y
}

fun multiplicar (num:Int,num2:Int):Int{
    return num*num2
}