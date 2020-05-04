package com.example.collegeexperience;

import androidx.appcompat.app.AppCompatActivity;
import java.util.concurrent.TimeUnit;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class OptionScreen extends AppCompatActivity {
    public static TurnCalculation thisGame = new TurnCalculation();
    public static int month = 0;
    public static int sem = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_screen);
        month++;
        if (month == 5) {
            month = 1;
            sem++;
        }
        if (sem == 9) {
            Intent UpdateScreen = new Intent(this, Victory.class);
            startActivity(UpdateScreen);
            finish();
        }
        TextView month = (TextView) findViewById(R.id.MonthID);
        month.setText("Month(1-4):\t\t    " + month);

        //
        //Display
        //
        //TurnCalculation thisGame = new TurnCalculation();
        if (thisGame.sanity > 100) {
            thisGame.sanity = 100;
        } else if (thisGame.sanity <= 0) {
            Intent UpdateScreen = new Intent(this, Lost.class);
            startActivity(UpdateScreen);
        }
        TextView sanityButton = (TextView) findViewById(R.id.sanityID);
        sanityButton.setText("Sanity:\t\t\t\t\t    " + String.valueOf(thisGame.sanity));
        //
        if (thisGame.money > 100) {
            thisGame.money = 100;
        } else if (thisGame.money <= 0) {
            Intent UpdateScreen = new Intent(this, Lost.class);
            startActivity(UpdateScreen);
        }
        TextView moneyButton = (TextView) findViewById(R.id.MoneyID);
        moneyButton.setText("Money:\t\t\t\t\t  " + String.valueOf(thisGame.money));
        //
        if (thisGame.restlessness < 0) {
            thisGame.restlessness = 0;
        } else if (thisGame.restlessness >= 100) {
            Intent UpdateScreen = new Intent(this, Lost.class);
            startActivity(UpdateScreen);
        }
        TextView restlessnessButton = (TextView) findViewById(R.id.RestlessnessID);
        restlessnessButton.setText("Restlessness:\t" + String.valueOf(thisGame.restlessness));
        //
        if (thisGame.education > 100) {
            thisGame.education = 100;
        } else if (thisGame.education <= 0) {
            Intent UpdateScreen = new Intent(this, Lost.class);
            startActivity(UpdateScreen);
        }
        TextView educationButton = (TextView) findViewById(R.id.educationID);
        educationButton.setText("Education:\t\t\t  "+ String.valueOf(thisGame.education));
        //
        if (thisGame.health > 100) {
            thisGame.health = 100;
        } else if (thisGame.health <= 0) {
            Intent UpdateScreen = new Intent(this, Lost.class);
            startActivity(UpdateScreen);
        }
        TextView healthButton = (TextView) findViewById(R.id.healthyID);
        healthButton.setText("Health:\t\t\t\t\t\t  " + String.valueOf(thisGame.health));
        //
        //
        //
        Button backToMain = findViewById(R.id.btn_dropOut);
        backToMain.setOnClickListener (unused -> {
            backToMain.setText("Are You Sure?");
            Button sure = findViewById(R.id.btn_dropOut);
            sure.setOnClickListener (unuseded -> {
                finish();
            });
        });
        Button buy = findViewById(R.id.btn_buyTextBook);
        buy.setOnClickListener (unused -> {
            thisGame.education += 5;
            thisGame.money -= 10;
            Toast.makeText(this, "Education+5\nMoney-10",Toast.LENGTH_SHORT).show();
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button studyFriends = findViewById(R.id.btn_studyFriends);
        studyFriends.setOnClickListener (unused -> {
            thisGame.education += 3;
            thisGame.sanity += 5;
            thisGame.restlessness += 10;
            Toast.makeText(this, "Education+3\nRestlessness+10\nSanity+5",Toast.LENGTH_SHORT).show();
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button redLion = findViewById(R.id.btn_redLion);
        redLion.setOnClickListener (unused -> {
            thisGame.sanity += 7;
            thisGame.education -= 5;
            thisGame.money -= 5;
            thisGame.health -= 7;
            Toast.makeText(this, "Education-5\nmoney-5\nSanity+7\nhealth-7",Toast.LENGTH_SHORT).show();
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button studyAlone = findViewById(R.id.btn_studyAlone);
        studyAlone.setOnClickListener (unused -> {
            thisGame.education += 10;
            thisGame.restlessness += 9;
            thisGame.sanity -= 10;
            Toast.makeText(this, "Education+10\nRestlessness+9\nSanity-10",Toast.LENGTH_SHORT).show();
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button sleep = findViewById(R.id.btn_sleep);
        sleep.setOnClickListener (unused -> {
            thisGame.restlessness -= 15;
            thisGame.sanity += 5;
            thisGame.health += 5;
            thisGame.education -= 3;
            Toast.makeText(this, "Health+5\nRestlessness-15\nSanity+5\nEducation-3",Toast.LENGTH_SHORT).show();
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button excersie = findViewById(R.id.btn_exercise);
        excersie.setOnClickListener (unused -> {
            thisGame.sanity += 5;
            thisGame.health += 10;
            thisGame.restlessness += 10;
            thisGame.education -= 3;
            Toast.makeText(this, "Health+10\nRestlessness+10\nSanity+5\nEducation-3",Toast.LENGTH_SHORT).show();
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button mckinley = findViewById(R.id.btn_mckinley);
        mckinley.setOnClickListener (unused -> {
            thisGame.health += 3;
            thisGame.sanity += 3;
            thisGame.education -= 3;
            Toast.makeText(this, "Health+3\nSanity+3\nEducation-3",Toast.LENGTH_SHORT).show();
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });
        Button work = findViewById(R.id.btn_work);
        work.setOnClickListener (unused -> {
            thisGame.money += 15;
            thisGame.restlessness += 5;
            thisGame.education -= 3;
            Toast.makeText(this, "Money+15\nRestlessness+5\nEducation-3",Toast.LENGTH_SHORT).show();
            Intent UpdateScreen = new Intent(this, UpdateScreen.class);
            startActivity(UpdateScreen);
            finish();
        });

    }
}
