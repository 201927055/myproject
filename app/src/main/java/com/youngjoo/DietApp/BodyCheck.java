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
         String value1 = sharedPreferences.getString("figure1","");
         String value2 = sharedPreferences.getString("figure2","");
         String value3 = sharedPreferences.getString("figure3","");
         String value4 = sharedPreferences.getString("figure4","");
         String value5 = sharedPreferences.getString("figure5","");
         String value6 = sharedPreferences.getString("figure6","");
         String value7 = sharedPreferences.getString("figure7","");
         String valueT = sharedPreferences.getString("figureT","");
         String valueW = sharedPreferences.getString("figureW","");

             n1.setText(value1);
             n2.setText(value2);
             n3.setText(value3);
             n4.setText(value4);
             n5.setText(value5);
             n6.setText(value6);
             n7.setText(value7);
             nT.setText(valueT);
             nW.setText(valueW);

        }

        @Override
        protected void onDestroy() {
             super.onDestroy();
            SharedPreferences sharedPreferences = getSharedPreferences(shared,0);

            SharedPreferences.Editor editorT = sharedPreferences.edit();
            String valueT = nT.getText().toString();
            editorT.putString("figureT",valueT);
            editorT.commit();

            SharedPreferences.Editor editorW = sharedPreferences.edit();
            String valueW = nW.getText().toString();
            editorW.putString("figureW",valueW);
            editorW.commit();

            SharedPreferences.Editor editor1 = sharedPreferences.edit();
             //저장을 할때 Editor을 불러와줘야함
            String value1 = n1.getText().toString();
            editor1.putString("figure1",value1);
            editor1.commit();

            SharedPreferences.Editor editor2 = sharedPreferences.edit();
            String value2 = n2.getText().toString();
            editor2.putString("figure2",value2);
            editor2.commit();

            SharedPreferences.Editor editor3 = sharedPreferences.edit();
            String value3 = n3.getText().toString();
            editor3.putString("figure3",value3);
            editor3.commit();

            SharedPreferences.Editor editor4 = sharedPreferences.edit();
            String value4 = n4.getText().toString();
            editor4.putString("figure4",value4);
            editor4.commit();

            SharedPreferences.Editor editor5 = sharedPreferences.edit();
            String value5 = n5.getText().toString();
            editor5.putString("figure5",value5);
            editor5.commit();

            SharedPreferences.Editor editor6 = sharedPreferences.edit();
            String value6 = n6.getText().toString();
            editor6.putString("figure6",value6);
            editor6.commit();

            SharedPreferences.Editor editor7 = sharedPreferences.edit();
            String value7 = n7.getText().toString();
            editor7.putString("figure7",value7);
            //figure에 getText해서 저장해줌
            editor7.commit();
            //실질적으로 저장(save한것)
        }

}
