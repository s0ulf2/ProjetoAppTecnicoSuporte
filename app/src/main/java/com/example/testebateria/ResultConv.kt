package com.example.testebateria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result_conv.*

class ResultConv : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_conv)

        //recuperando os dados da activit conversor
        val dados : Bundle? = intent.extras
        val nome = dados?.getInt("Qall")

        //OPERAÇÃO

        //Button Q1
        if (nome == 1){

            ID_KOTLIN.setOnClickListener {
                val Q1 : String = "variavelBotao.setOnClickListener{" +
                        "          val intent = Intent(this,activitydestino::class.java) " +
                                   "startActivity(intent)}"
                ID_CAMPSAIDA.setText(Q1)
            }
        }

    }
}
