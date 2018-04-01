package com.project.ashish.friendshipapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ViewallActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewall);
        listView=(ListView)findViewById(R.id.listView);

        listView.setAdapter(new customAdapter(this));

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String food=String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(ViewallActivity.this,food,Toast.LENGTH_SHORT).show();
                    }
                }
        );
        /*
        SQLiteDatabase db=openOrCreateDatabase("WS_STUDENT",MODE_APPEND,null);
        Cursor c=db.rawQuery("select * from Student", null);
        String name=null, phone=null;
        while (c.moveToNext()){
            name = c.getString(0);
            phone = c.getString(1);
            tv.append(name +"-"+ phone +"\n");
        }
        c.close();*/

    }//End of onCreate
}//End of ViewallActivity
