package com.example.firstkotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class VariableJavaActivity extends AppCompatActivity {

    int clickCount = 0;
    long startTime = System.currentTimeMillis();
    TextView startTimeLabel;
    TextView clickCountLabel;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_variable);

        startTimeLabel = findViewById(R.id.startTimeLabel);
        clickCountLabel = findViewById(R.id.clickCountLabel);
        button = findViewById(R.id.button);

        String timeText = new SimpleDateFormat("HH:MM:SS", Locale.KOREA).format(startTime);
        startTimeLabel.setText("Activity 시작시간 : " + timeText);
        clickCountLabel.setText("클릭된 횟수 : " + clickCount);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount = clickCount + 1;
                clickCountLabel.setText("클릭된 횟수 : " + clickCount);
            }
        });
    }

    public static void plus(Object param) {
        if(param instanceof Integer) {
            double result = 3+ (Integer)param;
        }
    }
}
