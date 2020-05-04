package com.example.collegeexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Victory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victory);
        Button play = findViewById(R.id.playagain);
        OptionScreen.thisGame = new TurnCalculation();
        OptionScreen.month = 0;
        OptionScreen.sem = 1;
        play.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, MainMenu.class);
            startActivity(UpdateScreen);
            finish();
        });
    }
}
