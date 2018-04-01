package com.project.ashish.friendshipapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
    } //End of onCreate()

    public void add(View v){
        Intent i= new Intent(ProjectActivity.this,AddActivity.class);
        startActivity(i);
    }// End of add()

    public void viewall(View v){
        Intent i= new Intent(ProjectActivity.this,ViewallActivity.class);
        startActivity(i);
    } // End of viewall()

    public void delete(View v){
        Intent i= new Intent(ProjectActivity.this,DeleteActivity.class);
        startActivity(i);
    }//End of delete()

    public  void edit(View v){
        Intent i= new Intent(ProjectActivity.this,EditActivity.class);
        startActivity(i);
    }//End of edit()

    public void close(View v){
        Toast.makeText(this,"close",Toast.LENGTH_SHORT).show();
        finish();
    }// End of close();
}//End of the projectActivity
