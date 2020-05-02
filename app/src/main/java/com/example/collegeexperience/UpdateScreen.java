package com.example.collegeexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class UpdateScreen extends AppCompatActivity {
    TurnCalculation turnCalc = new TurnCalculation();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_screen);
        Button next = findViewById(R.id.btn_Proceed);
        TextView message = (TextView) findViewById(R.id.btn_result);
        message.setText(turnCalc.turnCalculator());
        next.setOnClickListener (unused -> {
            Intent OptionScreen = new Intent(this, OptionScreen.class);
            startActivity(OptionScreen);
            finish();
        });
    }
}
