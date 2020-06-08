package com.youngjoo.DietApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Measure extends AppCompatActivity {
    private static final String TAG = "Measure";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);

        Intent incomingIntent = getIntent();

    }
}
