package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebMainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_main)

        val web = findViewById<WebView>(R.id.web)
        web.loadUrl("https://www.udacoding.com")
        web.settings.javaScriptEnabled = true
        web.settings.allowContentAccess = true

    }
}