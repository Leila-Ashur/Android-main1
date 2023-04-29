package com.example.memeapplicationn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btprev3: Button = findViewById(R.id.btprev3)
        btprev3.setOnClickListener { val intent= Intent(this,MainActivity1::class.java);
            startActivity(intent)}
        var btnxt3: Button = findViewById(R.id.btnxt3)
        btnxt3.setOnClickListener { val intent= Intent(this,MainActivity2::class.java);
            startActivity(intent)}
    }
    }
