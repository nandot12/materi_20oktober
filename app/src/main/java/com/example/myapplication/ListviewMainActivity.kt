package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ListviewMainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview_main)

        val list = findViewById<ListView>(R.id.listview)

        //data array - adapter - listview
        val data = arrayOf("Kotlin","Java","Phyton","PHP","Swift","Ruby","Kotlin","Java","Phyton","PHP","Swift","Ruby","Kotlin","Java","Phyton","PHP","Swift","Ruby")

       val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,data)

        list.adapter = adapter

        list.setOnItemClickListener { adapterView, view, i, l ->

            Toast.makeText(this, data[i], Toast.LENGTH_SHORT).show()
        }
    }
}