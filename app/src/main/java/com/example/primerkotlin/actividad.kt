package com.example.primerkotlin

fun main(){

//instanciar objetos con var o val

    val mCustomer = Customer()
    val mContact = Contact(1,"katherinaseguel@gmail.com")


    println(mContact.id)
    println(mContact.email)


    val perrito = Dog() //se instancio un objeto
    perrito.makeNoise()
    val candy:Dog= candy()
    candy.makeNoise()

}

class FirstClass  //pueder ser sin variebles

class Persona(text:String){

}


///HAY QUE TENER 1 archivo por CLASE
class Customer //clase sin parámetos

class Contact (val id:Int, var email:String) //si no llev nada más no se necesitan las llves

//clase para heredar debe llevar }OPEn para heredar igual que los métodos

open class Dog{
  open  fun makeNoise(){           //METODO
        println("woau wuau")
    }
}
class candy:Dog(){            //herencia
    override fun makeNoise() {
        //super.makeNoise()   //cambio lo que hace el metodo, lo puedo comentar o no
        println("wuf wuf")  // lo dejo así

    }
}
