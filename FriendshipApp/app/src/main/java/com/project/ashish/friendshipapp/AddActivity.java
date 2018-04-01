package com.project.ashish.friendshipapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
    }//End of onCreate

    public void addstudent (View v){
        String n=et1.getText().toString();
        String p=et2.getText().toString();
        SQLiteDatabase db = openOrCreateDatabase("WS_STUDENT",MODE_APPEND,null);
        db.execSQL("create table if not exists Student(name varchar, phone varchar)");
        Toast.makeText(this,"Student table is Ready",Toast.LENGTH_SHORT).show();
        n= "'" + n +"'";
        p="'" + p +"'";
        db.execSQL("insert into Student(name , phone) values(" + n + "," + p +")");
        Toast.makeText(this,"Record inserted successfully",Toast.LENGTH_SHORT).show();
    }//End of addStudent
}// End of AddActivity