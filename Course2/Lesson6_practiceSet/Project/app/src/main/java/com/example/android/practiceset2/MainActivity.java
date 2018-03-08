package com.example.android.practiceset2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE

/*

        display1("This is Box 1.");
        display2("And this is Box 2.");
        display3("And look! Box 3!");


        int raspberryPrice = 5;
        display1("1 box: $" + raspberryPrice);
        raspberryPrice = 10;
        display2("2 boxes: $" + (raspberryPrice));
        display3("3 boxes: $" + (raspberryPrice * 3));


        //sleep debt
        int weekday = 5;
        int weekend = 9;
        int optimalHours = 7 * 8;

        int actualHours = weekday * 5;
        actualHours = actualHours + weekend * 2;
        int solution = optimalHours - actualHours;
        display(solution);

*/

        //Email directory
        String firstName = "Lyla";
        String lastName = "Fujiwara";
        String contactInfo = firstName + " " + lastName;
        contactInfo = contactInfo + "<" + lastName + "." + firstName + "@justjava.com>";
        display(contactInfo);

/*
        //Cola VS pepsi
        //local variables must be initialized.
        //local variables go to trash when it finished execute.


        public class MainActivity extends AppCompatActivity {
    ...

            public void voteUdacicola(View view) {
                int udacicolaVotes = 0;
                udacicolaVotes = udacicolaVotes + 1;
            }

            public void votePepcity(View view) {
                int pepcityVotes;
                pepcityVotes = pepcityVotes + 1;
            }

            public void showMeVotes(View view) {
                display(udacicolaVotes + " vs. " + pepcityVotes);
            }
    ...
        }
*/
/*
        //Healthy Living Example
        //global variable

        public class MainActivity extends AppCompatActivity {
            int healthLevel;
            String message;
    ...

            public void yes(View view) {
                healthLevel = healthLevel + 1;
                message = "You answered yes, current health level is " + healthLevel;
                display(message);
            }

            public void no(View view) {
                healthLevel = healthLevel - 1;
                message = "You answered no, current health level is " + healthLevel;
                display(message);
            }

            public void sometimes(View view) {
                healthLevel = healthLevel + 0;
                message = "You answered sometimes, current health level is " + healthLevel;
                display(message);
            }
    ...
        }
*/

    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text + "");
    }

    public void display1(String text) {
        display(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }
}