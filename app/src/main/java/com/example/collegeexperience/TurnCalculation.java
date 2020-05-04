package com.example.collegeexperience;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class TurnCalculation extends AppCompatActivity {
    public int money = 90;
    public int sanity = 80;
    public int education = 60;
    public int restlessness = 40;
    public int health = 90;
    final int Parants_give_money = 25;
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

    private int thresh = 10;
    public String turn() {
        //SPECIAL EVENTS

        //POSITIVE EVENTS
        int rng = turncalc.nextInt(20);
        if (rng == 3) {
            parentmoney();
            return "You parents decided to send you some money!";
        } else if (rng == 4) {
            call();
            return "Your parents called!\n\n\nMoney+5";
        }
        //THESE ARE ALL OF THE NORMAL STAT CHECKS
        rng = turncalc.nextInt(6);
        System.out.println(thresh +" :: " +rng + education/10.0);
        if (thresh > rng + education/10.0) {
            popQuiz();
            return "A Pop Quiz Occured";
        } else if (thresh > rng + money/10.0) {
            cantPay();
            return "Can't afford Spotify and Netflix this month";
        } else if (thresh > rng + sanity/10.0) {
            goneMad();
            return "You went insane";
        } else if (thresh > rng + restlessness/10.0) {
            passOut();
            return "You passed out";
        } else if (thresh > health/10.0 + rng) {
            getSick();
            return "You got sick";
        } else {
            return "Nothing special happened";
        }
        //first check if stats are 0, if so trigger even always
        //then use thresholds and rng to see if even will trigger THRESH = 10
    }

    //EVENT METHODS
    public void popQuiz() {

    }
    public void cantPay() {

    }
    public void goneMad() {


    }
    public void passOut() {

    }
    public void getSick() {

    }
    //OTHER EVENTS
    public void parentmoney() {
        money += 5;
    }
    public void finals() {

    }
    public void call() {

    }
    public void cantPayBook() {

    }
}
