package com.example.memeapplicationn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        var btprev2: Button = findViewById(R.id.btprev3)
        btprev2.setOnClickListener { val intent= Intent(this,MainActivity2::class.java);
            startActivity(intent)}

    }
}