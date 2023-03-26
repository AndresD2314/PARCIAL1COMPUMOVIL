package com.example.parcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity2 : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val lvDatos : ListView = findViewById(R.id.LvNumeros)
        val arrayAdapter: ArrayAdapter<*>
        val arr = mutableListOf<Int>()


        val numero = intent.getIntExtra("numero", 0)

        var x = numero
        var cuadrado = 0
        while (cuadrado < 10000) {
            cuadrado = x * x
            arr.add(cuadrado)
            x++
        }

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arr)
        lvDatos.adapter = arrayAdapter
    }
}