package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etValue1, etValue2;
    private TextView tvSum;
    private Button btnCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);

        etValue1 = findViewById(R.id.etValue1);
        etValue2 = findViewById(R.id.etValue2);
        tvSum = findViewById(R.id.tvSum);
        btnCal = findViewById(R.id.btnCal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateSum();
            }
        });
    }

    private void calculateSum() {
        String value1 = etValue1.getText().toString().trim();
        String value2 = etValue2.getText().toString().trim();

        if (!value1.isEmpty() && !value2.isEmpty()) {
            float num1 = Float.parseFloat(value1);
            float num2 = Float.parseFloat(value2);

            float sum = num1 + num2;
            tvSum.setText("Sum: " + sum);
        } else {
            tvSum.setText("Sum: N/A");
        }
    }
}