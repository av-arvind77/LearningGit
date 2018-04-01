package com.project.ashish.friendshipapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        tv=(TextView)findViewById(R.id.textView4);
    } //End of onCreate()

    public void calculateLove(View v){
        String n1= et1.getText().toString();
        String n2= et2.getText().toString();
        int len1= n1.length();
        int len2= n2.length();
        if(len1==0 || len2==0){
            tv.setText("You are lucky u are still single");
        }
        else{
        int total= len1 + len2;
        int rem= total % 11;
        int result = rem * 10;
        tv.setText("Love Percentage = " + result);
        }
    } //End of calculateLove

}  //End of Main_Activity Class
