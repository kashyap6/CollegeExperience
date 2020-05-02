package com.example.collegeexperience;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class TurnCalculation extends AppCompatActivity {
    public static int money = 90;
    public static int sanity = 80;
    public static int education = 60;
    public static int restlessness = 40;
    public static int health = 90;
    final static int Parants_give_money = 25;
    private Random turncalc = new Random();


    public String turnCalculator() {
        int probabilityRange = (int) Math.floor(((25) + (100 - sanity) + (100 - education) + (restlessness)) * 1.36);
        System.out.println(probabilityRange);
        int turnNumber = turncalc.nextInt(probabilityRange);
        System.out.println(turnNumber);
        if (turnNumber >= 0 && turnNumber < (100 - education)) {
            //Pop quiz happened
            return "A Pop Quiz Occured";
        } else if (turnNumber >= (100 - education) && turnNumber < (100 - education) + 25) {
            //Call from parents happened
            return "Your Parents Called" + "\n" + "They gave you Cash Money$";

        } else if (turnNumber >= (100 - education) + 25 && turnNumber < (100 - education) + 25 + (100 - sanity)) {
            //You went mad
            return "You went mad";
        } else if (turnNumber >= (100 - education) + 25 + (100 - sanity) && turnNumber < (100 - education) + 25 + (100 - sanity) + (restlessness)) {
            //You passed out
            return "You Passed Out";
        } else {
            //nothing happened
            return "No Event Occured";
        }

    }
}
