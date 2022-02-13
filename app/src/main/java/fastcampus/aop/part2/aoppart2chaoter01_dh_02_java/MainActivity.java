package fastcampus.aop.part2.aoppart2chaoter01_dh_02_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.temporal.TemporalAccessor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* View 속성 가져오기*/
        EditText heightEditText = findViewById(R.id.heightEditText);
        EditText weightEditText = findViewById(R.id.weightEditText);
        Button resultButton = findViewById(R.id.resultButton);

        resultButton.setOnClickListener(v -> {
            if (heightEditText.getText().toString().isEmpty()
                    || weightEditText.getText().toString().isEmpty()) {
                Toast.makeText(getApplicationContext(), "빈값이 존재합니다.", Toast.LENGTH_LONG).show();
                return;
            }

            Intent intent = new Intent(this,ResultActivity.class);
            intent.putExtra("height", Integer.parseInt(heightEditText.getText().toString()));
            intent.putExtra("weight", Integer.parseInt(weightEditText.getText().toString()));

            startActivity(intent);
        });

    }

}