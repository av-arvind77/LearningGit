package com.project.ashish.friendshipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=(TextView)findViewById(R.id.textView5);
        Intent i = getIntent();
        String str= i.getStringExtra("NAME");
        tv.append("\n" + str);
    }
}
