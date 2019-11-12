package com.example.somethingcoolkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btn1 = findViewById(R.id.button1) as Button
        // set on-click listener
        btn1.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            // start your next activity
            val where=intent.getStringExtra("w_button")
            intent.putExtra("w_button", where)
            intent.putExtra("value","1")
            startActivity(intent)
        }

    }

}
