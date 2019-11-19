package com.example.testebateria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*

class Principal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        ID_Button_Bateria.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)}

        ID_Button_INV.setOnClickListener {
            val intent = Intent(applicationContext,ResultadoInventario::class.java)
            startActivity(intent)
        }

    }

}
