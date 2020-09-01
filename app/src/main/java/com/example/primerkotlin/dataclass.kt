package com.example.primerkotlin

data class User(val name: String,val id: Int)//tipo de clase para representar datos.ocupa COPY

fun main() {
//    val mUser= User("Alex",1)
//    println(mUser)
//
//    println(mUser.copy("MAx"))
//
//    println(mUser.copy(id=3))
//
//    val mUser2=mUser.copy(id=4)
//    println(mUser)
//    println(mUser2)

//    var neverNULL: String?="bla bla bla" // me sirve para declarar el valor null ? autoriza
//    neverNULL=null

//    fun describeString (maybeString:String?):String?{//Recibe null
//
//        if (maybeString!= null && maybeString.length>0){
//            return "largo de string es ${maybeString.length}"
//        } else{
//       return "vacío o null"}
//   }
//    val nullVale:String?
//    nullVale=null
//    println(describeString(nullVale))

    //clase o funciones genericas .es cómo un comodin para instanciar



    //cases ("hello")// esto es lo que busca en el WHEN,llega a lo correcto y se sale
   // cases(1)// entra al primero que cumple la condición
   // cases(MyClass())
   // cases("hello")
//cases (Birs(2))
   // cases(2)

    println(cuandoEsExpression("one"))
}//acá termina la función main


//    fun cases (obj: Any){// any recibe cualquier typo de datos
//          when (obj){  //when como declaracion
//              1-> println("one")
//              is Birs -> print("es un objeto Birs")
//              "Hello" -> print("saludos")
//              is Int -> print("Is long")
//              !is String -> print("Not a string")
//              else-> print("Desconocido")
//          }
//    }

fun cuandoEsExpression(obj: Any):Any? {// when que devuelve resultado

    val result=   when (obj){  //when como expresión// con este filtro datos
        1-> ("one")
        "Hello" ->1
        is Long-> false
        else-> 42
    }
    return result
}


class MyClass{

}

data class Birs (val wing:Int)