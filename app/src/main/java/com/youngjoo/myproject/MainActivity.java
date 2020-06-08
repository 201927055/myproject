package com.youngjoo.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

    public class MainActivity extends AppCompatActivity {
        private static final String TAG = "MainActivity";

        private CalendarView mCalendarView;
        private Button btnM;
        private Button btnE;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalendarView = (CalendarView) findViewById(R.id.calendarView);
        btnM = (Button) findViewById(R.id.measure);
        btnE = (Button) findViewById(R.id.exercise);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int day) {
                String date = year + "/" + month + "/" + day;
                Log.d(TAG,"onSelectedDayChange : date :" + date);

                Intent intent = new Intent(MainActivity.this, BodyCheck.class);
                intent.putExtra("date",date);
                startActivity(intent);
            }
        });

        btnM.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Measure.class);
                startActivity(intent);
            }
        });

        btnE.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Exercise.class);
                startActivity(intent);
            }
        });

    }
}
