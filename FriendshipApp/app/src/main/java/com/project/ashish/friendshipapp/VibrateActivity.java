package com.project.ashish.friendshipapp;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class VibrateActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrate);
        et=(EditText)findViewById(R.id.editText1);
    }//End of onCreate

    public void vibrate(View v){
        String ts=et.getText().toString();
        int t=Integer.parseInt(ts);
        Toast.makeText(this,"You Clicked the Vibrate Button"+t,Toast.LENGTH_SHORT).show();
        Vibrator vi=(Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        vi.vibrate(t*1000);
    }//End of vibrate
}
