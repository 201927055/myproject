package com.youngjoo.DietApp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Measure extends AppCompatActivity {

    TextView tt1;
    EditText h1;
    EditText w1;
    Button bb1;
    TextView c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);

        tt1 = (TextView) findViewById(R.id.t1);
        h1 = (EditText) findViewById(R.id.height1);
        w1 = (EditText) findViewById(R.id.weight1);
        bb1 = (Button) findViewById(R.id.b1);
        c1 = (TextView) findViewById(R.id.cons1);


        bb1.setOnClickListener( new View.OnClickListener()
                                {
                                    public void onClick(View v)
                                    {
                                        String height1 =  h1.getText().toString();
                                        String weight1 =  w1.getText().toString();

                                        double cons1 = Double.parseDouble(weight1) / Double.parseDouble(height1) / Double.parseDouble(height1);
                                        c1.setText(Double.toString(cons1));
                                    }
                                }
        );

    }
}
