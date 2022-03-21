package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.time.temporal.ValueRange

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvUsuario = findViewById<TextView>(R.id.tvUsuario)
        var tvCajaNumeros = findViewById<TextView>(R.id.tvCajaNumeros)
        var bBorrar = findViewById<Button>(R.id.bBorrar)
        var bMasMenos = findViewById<Button>(R.id.bMasMenos)
        var bPorcentaje = findViewById<Button>(R.id.bPorcentaje)
        var bDivision = findViewById<Button>(R.id.bDivision)
        var bSiete = findViewById<Button>(R.id.bSiete)
        var bOcho = findViewById<Button>(R.id.bOcho)
        var bNueve = findViewById<Button>(R.id.bNueve)
        var bMultiplicacion = findViewById<Button>(R.id.bMultiplicacion)
        var bCuatro = findViewById<Button>(R.id.bCuatro)
        var bCinco = findViewById<Button>(R.id.bCinco)
        var bSeis = findViewById<Button>(R.id.bSeis)
        var bMenos = findViewById<Button>(R.id.bMenos)
        var bUno = findViewById<Button>(R.id.bUno)
        var bDos = findViewById<Button>(R.id.bDos)
        var bTres = findViewById<Button>(R.id.bTres)
        var bSumas = findViewById<Button>(R.id.bSuma)
        var bCero = findViewById<Button>(R.id.bCero)
        var bPunto = findViewById<Button>(R.id.bPunto)
        var bIgual = findViewById<Button>(R.id.bIgual)

        var usuario: String? = intent.getStringExtra("usuario")
        tvUsuario.text = usuario

        bBorrar.setOnClickListener{

        }

        bMasMenos.setOnClickListener{

        }

        bPorcentaje.setOnClickListener {

        }

        bDivision.setOnClickListener {
            tvCajaNumeros.text = "/"
        }

        bSiete.setOnClickListener {
            tvCajaNumeros.text = "7"
        }

        bOcho.setOnClickListener {
            tvCajaNumeros.text = "8"
        }

        bNueve.setOnClickListener {
            tvCajaNumeros.text = "9"
        }

        bMultiplicacion.setOnClickListener {
            tvCajaNumeros.text = "*"
        }

        bCuatro.setOnClickListener {
            tvCajaNumeros.text = "4"
        }

        bCinco.setOnClickListener {
            tvCajaNumeros.text = "5"
        }

        bSeis.setOnClickListener {
            tvCajaNumeros.text = "6"
        }

        bMenos.setOnClickListener {
            tvCajaNumeros.text = "-"
        }

        bUno.setOnClickListener {
            tvCajaNumeros.text = "1"
        }

        bDos.setOnClickListener {
            tvCajaNumeros.text = "2"
        }

        bTres.setOnClickListener {
            tvCajaNumeros.text = "3"
        }

        bSumas.setOnClickListener {
            tvCajaNumeros.text = "+"
        }

        bCero.setOnClickListener {
            tvCajaNumeros.text = "0"
        }

        bPunto.setOnClickListener {
            tvCajaNumeros.text = "."
        }

        bIgual.setOnClickListener {

        }










    }
}