package com.example.memeapplicationn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btprev3: Button = findViewById(R.id.btprev3)
        btprev3.setOnClickListener { val intent= Intent(this,MainActivity3::class.java);
            startActivity(intent)}
        var btnxt4: Button = findViewById(R.id.btnxt4)
        btnxt4.setOnClickListener { val intent= Intent(this,MainActivity4::class.java);
            startActivity(intent)}
    }

    }
