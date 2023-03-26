package com.example.parcial1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText : EditText= findViewById(R.id.EditText)
        val btnLista : Button = findViewById(R.id.btnLista)

        btnLista.setOnClickListener {
            val numero = Integer.parseInt(editText.text.toString())

            if (numero < 0 || numero > 100) {
                Toast.makeText(this, "El numero no se encuentra dentro del rango!", Toast.LENGTH_SHORT).show()
                Log.i("RANGO", "El numero no esta en el rango!")
            } else if (!esPrimo(numero)) {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("numero", numero)
                startActivity(intent)
            } else {
                Toast.makeText(this, "El numero no es primo!", Toast.LENGTH_SHORT).show()
                Log.i("NUMERO PRIMO", "El numero no es primo!")
            }

        }
    }

    private fun esPrimo (numero : Int) : Boolean {
        for (i in 2 .. numero) {
            if (numero % i == 0)
                return false
        }
        return true
    }


}