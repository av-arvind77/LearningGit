package com.project.ashish.friendshipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
    }// End of onCreate()

    public void b1click(View v){
        Intent i=new Intent(MusicActivity.this,MusicService.class);
        startService(i);
    }//End of b1click

    public void b2click(View v){
        Intent i = new Intent(MusicActivity.this,MusicService.class);
        stopService(i);
    }//End of b2click
}
