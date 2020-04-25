package com.example.collegeexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Button gameStart = findViewById(R.id.startButton);
        gameStart.setOnClickListener (unused -> {
            Intent optionScreen = new Intent(this, OptionScreen.class);
            startActivity(optionScreen);
        });
        finish();
    }
}
