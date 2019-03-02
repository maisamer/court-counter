package com.example.andriod.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int score_a;
    private int score_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        score_a=0;
        score_b=0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void reset(View view){
        score_a=0;
        score_b=0;
        displayForTeamA(score_a);
        displayForTeamB(score_b);
    }
    public void add3(View view){
        score_a+=3;
        displayForTeamA(score_a);
    }
    public void add2(View view){
        score_a+=2;
        displayForTeamA(score_a);
    }
    public void add1(View view){
        score_a++;
        displayForTeamA(score_a);
    }
    public void add3B(View view){
        score_b+=3;
        displayForTeamB(score_b);
    }
    public void add2B(View view){
        score_b+=2;
        displayForTeamB(score_b);
    }
    public void add1B(View view){
        score_b++;
        displayForTeamB(score_b);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_text_view);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_text_view);
        scoreView.setText(String.valueOf(score));
    }
}
