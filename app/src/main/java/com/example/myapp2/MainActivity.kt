package com.example.myapp2

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var label : TextView

    lateinit var mostrar: Button
    lateinit var ocultar: Button
    lateinit var color1: Button
    lateinit var color2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        label = findViewById(R.id.texto)
        mostrar = findViewById(R.id.mostrar)
        ocultar = findViewById(R.id.ocultar)
        color1 = findViewById(R.id.color1)
        color2 = findViewById(R.id.color2)

        mostrar.setOnClickListener(){
            label.setText("Hola")
        }

        ocultar.setOnClickListener(){
            label.setText("Chau")
        }

        color1.setOnClickListener(){
            label.setTextColor(Color.RED)
        }
        color2.setOnClickListener(){
            label.setTextColor(Color.BLUE)
        }


    }
}