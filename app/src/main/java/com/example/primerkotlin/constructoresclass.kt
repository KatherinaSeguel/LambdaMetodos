package com.example.primerkotlin

fun main(){
  /*  val objeto=CualquierCosa()

}

class CualquierCosa{  //metodo init y costructor serven para aagregar atributos a la CLASE
    val num:Int
    init{// inicializa cosas dentro de la clase
        num= 10
      }
    constructor(num2)//no termine de copiar*/

    //ENUM CLASE PARA NOMBRAR COSAS

    val state= State.RUNNING

    val message = when(state){

        State.RUNNING->"Estás corriendo"
        State.FINISS->"Se termino"
        State.IDLE->"Estás detenido"
    }

    println(message)
}

enum class State(){

    IDLE,RUNNING,FINISS
}

