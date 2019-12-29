package com.example.testebateria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*

class Principal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        //caminho app bateria
        ID_Button_Bateria.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)}
        //caminho app inventario
        ID_Button_INV.setOnClickListener {
            val intent = Intent(applicationContext,ResultadoInventario::class.java)
            startActivity(intent)}
        //caminho app conversor
        ID_Button_CONV.setOnClickListener {
            val intent = Intent(this,Conversor::class.java)
            startActivity( intent )
        }


    }

}
