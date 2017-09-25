package com.example.apple.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamA(scoreTeamB);
    }

    // TEAM A ==================================
    // global variable for team score
    int scoreTeamA = 0;
    // Display Board
    public void displayForTeamA(int score) {
        TextView teamATextView = (TextView) findViewById(R.id.team_A_text_view);
        teamATextView.setText(String.valueOf(score));
    }

    // Free throw point Added
    public void addFreeThrowScoreA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    // Two point Adder
    public void addTwoPointerScoreA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    // Three point adder
    public void addThreePointerScoreA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    // TEAM B ==================================
    // global variable for team score
    int scoreTeamB = 0;
    // Display Board
    public void displayForTeamB(int score) {
        TextView teamBTextView = (TextView) findViewById(R.id.team_B_text_view);
        teamBTextView .setText(String.valueOf(score));
    }

    // Free throw point Added
    public void addFreeThrowScoreB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    // Two point Adder
    public void addTwoPointerScoreB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    // Three point adder
    public void addThreePointerScoreB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    // RESET CODE
    public void resetScoreForBothTeam(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
