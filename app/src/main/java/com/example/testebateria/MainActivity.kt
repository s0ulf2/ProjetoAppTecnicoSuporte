package com.example.testebateria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    
    fun Converter (view:View){
            val valor1 = Valor1.text.toString()
            val valor2 = Valor2.text.toString()
        Calculo(valor1,valor2)
    }
    fun Calculo (valor1 : String , valor2 : String){
        val num1= valor1.toDouble()
        val num2= valor2.toDouble()
        val resultado = num2 / num1 *100

        if (resultado <= 40.0){
            resultado1.setText("$resultado")
            resultado2.setText("É recomendável a troca da bateria pois a mesma está recarregando abaixo dos 40%")

        }
        else{
            resultado1.setText("$resultado")
            resultado2.setText("A bateria ainda está com a vida útil boa.")
        }

    }
}
