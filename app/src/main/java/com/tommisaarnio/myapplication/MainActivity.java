package com.tommisaarnio.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = (EditText)findViewById(R.id.number1);
        input2 = (EditText)findViewById(R.id.number2);
        text = findViewById(R.id.result);
    }


    public void add(View view){
        int number1 = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int result = number1+number2;
        String sResult = Integer.toString(result);
        text.setText(sResult);
    }

    public void sub(View view){
        int number1 = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int result = number1-number2;
        String sResult = Integer.toString(result);
        text.setText(sResult);
    }

    public void mul(View view){
        int number1 = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int result = number1*number2;
        String sResult = Integer.toString(result);
        text.setText(sResult);
    }

    public void div(View view){
        int number1 = Integer.parseInt(input1.getText().toString());
        int number2 = Integer.parseInt(input2.getText().toString());
        int result = number1/number2;
        String sResult = Integer.toString(result);
        text.setText(sResult);
    }


}