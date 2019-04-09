package com.example.firstkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))
        }

        button5.setOnClickListener {
            startActivity(Intent(this@MainActivity, ControlJavaActivity::class.java))
        }

        button6.setOnClickListener {
            startActivity(Intent(this@MainActivity, ControlKotlinActivity::class.java))
        }
    }
}
