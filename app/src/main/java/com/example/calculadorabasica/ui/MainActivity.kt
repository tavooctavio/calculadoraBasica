package com.example.calculadorabasica.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.calculadorabasica.R
import com.example.calculadorabasica.databinding.ActivityMainBinding
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        firebaseAnalytics = Firebase.analytics
        val screenSplash = installSplashScreen()
        val view = binding.root
        setContentView(view)
        Thread.sleep ( 1000)
        screenSplash.setKeepOnScreenCondition{false}
        toFragmentNonReturn(CalculatorFragment())
    }

    //Fragment transition
    fun toFragmentNonReturn(fragmento: Fragment) {
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.cl_container, fragmento)
            .commit()
    }

    fun toFragment(fragmento: Fragment) {
        val fragmentManager: FragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.cl_container, fragmento).addToBackStack(null).commit()
    }
}