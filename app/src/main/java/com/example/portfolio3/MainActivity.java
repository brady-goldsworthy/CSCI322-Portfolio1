package com.example.portfolio3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioGroup pattyRG, cheeseRG;
    private CheckBox baconCB;
    private SeekBar sauceSB;
    private TextView caloriesTV;

    private Burger burger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect the variables
        pattyRG = findViewById(R.id.pattyRadioGroup);
        cheeseRG = findViewById(R.id.cheeseRadioGroup);

        baconCB = findViewById(R.id.checkBoxBacon);

        sauceSB = findViewById(R.id.seekBar);

        caloriesTV = findViewById(R.id.caloriesTextView);

        burger = new Burger();

        displayCalories();
    }

    private void displayCalories() {
        //Build the string to be displayed
        String caloriesText = "Calories: " + burger.totalCals();

        //Display the String
        caloriesTV.setText(caloriesText);
    }




}
