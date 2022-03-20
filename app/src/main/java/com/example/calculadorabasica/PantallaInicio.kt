package com.example.calculadorabasica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class PantallaInicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_inicio)


        val btIniciar = findViewById<Button>(R.id.btListo)
        val etNombreUsuario = findViewById<EditText>(R.id.etNombreUsuario)

        btIniciar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("usuario",etNombreUsuario.text.toString())
            startActivity(intent)
        }

    }
}