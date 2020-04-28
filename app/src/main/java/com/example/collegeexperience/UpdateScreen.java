package com.example.collegeexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class UpdateScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_screen);
        Button next = findViewById(R.id.btn_Proceed);
        next.setOnClickListener (unused -> {
            Intent OptionScreen = new Intent(this, OptionScreen.class);
            startActivity(OptionScreen);
            finish();
        });
    }
}
