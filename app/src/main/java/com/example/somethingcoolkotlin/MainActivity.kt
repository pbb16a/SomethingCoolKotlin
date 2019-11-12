package com.example.somethingcoolkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to button
        val btn_click_me = findViewById(R.id.start_btn) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            // start your next activity
            startActivity(intent)

        }
    }
}
