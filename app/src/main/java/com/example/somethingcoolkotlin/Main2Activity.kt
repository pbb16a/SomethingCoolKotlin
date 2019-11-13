package com.example.somethingcoolkotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val where1=intent.getStringExtra("w_button")
        val what=intent.getStringExtra("value")



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
            intent.putExtra("w_button","5")
            startActivity(intent)
        }
        val btn6 = findViewById(R.id.button6) as Button
        // set on-click listener
        btn6.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            // start your next activity
            intent.putExtra("w_button","6")
            startActivity(intent)
        }
        val btn9 = findViewById(R.id.button9) as Button
        // set on-click listener
        btn9.setOnClickListener {
            val intent = Intent(this, Main3Activity::class.java)
            // start your next activity
            intent.putExtra("w_button","9")
            startActivity(intent)
        }




        if (where1 == "1"){
            btn1.setText(what)
        }
        else if (where1 == "5"){
            btn5.setText(what)
        }
        else if (where1 == "6"){
            btn6.setText(what)
        }
        else if (where1 == "9"){
            btn9.setText(what)
        }



    }
}
