package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Main2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textview = findViewById<TextView>(R.id.textViewResult)
       val result =  intent.getIntExtra("data",10)
        val status = intent.getBooleanExtra("a",false)


        textview.setText("$result")


    }
}