package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Reproductor extends AppCompatActivity {

    VideoView videoView;
    MediaController mediaController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        VideoView videoView =findViewById(R.id.videopropuesta);
        String videopath="android.resource://"+getPackageName()+"/"+R.raw.musicavideo;
        Uri uri =Uri.parse(videopath);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.start();





    }
}