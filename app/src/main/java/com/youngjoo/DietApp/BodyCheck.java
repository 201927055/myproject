package com.youngjoo.DietApp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class BodyCheck extends AppCompatActivity {

        EditText n1;
        EditText n2;
        EditText n3;
        EditText n4;
        EditText n5;
        EditText n6;
        EditText n7;
        EditText nT;
        EditText nW;
        String shared = "file";

     @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodycheck);
             n1 = findViewById(R.id.n1);
             n2 = findViewById(R.id.n2);
             n3 = findViewById(R.id.n3);
             n4 = findViewById(R.id.n4);
             n5 = findViewById(R.id.n5);
             n6 = findViewById(R.id.n6);
             n7 = findViewById(R.id.n7);
             nT = findViewById(R.id.nT);
             nW = findViewById(R.id.nW);

             SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
             String value = sharedPreferences.getString("figure","");
             n1.setText(value);

        }

        @Override
        protected void onDestroy() {
             super.onDestroy();

             SharedPreferences sharedPreferences = getSharedPreferences(shared,0);
             SharedPreferences.Editor editor = sharedPreferences.edit();
             //저장을 할때 Editor을 불러와줘야함
             String value = n1.getText().toString();
             editor.putString("figure",value);
             //figure에 getText해서 저장해줌
             editor.commit();
             //실질적으로 저장(save한것)
        }
}
