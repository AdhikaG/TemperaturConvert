package com.example.temperaturconvert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Fahrenheit;
    private Button Reamur;
    private Button Kelvin;
    private TextView Result;
    private EditText input;
    double FinalResult =0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fahrenheit = findViewById(R.id.buttonFahrenheit);
        Reamur = findViewById(R.id.buttonReamur);
        Kelvin = findViewById(R.id.buttonKelvin);
        Result = findViewById(R.id.buttonResult);
        input = findViewById(R.id.input);
    }


    public void setFahrenheit(View view) {

                double temp = Double.parseDouble(input.getText().toString());
                FinalResult = (temp * 9 / 5) + 32;
                Result.setText(String.valueOf(FinalResult));

            }

     public void setReaumur(View view){

         double temp = Double.parseDouble(input.getText().toString());
         FinalResult = (temp * 4 / 5);
         Result.setText(String.valueOf(FinalResult));



     }

    public void setKelvin(View view){

        double temp = Double.parseDouble(input.getText().toString());
        FinalResult = (temp + 273.15);
        Result.setText(String.valueOf(FinalResult));



    }
}
