package com.example.firstkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_view_binding.*

class BmiKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_view_binding)

        bmiButton.setOnClickListener {
            val tall = tallField.text.toString().toDouble()
            val weight = weightField.text.toString().toDouble()
            val bmi = weight / Math.pow(tall/100.0, 2.0)
            resultLabel.text = "키 : ${tall}, 몸무게 : ${weight}, BMI : ${bmi}"
        }
    }
}
