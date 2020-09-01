package com.example.primerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val hija = Doggy(4,"blanco","callejero")
       // Log.d("PERRITO",hija.raza)
        hija.patas=2
       // Log.d("PERRITO",hija.patas.toString())


        val kitty= Cat()
        kitty.legs=3
        kitty.life=6

      //  Log.d("CAT",kitty.toString())// el string lo creo en la clase con el menu

        val austral= Beer(16,10.3,"Calafate")// en la hice una data clase y yo le pasé los datos al atributo
        Log.d("CERVEZA",austral.toString())

        //Log.d("BEERCOPY", austral.copy(ibu = 50,grade = 50.0, type = "otro").toString())

        Log.d("OTRAFORMA",austral.copy().toString())
    }
}
