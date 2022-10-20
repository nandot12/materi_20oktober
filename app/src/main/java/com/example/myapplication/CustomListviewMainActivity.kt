package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CustomListviewMainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_listview_main)

        val name = arrayOf("Bali","Jogja","Lombok")
        val gambar = arrayOf(R.drawable.bali,R.drawable.jogja,R.drawable.lombok)

        val listCustom = findViewById<ListView>(R.id.listCustom)
      val adapter =   WisataAdapter(name,gambar)
        listCustom.adapter = adapter


    }
}