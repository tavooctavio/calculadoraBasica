package com.example.calculadorabasica.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.calculadorabasica.R
import com.example.calculadorabasica.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment(R.layout.fragment_calculator) {

    private lateinit var binding: FragmentCalculatorBinding

    var numero1: Double = 0.0
    var numero2: Double = 0.0
    var respuesta = 0.0;
    var history = ""


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentCalculatorBinding.bind(view)

        //var imgBackspace = binding.imgBackspace
        var tvCajaNumeros = binding.tvNumberBox
        var tvHistory = binding.tvHistory
        var tvDeleteAll = binding.tvDeleteAll
        var tvMasMenos = binding.tvPlusMinus
        var tvPorcentaje = binding.tvPercent
        var tvDivision = binding.tvDivision
        var tvSiete = binding.tvSeven
        var tvOcho = binding.tvEight
        var tvNueve = binding.tvNine
        var tvMultiplicacion = binding.tvMultiplicacion
        var tvCuatro = binding.tvFour
        var tvCinco = binding.tvFive
        var tvSeis = binding.tvSix
        var tvMenos = binding.tvMinus
        var tvUno = binding.tvOne
        var tvDos = binding.tvTwo
        var tvTres = binding.tvThree
        var tvSumas = binding.tvPlus
        var tvCero = binding.tvZero
        var tvPunto = binding.tvSpot
        var tvIgual = binding.tvEquals
        var resultado = 0.0
        var operacion = 0

        tvDeleteAll.setOnClickListener{
            tvCajaNumeros.text = " "
            numero1 = 0.0
            numero2 = 0.0
        }

        tvMasMenos.setOnClickListener{
            if (tvCajaNumeros.text != "" && tvCajaNumeros.text != " "){
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
        }

        tvPorcentaje.setOnClickListener {
            if (tvCajaNumeros.text != "" && tvCajaNumeros.text != " "){
                numero1 = tvCajaNumeros.text.toString().toDouble()
                respuesta = numero1 / 100
                tvCajaNumeros.text = "${respuesta}"
                history = numero1.toString() + " / 100"
                tvHistory.text = history
            }
        }

        tvDivision.setOnClickListener {
            if (tvCajaNumeros.text != "" && tvCajaNumeros.text != " "){
                history += tvCajaNumeros
                operacion = 1
                numero1 = tvCajaNumeros.text.toString().toDouble()
                tvCajaNumeros.text = " "
            }
        }

        tvSiete.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}7"
        }

        tvOcho.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}8"
        }

        tvNueve.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}9"
        }

        tvMultiplicacion.setOnClickListener {
            if (tvCajaNumeros.text != "" && tvCajaNumeros.text != " "){
                history += tvCajaNumeros
                operacion = 2
                numero1 = tvCajaNumeros.text.toString().toDouble()
                tvCajaNumeros.text = " "
            }
        }

        tvCuatro.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}4"
        }

        tvCinco.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}5"
        }

        tvSeis.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}6"
        }

        tvMenos.setOnClickListener {
            if (tvCajaNumeros.text != "" && tvCajaNumeros.text != " "){
                history += tvCajaNumeros
                operacion = 3
                numero1 = tvCajaNumeros.text.toString().toDouble()
                tvCajaNumeros.text = " "
            }
        }

        tvUno.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}1"
        }

        tvDos.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}2"
        }

        tvTres.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}3"
        }

        tvSumas.setOnClickListener {
            if (tvCajaNumeros.text != "" && tvCajaNumeros.text != " "){
                history += tvCajaNumeros
                operacion = 4
                numero1 = tvCajaNumeros.text.toString().toDouble()
                tvCajaNumeros.text = " "
            }
        }

        tvCero.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}0"
        }

        tvPunto.setOnClickListener {
            tvCajaNumeros.text = "${tvCajaNumeros.text}."
        }

        tvIgual.setOnClickListener {
            if (tvCajaNumeros.text != "" && tvCajaNumeros.text != " "){
                numero2= tvCajaNumeros.text.toString().toDouble()
                when(operacion){
                    1 -> {
                        resultado = numero1 / numero2
                        history = numero1.toString() + " ÷ " + numero2 + " = "
                    }
                    2 -> {
                        resultado = numero1 * numero2
                        history = numero1.toString() + " x " + numero2 + " = "
                    }
                    3 -> {
                        resultado = numero1 - numero2
                        history = numero1.toString() + " - " + numero2 + " = "
                    }
                    4 -> {
                        resultado = numero1 + numero2
                        history = numero1.toString() + " + " + numero2 + " = "
                    }
                    else -> {
                        tvCajaNumeros.text = " "
                    }
                }

                tvHistory.text = history + resultado.toString()
                tvCajaNumeros.text = resultado.toString()
            }
        }
    }
}