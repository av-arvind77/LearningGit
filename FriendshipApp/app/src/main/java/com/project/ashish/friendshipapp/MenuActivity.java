package com.project.ashish.friendshipapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends ListActivity {
    String []screen={"MainActivity",
                        "FirstActivity",
                        "SensorActivity",
                        "CameraActivity",
                        "ProjectActivity",
                        "VibrateActivity",
                        "VideoActivity",
                        "MusicActivity",
                        "DialogActivity",
                        "ScrollingActivity",
                        "NotificationActivity",
                        "MapActivity",
                        "MapsActivity2",
                        "EXIT"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1, screen);
        setListAdapter(adapter);

    }//End of onCreate();

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (screen[position].equals("EXIT")){
            finish();
        }
        else{
            Toast.makeText(this,"Clicked on :" + screen[position],Toast.LENGTH_SHORT).show();
            if (screen[position].equals("MainActivity")){
                Intent i=new Intent(MenuActivity.this,MainActivity.class);
                startActivity(i);
            }//for mainActivity
            else if (screen[position].equals("FirstActivity")){
                Intent i=new Intent(MenuActivity.this,FirstActivity.class);
                startActivity(i);
            }//for FirstActivity
            else if (screen[position].equals("SensorActivity")){
                Intent i=new Intent(MenuActivity.this,SensorActivity.class);
                startActivity(i);
            }//for sensorActivity
            else if (screen[position].equals("CameraActivity")){
                Intent i=new Intent(MenuActivity.this,CameraActivity.class);
                startActivity(i);
            }//for CameraActivity
            else if (screen[position].equals("ProjectActivity")){
                Intent i=new Intent(MenuActivity.this,ProjectActivity.class);
                startActivity(i);
            }//for ProjectActivity
            else if (screen[position].equals("VibrateActivity")){
                Intent i=new Intent(MenuActivity.this,VibrateActivity.class);
                startActivity(i);
            }//for VibrateActivity
            else if (screen[position].equals("VideoActivity")){
                Intent i=new Intent(MenuActivity.this,VideoActivity.class);
                startActivity(i);
            }//for VideoActivity
            else if (screen[position].equals("MusicActivity")){
                Intent i=new Intent(MenuActivity.this,MusicActivity.class);
                startActivity(i);
            }//for MusicActivity
            else if (screen[position].equals("DialogActivity")){
                Intent i=new Intent(MenuActivity.this,DialogActivity.class);
                startActivity(i);
            }//for dialogActivity
            else if (screen[position].equals("ScrollingActivity")){
                Intent i=new Intent(MenuActivity.this,ScrollingActivity.class);
                startActivity(i);
            }// for custom listview and scrolling
            else if (screen[position].equals("NotificationActivity")){
                Intent i=new Intent(MenuActivity.this,NotificationActivity.class);
                startActivity(i);
            }//for Notification
            else if (screen[position].equals("MapActivity")){
                Intent i=new Intent(MenuActivity.this,MapActivity.class);
                startActivity(i);
            }//for Map
            else if (screen[position].equals("MapsActivity2")){
                Intent i=new Intent(MenuActivity.this,MapsActivity2.class);
                startActivity(i);
            }//for Map2
        }
    }
}
