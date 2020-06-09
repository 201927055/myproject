package com.youngjoo.DietApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

    public class MainActivity extends AppCompatActivity {

        CalendarView mCalendarView;
        Button btnM;
        Button btnE;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalendarView = findViewById(R.id.calendarView);
        btnM = findViewById(R.id.btnM);
        btnE = findViewById(R.id.btnE);

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int day) {
                String date = year + "/" + month + "/" + day;

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
