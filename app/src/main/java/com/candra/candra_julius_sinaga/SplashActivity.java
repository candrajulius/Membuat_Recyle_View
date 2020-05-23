package com.candra.candra_julius_sinaga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity  {
    private ProgressBar progressBar;
    private TextView waktu;
    long berhenti = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar = findViewById(R.id.progressBar);
        waktu = findViewById(R.id.saya);

        waktu();
    }

    public void waktu(){
        Timer waktu = new Timer();

        TimerTask Tunjukkan = new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent biasa = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(biasa);
            }
        };
        waktu.schedule(Tunjukkan,berhenti);
    }



}
