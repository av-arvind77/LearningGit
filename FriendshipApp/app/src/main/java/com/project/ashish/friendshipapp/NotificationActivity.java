package com.project.ashish.friendshipapp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;

public class NotificationActivity extends ActionBarActivity {

    NotificationCompat.Builder notification;
    private static final int uniqueID= 45612;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);
    }

    public  void clickBtnNotify(View view){
        //Build the notification
        notification.setSmallIcon(R.mipmap.ic_launcher);
        //trigger building
        notification.setTicker("This the ticker in notification");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Here is notification title");
        notification.setContentText("Body of notification");

        //to perforn event when notification is clicked
        Intent intent= new Intent(this,NotificationActivity.class);
        PendingIntent pendingIntent= PendingIntent.getActivity(this,0 , intent,PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        //Builds notification and issues it
        NotificationManager ns=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        ns.notify(uniqueID,notification.build());
    }
}
