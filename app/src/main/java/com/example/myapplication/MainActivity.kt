package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonPindah = findViewById<Button>(R.id.buttonPindah)
        val edittext = findViewById<EditText>(R.id.editTextTextPersonName)
        buttonPindah.setOnClickListener {

            val input = edittext.text.toString()
           val dest =  Intent(this,Main2Activity::class.java)
            dest.putExtra("data",input)
            dest.putExtra("a",false)
            startActivity(dest)
        }

    }

    fun pindahWeb(view: View) {
        val intent = Intent(this,WebMainActivity::class.java)
        startActivity(intent)
    }

    fun pindahListview(view: View) {
        val intent = Intent(this,ListviewMainActivity::class.java)
        startActivity(intent)
    }

    fun clickCustomListview(view: View) {
        val intent = Intent(this,CustomListviewMainActivity::class.java)
        startActivity(intent)
    }
}