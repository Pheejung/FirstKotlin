package com.example.firstkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_control.*

class ControlKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_control)

        button.setOnClickListener {
            val number = numberField.text.toString().toInt()
            /*  if(number%2 == 0) {
                 Toast.makeText(applicationContext, "${number}는 2의 배수", Toast.LENGTH_SHORT).show()
             } else if(number%3 == 0) {
                 Toast.makeText(applicationContext, "${number}는 3의 배수", Toast.LENGTH_SHORT).show()
             } else {
                     Toast.makeText(applicationContext, "${number}", Toast.LENGTH_SHORT).show()
             } */
        when {
            number%2 == 0 -> toast("${number}는 2의 배수")
            number%3 == 0 -> toast("${number}는 3의 배수", 1)
            else -> toast("${number}")
        }

            when(number) {
                4 -> button.text = "실행 : 4"
                9 -> button.text = "실행 : 9"
                else -> button.text = "그냥 실행"
            }
        }
    }
}
