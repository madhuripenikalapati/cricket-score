package com.example.madhuri.cricketscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }*/
   int runsA = 0;
    int wicketsA = 0;
    int ballsA = 0;
    int oversA = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScoreForTeamA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOversA(String score) {
        TextView scoreView = (TextView) findViewById(R.id.oversA);
        scoreView.setText(String.valueOf(score));
    }

    public void increaseTeamOverA(View view) {
        if (ballsA == 5) {
            ballsA = 0;
            oversA += 1;
            displayOversA(oversA + "." + ballsA);
        } else {
            ballsA += 1;
            displayOversA(oversA + "." + ballsA);
        }
    }

    public void decreaseTeamOverA(View view) {
        if (oversA == 0 && ballsA == 0) {
            displayOversA(oversA + "." + ballsA);
        } else if (ballsA == 0) {
            ballsA = 5;
            oversA -= 1;
            displayOversA(oversA + "." + ballsA);
        } else {
            ballsA -= 1;
            displayOversA(oversA + "." + ballsA);
        }
    }

    public void add1runTeamA(View view) {
        runsA += 1;

        displayScoreForTeamA(runsA + "/" + wicketsA);
    }

    public void add2runTeamA(View view) {
        runsA += 2;

        displayScoreForTeamA(runsA + "/" + wicketsA);
    }

    public void add3runTeamA(View view) {
        runsA += 3;

        displayScoreForTeamA(runsA + "/" + wicketsA);
    }

    public void add4runTeamA(View view) {
        runsA += 4;

        displayScoreForTeamA(runsA + "/" + wicketsA);
    }

    public void add5runTeamA(View view) {
        runsA += 5;

        displayScoreForTeamA(runsA + "/" + wicketsA);
    }

    public void add6runTeamA(View view) {
        runsA += 6;

        displayScoreForTeamA(runsA + "/" + wicketsA);
    }

    public void increaseWicketA(View view) {
        wicketsA += 1;

        displayScoreForTeamA(runsA + "/" + wicketsA);
    }

    int runsB = 0;
    int wicketsB = 0;
    int ballsB = 0;
    int oversB = 0;

    public void displayScoreForTeamB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayOversB(String score) {
        TextView scoreView = (TextView) findViewById(R.id.oversB);
        scoreView.setText(String.valueOf(score));
    }

    public void increaseTeamOverB(View view) {
        if (ballsB == 5) {
            ballsB = 0;
            oversB += 1;
            displayOversB(oversB + "." + ballsB);
        } else {
            ballsB += 1;
            displayOversB(oversB + "." + ballsB);
        }
    }

    public void decreaseTeamOverB(View view) {
        if (oversB == 0 && ballsB == 0) {
            displayOversB(oversB + "." + ballsB);
        } else if (ballsB == 0) {
            ballsB = 5;
            oversB -= 1;
            displayOversB(oversB + "." + ballsB);
        } else {
            ballsB -= 1;
            displayOversB(oversB + "." + ballsB);
        }
    }

    public void add1runTeamB(View view) {
        runsB += 1;

        displayScoreForTeamB(runsB + "/" + wicketsB);
    }

    public void add2runTeamB(View view) {
        runsB += 2;

        displayScoreForTeamB(runsB + "/" + wicketsB);
    }

    public void add3runTeamB(View view) {
        runsB += 3;

        displayScoreForTeamB(runsB + "/" + wicketsB);
    }

    public void add4runTeamB(View view) {
        runsB += 4;

        displayScoreForTeamB(runsB + "/" + wicketsB);
    }

    public void add5runTeamB(View view) {
        runsB += 5;

        displayScoreForTeamB(runsB + "/" + wicketsB);
    }

    public void add6runTeamB(View view) {
        runsB += 6;

        displayScoreForTeamB(runsB + "/" + wicketsB);
    }

    public void increaseWicketB(View view) {
        wicketsB += 1;

        displayScoreForTeamB(runsB + "/" + wicketsB);
    }


    public void reset(View view) {
        wicketsA = 0;
        ballsA = 0;
        runsA = 0;
        oversA = 0;
        displayScoreForTeamA(runsA + "/" + wicketsA);
        displayOversA(oversA + "." + ballsA);

        wicketsB = 0;
        ballsB = 0;
        runsB = 0;
        oversB = 0;
        displayScoreForTeamB(runsB + "/" + wicketsB);
        displayOversB(oversB + "." + ballsB);
    }
}
