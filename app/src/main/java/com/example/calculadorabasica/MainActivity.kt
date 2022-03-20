package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvUsuario = findViewById<TextView>(R.id.tvUsuario)


        var usuario: String? = intent.getStringExtra("usuario")
        tvUsuario.text = usuario



    }
}