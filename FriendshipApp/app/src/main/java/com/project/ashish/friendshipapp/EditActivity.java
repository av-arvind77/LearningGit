package com.project.ashish.friendshipapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
    }//End of onCreate()

    public  void search(View v){
        String n=et1.getText().toString();
        n="'"+n+"'";
        SQLiteDatabase db=openOrCreateDatabase("WS_STUDENT",MODE_APPEND,null);
        String q="select * from Student where name="+n;
        Cursor c=db.rawQuery(q,null);
        String phone=null;
        if (c.moveToNext()){
            phone = c.getString(1);
            et2.setText(phone);
        }
        else{
            Toast.makeText(this,"Record not found",Toast.LENGTH_SHORT).show();
        }
    }//End of search()

    public void update(View v){
            String n=et1.getText().toString();
        String p =et2.getText().toString();
        n="'"+n+"'";
        p="'"+p+"'";
        SQLiteDatabase db=openOrCreateDatabase("WS_STUDENT",MODE_APPEND,null);
        String q="update Student set phone="+p+" where name="+n;
        db.execSQL(q);
        Toast.makeText(this,"Record updated Successfully",Toast.LENGTH_SHORT).show();
    }//End of update()
}
