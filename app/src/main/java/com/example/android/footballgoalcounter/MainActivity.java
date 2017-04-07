package com.example.android.footballgoalcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import static android.R.attr.max;
import static com.example.android.footballgoalcounter.R.dimen.plus;
import static com.example.android.footballgoalcounter.R.dimen.score;

public class MainActivity extends AppCompatActivity {

    int ScoreHome = 0;
    int ScoreAway = 0;

    int ShotsA =0;
    int ShotsB = 0;

    int ShotsOffA =0;
    int ShotsOffB = 0;

    int ShotsCornersA =0;
    int ShotsCornersB = 0;

    int ShotsOffsideA =0;
    int ShotsOffsideB = 0;

    int ShotsFoulsA =0;
    int ShotsFoulsB = 0;

    int YellowA =0;
    int YellowB =0;

    int RedA =0;
    int RedB =0;

    int KicksA =0;
    int KicksB =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

//    Score

    public void ScoreA (View view){
        ScoreHome = ScoreHome+1;
        displayScoreA(ScoreHome);

    }

    public void ScoreB (View view){
        ScoreAway = ScoreAway+1;
        displayScoreB(ScoreAway);
    }


    public void displayScoreA (int score){
        TextView txtScoreA = (TextView) findViewById(R.id.ScoreA);
        txtScoreA.setText(String.valueOf(score));
    }

    public void displayScoreB (int score){
        TextView txtScoreB = (TextView) findViewById(R.id.ScoreB);
        txtScoreB.setText(String.valueOf(score));
    }

//    shots on target

    public void displayProgressA( int score){
        ProgressBar prgA = (ProgressBar) findViewById(R.id.progressBarShotsA);
        TextView txtShotsA = (TextView) findViewById(R.id.shotsTextA);
        prgA.setProgress(score);
        txtShotsA.setText(String.valueOf(score));

    }
    public void displayProgressB(int score){
        ProgressBar prgB = (ProgressBar) findViewById(R.id.progressBarShotsB);
        prgB.setProgress(score);
        TextView txtShotsB = (TextView) findViewById(R.id.shotsTextB);
        txtShotsB.setText(String.valueOf(score));


    }

    public void plusShotsA (View view){
        ShotsA = ShotsA+1;
        displayProgressA(ShotsA);

    }

    public void plusShotsB (View view){
        ShotsB = ShotsB+1;
        displayProgressB(ShotsB);
    }


//    Shots off target

    public void displayProgressOffA( int score){
        ProgressBar prgA = (ProgressBar) findViewById(R.id.progressBarShotsOffA);
        TextView txtShotsA = (TextView) findViewById(R.id.shotsTextOffA);
        prgA.setProgress(score);
        txtShotsA.setText(String.valueOf(score));

    }
    public void displayProgressOffB(int score){
        ProgressBar prgB = (ProgressBar) findViewById(R.id.progressBarShotsOffB);
        prgB.setProgress(score);
        TextView txtShotsB = (TextView) findViewById(R.id.shotsTextOffB);
        txtShotsB.setText(String.valueOf(score));


    }


    public void plusShotsOffA (View view){
        ShotsOffA = ShotsOffA+1;
        displayProgressOffA(ShotsOffA);

    }

    public void plusShotsOffB (View view){
        ShotsOffB = ShotsOffB+1;
        displayProgressOffB(ShotsOffB);
    }

//corners

    public void displayProgressCornersA( int score){
        ProgressBar prgA = (ProgressBar) findViewById(R.id.progressBarShotsCornersA);
        TextView txtShotsA = (TextView) findViewById(R.id.shotsTextCornersA);
        prgA.setProgress(score);
        txtShotsA.setText(String.valueOf(score));

    }
    public void displayProgressCornersB(int score){
        ProgressBar prgB = (ProgressBar) findViewById(R.id.progressBarShotsCornersB);
        prgB.setProgress(score);
        TextView txtShotsB = (TextView) findViewById(R.id.shotsTextCornersB);
        txtShotsB.setText(String.valueOf(score));


    }


    public void plusShotsCornersA (View view){
        ShotsCornersA = ShotsCornersA+1;
        displayProgressCornersA(ShotsCornersA);

    }

    public void plusShotsCornersB (View view){
        ShotsCornersB = ShotsCornersB+1;
        displayProgressCornersB(ShotsCornersB);
    }

//    Offside


    public void displayProgressOffsideA( int score){
        ProgressBar prgA = (ProgressBar) findViewById(R.id.progressBarShotsOffsideA);
        TextView txtShotsA = (TextView) findViewById(R.id.shotsTextOffsideA);
        prgA.setProgress(score);
        txtShotsA.setText(String.valueOf(score));

    }
    public void displayProgressOffsideB(int score){
        ProgressBar prgB = (ProgressBar) findViewById(R.id.progressBarShotsOffsideB);
        prgB.setProgress(score);
        TextView txtShotsB = (TextView) findViewById(R.id.shotsTextOffsideB);
        txtShotsB.setText(String.valueOf(score));


    }


    public void plusShotsOffsideA (View view){
        ShotsOffsideA = ShotsOffsideA+1;
        displayProgressOffsideA(ShotsOffsideA);

    }

    public void plusShotsOffsideB (View view){
        ShotsOffsideB = ShotsOffsideB+1;
        displayProgressOffsideB(ShotsOffsideB);
    }

//    Fouls

    public void displayProgressFoulsA( int score){
        ProgressBar prgA = (ProgressBar) findViewById(R.id.progressBarShotsFoulsA);
        TextView txtShotsA = (TextView) findViewById(R.id.shotsTextFoulsA);
        prgA.setProgress(score);
        txtShotsA.setText(String.valueOf(score));

    }
    public void displayProgressFoulsB(int score){
        ProgressBar prgB = (ProgressBar) findViewById(R.id.progressBarShotsFoulsB);
        prgB.setProgress(score);
        TextView txtShotsB = (TextView) findViewById(R.id.shotsTextFoulsB);
        txtShotsB.setText(String.valueOf(score));


    }


    public void plusShotsFoulsA (View view){
        ShotsFoulsA = ShotsFoulsA+1;
        displayProgressFoulsA(ShotsFoulsA);

    }

    public void plusShotsFoulsB (View view){
        ShotsFoulsB = ShotsFoulsB+1;
        displayProgressFoulsB(ShotsFoulsB);
    }

    //    Yellow

    public void displayProgressYellowA( int score){
        ProgressBar prgA = (ProgressBar) findViewById(R.id.progressBarShotsYellowA);
        TextView txtShotsA = (TextView) findViewById(R.id.shotsTextYellowA);
        prgA.setProgress(score);
        txtShotsA.setText(String.valueOf(score));

    }
    public void displayProgressYellowB(int score){
        ProgressBar prgB = (ProgressBar) findViewById(R.id.progressBarShotsYellowB);
        prgB.setProgress(score);
        TextView txtShotsB = (TextView) findViewById(R.id.shotsTextYellowB);
        txtShotsB.setText(String.valueOf(score));


    }

    public void plusShotsYellowA (View view){
        YellowA = YellowA+1;
        displayProgressYellowA(YellowA);

    }

    public void plusShotsYellowB (View view){
        YellowB = YellowB+1;
        displayProgressYellowB(YellowB);
    }



    //    Red

    public void displayProgressRedA( int score){
        ProgressBar prgA = (ProgressBar) findViewById(R.id.progressBarShotsRedA);
        TextView txtShotsA = (TextView) findViewById(R.id.shotsTextRedA);
        prgA.setProgress(score);
        txtShotsA.setText(String.valueOf(score));

    }
    public void displayProgressRedB(int score){
        ProgressBar prgB = (ProgressBar) findViewById(R.id.progressBarShotsRedB);
        prgB.setProgress(score);
        TextView txtShotsB = (TextView) findViewById(R.id.shotsTextRedB);
        txtShotsB.setText(String.valueOf(score));


    }

    public void plusShotsRedA (View view){
        RedA = RedA+1;
        displayProgressRedA(RedA);

    }

    public void plusShotsRedB (View view){
        RedB = RedB+1;
        displayProgressRedB(RedB);
    }

    //    Kicks

    public void displayProgressKicksA( int score){
        ProgressBar prgA = (ProgressBar) findViewById(R.id.progressBarShotsKicksA);
        TextView txtShotsA = (TextView) findViewById(R.id.shotsTextKicksA);
        prgA.setProgress(score);
        txtShotsA.setText(String.valueOf(score));

    }
    public void displayProgressKicksB(int score){
        ProgressBar prgB = (ProgressBar) findViewById(R.id.progressBarShotsKicksB);
        prgB.setProgress(score);
        TextView txtShotsB = (TextView) findViewById(R.id.shotsTextKicksB);
        txtShotsB.setText(String.valueOf(score));


    }

    public void plusShotsKicksA (View view){
        KicksA = KicksA+1;
        displayProgressKicksA(KicksA);

    }

    public void plusShotsKicksB (View view){
        KicksB = KicksB+1;
        displayProgressKicksB(KicksB);
    }


//    RESET

    public void Reset(View view){
        ScoreHome = 0;
        ScoreAway = 0;

        ShotsA =0;
        ShotsB = 0;

        ShotsOffA =0;
        ShotsOffB = 0;

        ShotsCornersA =0;
        ShotsCornersB = 0;

        ShotsOffsideA =0;
        ShotsOffsideB = 0;

        ShotsFoulsA =0;
        ShotsFoulsB = 0;

        YellowA =0;
        YellowB =0;

        RedA =0;
        RedB =0;

        KicksA =0;
        KicksB =0;

        displayProgressKicksB(KicksB);
        displayProgressKicksA(KicksA);

        displayProgressRedA(RedA);
        displayProgressRedB(RedB);

        displayProgressYellowA(YellowA );
        displayProgressYellowB(YellowB );

        displayProgressOffsideA(ShotsOffsideA);
        displayProgressOffsideB(ShotsOffsideB);

        displayProgressCornersA(ShotsCornersA);
        displayProgressCornersB(ShotsCornersB);

        displayProgressA(ShotsA);
        displayProgressB(ShotsB);

        displayScoreA(ScoreHome);
        displayScoreB(ScoreAway);

        displayProgressOffA(ShotsOffA);
        displayProgressOffB(ShotsOffB);

        displayProgressFoulsA(ShotsFoulsA);
        displayProgressFoulsB(ShotsFoulsB);


}

}
