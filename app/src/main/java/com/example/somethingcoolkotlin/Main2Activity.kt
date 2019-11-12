package com.example.somethingcoolkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val btn1 = findViewById(R.id.button1) as Button
        // set on-click listener
        btn1.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            // start your next activity
            intent.putExtra("w_button","1")
            startActivity(intent)
        }

        val btn5 = findViewById(R.id.button5) as Button
        // set on-click listener
        btn5.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            // start your next activity
            startActivity(intent)
        }
        val btn6 = findViewById(R.id.button6) as Button
        // set on-click listener
        btn6.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            // start your next activity
            startActivity(intent)
        }
        val btn9 = findViewById(R.id.button9) as Button
        // set on-click listener
        btn9.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            // start your next activity
            startActivity(intent)
        }

        val where_=intent.getStringExtra("w_button")
        val what_=intent.getStringExtra("value")


        if (where_ == "1"){
            btn1.text = "this"
            true
        }
    }
}
