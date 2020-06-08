package com.youngjoo.DietApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Exercise extends AppCompatActivity {
    private static final String TAG = "Exercise";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Intent incomingIntent = getIntent();
    }
}
