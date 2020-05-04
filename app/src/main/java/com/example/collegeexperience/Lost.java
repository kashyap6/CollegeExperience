package com.example.collegeexperience;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.TimeUnit;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Lost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lost);
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
