package com.project.ashish.friendshipapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CameraActivity extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        iv=(ImageView)findViewById(R.id.imageView1);
    }// End of onCreate()

    public void show(View v){
        Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,0);
    }  //End of show()

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bundle bundle1 = data.getExtras();
        Bitmap bitmap = (Bitmap)bundle1.get("data");
        iv.setImageBitmap(bitmap);
    } //End of onActivityResult
} //End of CameraActivity
