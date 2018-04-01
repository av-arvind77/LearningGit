package com.project.ashish.friendshipapp;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteActivity extends AppCompatActivity {
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        et=(EditText)findViewById(R.id.editText1);
    }//End of onCreate

    public void deletestudent(View v){
        String n =et.getText().toString();
        SQLiteDatabase db = openOrCreateDatabase("WS_STUDENT",MODE_APPEND,null);
        n="'"+n+"'";
        db.execSQL("delete from Student where name="+n);
        Toast.makeText(this,"Record deleted successfully",Toast.LENGTH_SHORT).show();
    }
}
