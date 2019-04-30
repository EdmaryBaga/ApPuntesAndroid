package com.bignerdranch.android.appuntesandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.widget.Button

class MainActivity : AppCompatActivity() {

     lateinit var btn_fragDinam: Button;

    /*para el fragmento fijo, añadimos la etiqueta <fragment con el atributo name, en donde indicamos el archivo fragment.java al que debe
      conectarse
    */
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fragDinam = findViewById(R.id.add_fragment);

       btn_fragDinam.setOnClickListener{
           //para añadir el fragment dinamico
           //0 creamos la clase que hereda de Fragment
           //1 creamos el xml del fragment
           //2 agregamos el fragment Manager
           val fragmentManager: FragmentManager = supportFragmentManager
           //3 creamos una transaccion del fragment
           val transaccion= fragmentManager.beginTransaction()
           //4 añadimos el fragmento con add(layoutQueContendraElFragment, objetoDelaclaseDelFragemnt)
           val fragDinamico = FragmentoDinamico()//creamos el objeto de nuestra clase Fragment
           transaccion.add(R.id.activity_main, fragDinamico)
           //confirmamos el cambio con un commit
           transaccion.commit()
       }
    }
}
