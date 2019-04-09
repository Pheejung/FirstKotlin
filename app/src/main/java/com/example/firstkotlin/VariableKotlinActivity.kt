package com.example.firstkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout_variable.*
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {

    var clickCount = 0
    val startTime = System.currentTimeMillis()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        var timeText = SimpleDateFormat("HH:MM:SS", Locale.KOREA).format(startTime)
        startTimeLabel.text = "Activity 시작시간 : ${timeText}"
        clickCountLabel.text = "클릭된 횟수 : ${clickCount}"

        button.setOnClickListener {
            clickCount = clickCount + 1
            clickCountLabel.text = "클릭된 횟수 : ${clickCount}"
        }
    }

    fun plus(param:Any) {
        if(param is Int) {
            var result = 3 + param
        } else if(param is Double) {
            var result = 3.0 + param
        }
    }
}
