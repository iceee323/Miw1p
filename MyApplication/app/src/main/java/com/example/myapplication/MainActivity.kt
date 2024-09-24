package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }

    var textInvis = false;
    fun buttonClicked(view: View) {
        val textV = findViewById<TextView>(R.id.my_lovely_text)
        if (!textInvis) {
            textV.text = "It worked"
        } else {
            textV.text = ""
        }
        textInvis = !textInvis
    }
}