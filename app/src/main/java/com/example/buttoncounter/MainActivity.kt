package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv = findViewById<TextView>(R.id.textView)
        var btn = findViewById<TextView>(R.id.button)
        btn.setOnClickListener{
           var newTV = tv.text.toString().toInt()+1
            tv.text = "$newTV"
        }
    }
}