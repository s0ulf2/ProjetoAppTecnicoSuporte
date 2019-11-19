package com.example.testebateria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_inventario.*
import kotlinx.android.synthetic.main.activity_main.*

class Inventario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inventario)

    }
    fun Entrada (view : View) {
        val equip = ID_Ent_Asset.text.toString()
        exibe(equip)
    }

    fun exibe (equip : String){
        val resultado = equip
        ID_Retorno.setText(resultado)
    }
}
