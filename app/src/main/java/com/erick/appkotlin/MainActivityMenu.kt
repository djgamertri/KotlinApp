package com.erick.appkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }
    fun ClickButton(view: View) {
        when (view.id) {
            R.id.buttonCalculator -> {
                val intento = Intent(this, MainActivity::class.java)
                startActivity(intento)
            }
            R.id.buttonCard -> {
                val intento = Intent(this, MainActivityCards::class.java)
                startActivity(intento)
            }
            R.id.buttonBank -> {
                val intento = Intent(this, MainActivityBank::class.java)
                startActivity(intento)
            }

        }
    }
}