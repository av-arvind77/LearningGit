package com.project.ashish.friendshipapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        String str= intent.getAction();
        if (str.equals("android.intent.action.ACTION_POWER_CONNECTED")){
            Toast.makeText(context,"Chargering Started",Toast.LENGTH_SHORT).show();
        }//End of If Block
        else{
            Toast.makeText(context,"Discharging Started",Toast.LENGTH_SHORT).show();
        }
    }//End of onReceive()
}
