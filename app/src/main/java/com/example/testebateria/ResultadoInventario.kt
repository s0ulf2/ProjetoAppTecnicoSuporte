package com.example.testebateria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*
import kotlinx.android.synthetic.main.activity_resultado_inventario.*

class ResultadoInventario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_inventario)

        ID_Button_Mov.setOnClickListener {
            val intent = Intent(applicationContext,Inventario::class.java)
            startActivity(intent)
        }

    }
}
