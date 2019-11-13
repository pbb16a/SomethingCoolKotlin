package com.example.somethingcoolkotlin

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main3Activity : AppCompatActivity() {
        var one = false
        var four = false
        var seven = false
        var eight = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        val btn1 = findViewById(R.id.button1) as Button
        val btn4 = findViewById(R.id.button4) as Button
        val btn7 = findViewById(R.id.button7) as Button
        val btn8 = findViewById(R.id.button8) as Button


        val where2=intent.getStringExtra("w_button")

        if(one){
            btn1.setTextColor(Color.parseColor("#B1B0B0"))
        }
        if(four){
            btn4.setTextColor(Color.parseColor("#B1B0B0"))
        }
        if(seven){
            btn7.setTextColor(Color.parseColor("#B1B0B0"))
        }
        if(eight){
            btn8.setTextColor(Color.parseColor("#B1B0B0"))
        }

//        if(where2 ==  "1"){
//            one = true
//        }
//        else if(where2 ==  "4"){
//            four = true
//        }
//        else if(where2 ==  "7"){
//            seven = true
//        }
//        else if(where2 ==  "8"){
//            eight = true
//        }


        // set on-click listener
        btn1.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("w_button", where2)
            intent.putExtra("value","1")
            one = true
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("w_button", where2)
            intent.putExtra("value","4")
            four = true
            startActivity(intent)
        }
        btn7.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("w_button", where2)
            intent.putExtra("value","7")
            seven = true
            startActivity(intent)
        }
        btn8.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("w_button", where2)
            intent.putExtra("value","8")
            eight = true
            startActivity(intent)
        }
    }
}
