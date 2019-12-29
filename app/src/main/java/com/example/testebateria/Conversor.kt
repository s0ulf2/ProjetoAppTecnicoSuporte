package com.example.testebateria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_conversor.*

class Conversor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)
        //Botao Q1
        ID_Q1.setOnClickListener {
            val intent = Intent(this,ResultConv::class.java)
            intent.putExtra("Qall",1 )
            startActivity( intent )
        }

    }
}
