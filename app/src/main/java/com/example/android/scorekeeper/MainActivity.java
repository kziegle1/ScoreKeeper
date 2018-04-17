package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

public class MainActivity extends AppCompatActivity {
    // Tracks the score for Seattle Seahawks
    int scoreSeahawks = 0;
    // Tracks the score for San Francisco 49ers
    int score49er = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Seahawks.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.SeahawksScore);
        scoreView.setText(String.valueOf(score));
    }

    public void addSixForSeahawks(View view) {
        scoreSeahawks = scoreSeahawks + 6;
        displayForTeamA(scoreSeahawks);

    }
    public void addThreeForSeahawks(View view) {
        scoreSeahawks = scoreSeahawks + 3;
        displayForTeamA(scoreSeahawks);

    }
    public void addTwoForSeahawks(View view) {
        scoreSeahawks = scoreSeahawks + 2;
        displayForTeamA(scoreSeahawks);
    }

    public void addOneForSeahawks(View view) {
        scoreSeahawks = scoreSeahawks + 1;
        displayForTeamA(scoreSeahawks);

    }

    /**
     * Displays the given score for 49ers.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.FortyninerScore);
        scoreView.setText(String.valueOf(score));
    }

    // Displays the score for plus 6 points, touchdown.
    public void addSixFor49ers(View view) {
        score49er = score49er + 6;
        displayForTeamB(score49er);
    }

    // Displays the score for plus 3 points, field goal.
    public void addThreeFor49ers(View view) {
        score49er = score49er + 3;
        displayForTeamB(score49er);

    }

    // Displays the score for plus 2 points, two-point conversion and safety.
    public void addTwoFor49ers(View view) {
        score49er = score49er + 2;
        displayForTeamB(score49er);
    }

    // Displays the score for plus 1 points, extra point.
    public void addOneFor49ers(View view) {
        score49er = score49er + 1;
        displayForTeamB(score49er);


    }

    // Resets the score to zero
    public void resetScore(View view) {
        score49er = 0;
        displayForTeamB(score49er);
        scoreSeahawks = 0;
        displayForTeamA(scoreSeahawks);

    }
}
