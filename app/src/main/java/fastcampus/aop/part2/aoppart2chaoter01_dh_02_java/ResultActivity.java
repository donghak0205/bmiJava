package fastcampus.aop.part2.aoppart2chaoter01_dh_02_java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int height = intent.getIntExtra("height", 0);
        int weight = intent.getIntExtra("weight", 0);

        double bmi = weight / Math.pow((height / 100.0), 2.0);
        String resultText;

        if(bmi>=35.0){
            resultText = "고도비만";
        } else if (bmi>=30.0){
            resultText = "중정도 비만";
        } else if (bmi>=25.0){
            resultText = "경도 비만";
        } else if (bmi>=23.0){
            resultText = "과체중";
        } else if (bmi>=18.5){
            resultText = "과체중";
        } else {
            resultText = "저체중!";
        }

        TextView bmiResultTextView = findViewById(R.id.bmiResultTextView);
        TextView resultTextView = findViewById(R.id.resultTextView);

        bmiResultTextView.setText(String.valueOf(bmi));
        resultTextView.setText(resultText);
    }
}
