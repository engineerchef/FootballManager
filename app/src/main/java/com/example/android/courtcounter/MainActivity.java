package com.example.android.courtcounter;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// Coded by Tolga DURAN
// www.tolgaduran.com
// tolgaduran1980@gmail.com

public class MainActivity extends AppCompatActivity {

    int pointA = 0;
    int pointB = 0;
    int foulA=0;
    int foulB;
    int penaltyA=0;
    int penaltyB=0;

    EditText teamA;
    EditText teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pointForTeamA(View view) {
        pointA = pointA + 1;
        displayPointA(pointA);
    }

    public void foulForTeamA(View view) {
        foulA = foulA + 1;
        displayFoulA(foulA);
    }

    public void penaltyForTeamA(View view) {
        penaltyA = penaltyA + 1;
        displayPenaltyA(penaltyA);
    }

    public void displayPenaltyA(int s){
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText("Penalty : "+s);
    }

    public void displayPointA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulA(int a){
        TextView scoreView=(TextView)findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(a));
    }






    public void pointForTeamB(View view) {
        pointB = pointB + 1;
        displayPointB(pointB);
    }

    public void foulForTeamB(View view) {
        foulB = foulB + 1;
        displayFoulB(foulB);
    }

    public void penaltyForTeamB(View view) {
        penaltyB = penaltyB + 1;
        displayPenaltyB(penaltyB);
    }

    public void displayPenaltyB(int s){
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText("Penalty : "+s);
    }

    public void displayPointB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }



    public void resetScore(View view){
        TextView penB = (TextView) findViewById(R.id.team_b_penalty);
        TextView scoreB = (TextView) findViewById(R.id.team_b_score);
        TextView foulB = (TextView) findViewById(R.id.team_b_foul);
        TextView penA = (TextView) findViewById(R.id.team_a_penalty);
        TextView scoreA = (TextView) findViewById(R.id.team_a_score);
        TextView foulA = (TextView) findViewById(R.id.team_a_foul);

        teamA=(EditText)findViewById(R.id.team_a_name);
        teamB=(EditText)findViewById(R.id.team_b_name);

        teamA.setText(R.string.team_a_name_text);
        teamB.setText(R.string.team_b_name_text);

        scoreA.setText(R.string.team_a_score);
        scoreB.setText(R.string.team_b_score);
        foulA.setText(R.string.team_a_foul);
        foulB.setText(R.string.team_b_foul);
        penA.setText(R.string.team_a_penalty);
        penB.setText(R.string.team_b_penalty);

    }


    public void setTeamAName(View view){
        final TextView t=(TextView)findViewById(R.id.team_a_text);
        teamA=(EditText)findViewById(R.id.team_a_name);

        teamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //teamA.setAllCaps(true);
                teamA.setText((CharSequence) t);
            }
        });
    }

    public void setTeamBName(View view){
        final TextView t=(TextView) findViewById(R.id.team_b_text);
        teamB=(EditText)findViewById(R.id.team_b_name);

        teamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //teamB.setAllCaps(true);
                teamB.setText((CharSequence)t);
            }
        });
    }
}
