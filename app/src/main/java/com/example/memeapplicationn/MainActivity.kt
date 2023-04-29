package com.example.memeapplicationn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btNxt1: Button = findViewById(R.id.btNxt1)
        btNxt1.setOnClickListener { val intent= Intent(this,MainActivity1::class.java);
            startActivity(intent)}

    }
}