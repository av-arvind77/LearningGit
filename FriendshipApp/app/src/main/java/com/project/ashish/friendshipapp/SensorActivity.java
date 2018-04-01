package com.project.ashish.friendshipapp;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class SensorActivity extends AppCompatActivity implements SensorEventListener {
    ImageView iv;
    SensorManager sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
        iv=(ImageView)findViewById(R.id.imageView);
        sm=(SensorManager)getSystemService(Context.SENSOR_SERVICE);
        int rollno= Sensor.TYPE_PROXIMITY;
        Sensor s=sm.getDefaultSensor(rollno);
        sm.registerListener( this, s,SensorManager.SENSOR_DELAY_NORMAL);
    } // End of onCreate

    int x=0;
    @Override
    public void onSensorChanged(SensorEvent event) {
       float f=  event.values[0];
        //Toast.makeText(this,"value of f=" + f,Toast.LENGTH_SHORT).show();
      if(f==0.0){
          x=x+1;
      }
        switch (x=x%5){
            case (0):iv.setImageResource(R.drawable.p1);break;
            case (1):iv.setImageResource(R.drawable.p2);break;
            case (2):iv.setImageResource(R.drawable.p3);break;
            case (3):iv.setImageResource(R.drawable.p4);break;
            case (4):iv.setImageResource(R.drawable.p5);break;
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
} // End of SensorActivity
