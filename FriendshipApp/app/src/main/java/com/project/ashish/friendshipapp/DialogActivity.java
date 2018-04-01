package com.project.ashish.friendshipapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
    }//End of onCreate

    public void b1click(View v){
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Fire Missile");
        builder.setMessage("Are you sure to fire the missile?");
        builder.setPositiveButton("Fire", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DialogActivity.this,"Missile Fired",Toast.LENGTH_SHORT).show();
            }
        }); //end of statement
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(DialogActivity.this,"Missile Cancelled",Toast.LENGTH_SHORT).show();
            }
        });//end of statement
        AlertDialog dialog=builder.create();
        dialog.show();
    }//End of b1click
}