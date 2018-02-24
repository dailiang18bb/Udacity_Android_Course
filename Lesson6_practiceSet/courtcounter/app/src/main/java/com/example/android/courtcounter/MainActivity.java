package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int num) {
        TextView teamA = (TextView) findViewById(R.id.team_a_score);
        teamA.setText("" + num);
    }


    public void aPoint3Btn(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);

    }

    public void aPoint2Btn(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void aPoint1Btn(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamB(int num) {
        TextView teamB = (TextView) findViewById(R.id.team_b_score);
        teamB.setText("" + num);
    }

    public void bPoint3Btn(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);

    }

    public void bPoint2Btn(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void bPoint1Btn(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetBtn(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
