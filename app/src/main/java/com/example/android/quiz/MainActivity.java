package com.example.android.quiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton answer1q1;
    RadioButton answer2q2;
    RadioButton answer2q3;
    RadioButton answer3q4;
    RadioButton answer2q5;
    RadioButton answer3q6;
    RadioButton answer1q7;
    RadioButton answer3q8;
    RadioButton answer3q9;
    RadioButton answer1q10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1q1 = (RadioButton) findViewById(R.id.answer1q1);
        answer2q2 = (RadioButton) findViewById(R.id.answer2q2);
        answer2q3 = (RadioButton) findViewById(R.id.answer2q3);
        answer3q4 = (RadioButton) findViewById(R.id.answer3q4);
        answer2q5 = (RadioButton) findViewById(R.id.answer2q5);
        answer3q6 = (RadioButton) findViewById(R.id.answer3q6);
        answer1q7 = (RadioButton) findViewById(R.id.answer1q7);
        answer3q8 = (RadioButton) findViewById(R.id.answer3q8);
        answer3q9 = (RadioButton) findViewById(R.id.answer3q9);
        answer1q10 = (RadioButton) findViewById(R.id.answer1q10);

    }


    //This is where the points are calculated when the right answer is clicked
    public int calculateScore() {

        int finalScoring = 0;


        if (answer1q1.isChecked()) {
            finalScoring++;
        }

        if (answer2q2.isChecked()) {
            finalScoring++;
        }

        if (answer2q3.isChecked()) {
            finalScoring++;
        }

        if (answer3q4.isChecked()) {
            finalScoring++;
        }

        if (answer2q5.isChecked()) {
            finalScoring++;
        }

        if (answer3q6.isChecked()) {
            finalScoring++;
        }

        if (answer1q7.isChecked()) {
            finalScoring++;
        }

        if (answer3q8.isChecked()) {
            finalScoring++;
        }

        if (answer3q9.isChecked()) {
            finalScoring++;
        }

        if (answer1q10.isChecked()) {
            finalScoring++;
        }

        finalScoring = finalScoring * 10;

        return finalScoring;
    }

    //Displaying the results to the screen with a message
    public void results(View view) {

        int resultScoring = calculateScore();
        String stringScoring = Integer.toString(calculateScore()) + "%\n";

        Button btn = (Button) findViewById(R.id.sumbit_button);
        btn.setVisibility(View.INVISIBLE);

        if (resultScoring <= 30) {
            displayString("You scored " + stringScoring + getString(R.string.result_1));
        } else if ((resultScoring > 30) && (resultScoring < 70)) {
            displayString("You scored " + stringScoring + getString(R.string.result_2));
        } else if ((resultScoring >= 70) && (resultScoring <= 90)) {
            displayString("You scored " + stringScoring + getString(R.string.result_3));
        } else if (resultScoring == 100) {
            displayString("You scored " + stringScoring + getString(R.string.result_4));
        }

    }

    //Connect TextView
    public void displayString(String score) {
        TextView scoreView = (TextView) findViewById(R.id.result_message);
        scoreView.setText(String.valueOf(score));
    }


    /**
     private void displayToastMessage(String message) {
     Context context = getApplicationContext();
     int duration = Toast.LENGTH_LONG;
     Toast toast = Toast.makeText(context, message, duration);
     toast.show();
     }*/
}