package com.galoppingtech.instantwhatsappmessagesender

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Send : Button= findViewById(R.id.send)
        Send.setOnClickListener(){
            val number : EditText = findViewById(R.id.phone)
            val pn = number.text
            val link = "https://wa.me/$pn"
            val web :WebView = findViewById(R.id.web)
            web.loadUrl(link)
        }
    }
}