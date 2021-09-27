package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void clickAdd(View view){
        EditText text1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText text2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str1 = text1.getText().toString();
        String str2 = text2.getText().toString();
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);


        goToActivity2(Double.toString(num1 + num2));

    }
    public void clickSubtract(View view){
        EditText text1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText text2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str1 = text1.getText().toString();
        String str2 = text2.getText().toString();
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);


        goToActivity2(Double.toString(num1 - num2));
    }
    public void clickMult(View view){
        EditText text1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText text2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str1 = text1.getText().toString();
        String str2 = text2.getText().toString();
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);


        goToActivity2(Double.toString(num1 * num2));
    }
    public void clickDivide(View view){
        EditText text1 = (EditText) findViewById(R.id.editTextTextPersonName);
        EditText text2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String str1 = text1.getText().toString();
        String str2 = text2.getText().toString();
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);


        goToActivity2(Double.toString(num1 / num2));
    }
}