package com.example.primerkotlin

fun main(){

    val systemUsers :  MutableList <Int> = mutableListOf(1,2,3,4)
    systemUsers.add(3)
    println(systemUsers)

  val onlyReadList : List<Int> = systemUsers//sólo lectura

    systemUsers.add(8)

    println(systemUsers)
    println(onlyReadList)

    fun addListInmutable(newint: Int){ //agrega enteros a la lista
        systemUsers.add(newint)
    }


    fun getList() : List<Int>{  //retorna elementos de la lista
        return onlyReadList
    }

    println("tamaño de la lista es: ${onlyReadList.size}") //largo o tamaño de listas
    println("tamaño de la lista es: ${systemUsers.size}")


    systemUsers.forEach{

        i -> println("este es el elemento $i")// recorre la lista
    }

    systemUsers.remove(3)  //elimina por elemento
    println(systemUsers)

    systemUsers.removeAt(1)//borra por indice, recuerda que se empieza del indice cero 0
    println(systemUsers)

    systemUsers[2]=7 //reemplaza posición 2 por 7
    println(systemUsers)
}// fin main

