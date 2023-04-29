package com.example.memeapplicationn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        var btnxt2: Button = findViewById(R.id.btnxt2)
        btnxt2.setOnClickListener { val intent= Intent(this,MainActivity::class.java);
            startActivity(intent)}
        var btnxt3: Button = findViewById(R.id.btnxt3)
        btnxt3.setOnClickListener { val intent= Intent(this,MainActivity3::class.java);
            startActivity(intent)}
    }
    }
