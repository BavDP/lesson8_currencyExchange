package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.convertBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView convertResult = findViewById(R.id.convertResult);
                TextView convertingValue = findViewById(R.id.fromValue);
                TextView exchangeValue = findViewById(R.id.currentExchangeValue);
                double converting = Double.parseDouble(convertingValue.getText().toString());
                double exchange = Double.parseDouble(exchangeValue.getText().toString());
                double result = Math.round((converting / exchange) * 100) / 100.0;
                convertResult.setText(result + "");
            }
        });
    }
}