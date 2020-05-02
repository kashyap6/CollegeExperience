package com.example.collegeexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class OptionScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_screen);
        Button backToMain = findViewById(R.id.btn_dropOut);
        backToMain.setOnClickListener (unused -> {
            finish();
        });
        Button buy = findViewById(R.id.btn_buyTextBook);
        buy.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button studyFriends = findViewById(R.id.btn_studyFriends);
        studyFriends.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button redLion = findViewById(R.id.btn_redLion);
        redLion.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button studyAlone = findViewById(R.id.btn_studyAlone);
        studyAlone.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button sleep = findViewById(R.id.btn_sleep);
        sleep.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button excersie = findViewById(R.id.btn_exercise);
        excersie.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button mckinley = findViewById(R.id.btn_mckinley);
        mckinley.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button work = findViewById(R.id.btn_work);
        work.setOnClickListener (unused -> {
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });

    }
}
