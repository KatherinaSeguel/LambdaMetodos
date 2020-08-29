package com.example.primerkotlin

fun main(){

//instanciar objetos con var o val

    val mCustomer = Customer()
    val mContact = Contact(1,"katherinaseguel@gmail.com")

    println(mContact.id)
    println(mContact.email)
}

class FirstClass  //pueder ser sin variebles

class Persona(text:String){

}
///HAY QUE TENER 1 archivo por CLASE
class Customer //clase sin parámetos

class Contact (val id:Int, var email:String) //si no llev nada más no se necesitan las llves


