package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.time.temporal.ValueRange

class MainActivity : AppCompatActivity() {

    var numero1: Double = 0.0
    var numero2: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var tvUsuario = findViewById<TextView>(R.id.tvUsuario)
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

        var operacion = 0


        /*var usuario: String? = intent.getStringExtra("usuario")
        tvUsuario.text = usuario */

        bBorrar.setOnClickListener{
            tvCajaNumeros.text = " "
        }

        bMasMenos.setOnClickListener{
            var respuesta = 0.0;
            numero1 = tvCajaNumeros.text.toString().toDouble()

            if (numero1 > 0 ){
                tvCajaNumeros.text = "-${tvCajaNumeros.text}"
            }else if (numero1 < 0){
                respuesta = numero1 * (-1)
                tvCajaNumeros.text = "${respuesta}"
            }else{
                tvCajaNumeros.text = tvCajaNumeros.text
            }
        }

        bPorcentaje.setOnClickListener {
            var respuesta = 0.0
            numero1 = tvCajaNumeros.text.toString().toDouble()
            respuesta = numero1 / 100
            tvCajaNumeros.text = "${respuesta}"
        }

        bDivision.setOnClickListener {
            operacion = 1
            numero1 = tvCajaNumeros.text.toString().toDouble()
            tvCajaNumeros.text = " "
        }

        bSiete.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}7"
        }

        bOcho.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}8"
        }

        bNueve.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}9"
        }

        bMultiplicacion.setOnClickListener {
            operacion = 2
            numero1 = tvCajaNumeros.text.toString().toDouble()
            tvCajaNumeros.text = " "
        }

        bCuatro.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}4"
        }

        bCinco.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}5"
        }

        bSeis.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}6"
        }

        bMenos.setOnClickListener {
            operacion = 3
            numero1 = tvCajaNumeros.text.toString().toDouble()
            tvCajaNumeros.text = " "
        }

        bUno.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}1"
        }

        bDos.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}2"
        }

        bTres.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}3"
        }

        bSumas.setOnClickListener {
            operacion = 4
            numero1 = tvCajaNumeros.text.toString().toDouble()
            tvCajaNumeros.text = " "
        }

        bCero.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}0"
        }

        bPunto.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}."
        }

        bIgual.setOnClickListener {

            numero2= tvCajaNumeros.text.toString().toDouble()

            var resultado = when(operacion){
                1 -> numero1 / numero2
                2 -> numero1 * numero2
                3 -> numero1 - numero2
                4 -> numero1 + numero2
                else -> tvCajaNumeros.text = " "
            }

            tvCajaNumeros.text = resultado.toString()
        }



    }

}