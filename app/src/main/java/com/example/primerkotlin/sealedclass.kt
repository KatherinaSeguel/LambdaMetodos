package com.example.primerkotlin

fun main(){                      //las sealed Class es un aclase sellado una evolución del enum
                               //las clases están encapsulados se ocupan sólo ahí y por eso se ocupa el when , se asocian con el when,
                              //ya que el when evalua condiciones

    var nombre:String
    nombre="katherina"
 println("mi nombre es :$nombre")

    var  v1: Int
    var v2:Int
    var v3:Int
    var resul:Int
     v1 =10
    v2=20
    v3=30
   resul = v1+v2+v3
    println(resul)

    var ss:String
    var s:Char

    ss="Ark"
    s= 'A'
    s='B'

    println(ss.length)
    val decimalFloat=2.3f //la f define que es un decimal float
       println(decimalFloat)
//11 valores máximos byte y short

    // val nn=Long.MAX_VALUE  //maximo valor long
    //  println(nn+1)

    val bb: Double
    val SS:Double
    bb= Byte.MAX_VALUE.toDouble()
    println(bb)
    SS= Short.MAX_VALUE.toDouble()
    println(SS)

//imprimir valores minimos variebles Int y Long

    val ii:Int
    val ll: Long
    ii=Int.MIN_VALUE
    ll=Long.MIN_VALUE

    println(ii)
    println(ll)

var bb1:Boolean
    bb1=true
    var ff:Boolean
    ff=false
    println(bb1)
    println(ff)
imprimiendoParametros("hola","chao")

    devolve

}

fun imprimiendoParametros(param1:String,param2:String){
    var valor:Int
    valor = param1.length + param2.length
    println(valor)
    return

fun devolveriva ():Double{//faltó terminar esto

    return (19%)
}

}