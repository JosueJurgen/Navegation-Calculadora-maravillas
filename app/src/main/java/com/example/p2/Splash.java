package com.example.p2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends AppCompatActivity {

    Animation topAnim, bottomAnim;
    TextView txtTitulo;
    ImageView Logo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        topAnim = AnimationUtils.loadAnimation (this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.botton_animation);
        txtTitulo= findViewById(R.id.txtTitulo);
        Logo2= findViewById(R.id.txtLogo2);

        txtTitulo.setAnimation(topAnim);
        Logo2.setAnimation(bottomAnim);

        TimerTask tarea= new TimerTask() {
            @Override
            public void run() {
                Intent inten = new Intent(Splash.this, MainActivity.class);
                startActivity(inten);
                finish();

            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(tarea,5000);


    }
}