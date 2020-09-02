package com.example.primerkotlin


const val  POINTS_X_PASS: Int=15
val eZPassACcounts: MutableMap<Int, Int> = mutableMapOf(10 to 100,2 to 200,30 to 300) //mapa recive clave y valor

//clave 10 valor 100

val ejemMap:MutableMap<String,Int> =

        mutableMapOf("clave1" to 100, "clave2" to 300)

val ezPassReport:Map<Int,Int> = eZPassACcounts// asignando

  fun updatePointsCredit(accountID:Int) {//buscando la lleve
      if (eZPassACcounts.containsKey(accountID)){
          println("si la contiene")

          eZPassACcounts[accountID]=1000//modifica la key
         // eZPassACcounts.[accountID]= 200// busca por valor, con el metodo value ??
      }else {
          println("no la contiene")
      }
      }

fun main(){
    //MAP  MAP
    updatePointsCredit(10)// busca el 10
    println(eZPassACcounts)


}