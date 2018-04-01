package com.project.ashish.friendshipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {
    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        et1=(EditText)findViewById(R.id.editText3);
    } // End of onCreate()

    public void second(View v){
        Intent i = new Intent(FirstActivity.this , SecondActivity.class);
        String str=et1.getText().toString();
        i.putExtra("NAME",str);
        startActivity(i);
    } // End of second()
} // End of class
