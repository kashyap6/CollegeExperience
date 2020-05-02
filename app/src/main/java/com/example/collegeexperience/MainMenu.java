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
        // music




        startService(new Intent(this, BackgroundMusicService.class));
        Button music = findViewById(R.id.btn_music);
        music.setOnClickListener (unused -> {
                    if (music.getText().equals("Music On")) {
                        stopService(new Intent(this, BackgroundMusicService.class));
                        music.setText("Music Off");
                    } else if (music.getText().equals("Music Off")) {
                        startService(new Intent(this, BackgroundMusicService.class));
                        music.setText("Music On");
                    }
        });




        Button gameStart = findViewById(R.id.startButton);
        gameStart.setOnClickListener (unused -> {
            Intent optionScreen = new Intent(this, OptionScreen.class);
            //TurnCalculation thisGame = new TurnCalculation();
            startActivity(optionScreen);
        });
        Button leaveGame = findViewById(R.id.exitButton);
        leaveGame.setOnClickListener (unused -> {
            stopService(new Intent(this, BackgroundMusicService.class));
            finish();
        });
    }
}
