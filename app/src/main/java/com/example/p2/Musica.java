package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Musica extends AppCompatActivity {
    MediaPlayer musica;
    ImageButton btnplay,btnpause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_musica);
        musica= MediaPlayer.create(this,R.raw.musica);
        btnpause = findViewById(R.id.btnpause);
        btnplay = findViewById(R.id.btnplay);

        //pause
        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musica.pause();

            }
        });


        //play
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                musica.start();
            }
        });


    }
}