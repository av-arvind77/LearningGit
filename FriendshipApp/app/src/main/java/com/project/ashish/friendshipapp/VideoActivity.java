package com.project.ashish.friendshipapp;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        vv=(VideoView)findViewById(R.id.videoView1);
        MediaController mcontroller = new MediaController(this);
        mcontroller.setAnchorView(vv);
        Uri uri=Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/a/ab.3gp");
        vv.setMediaController(mcontroller);
        vv.setVideoURI(uri);
        vv.requestFocus();
        vv.start();
    }
}
