package com.candra.candra_julius_sinaga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class About2 extends AppCompatActivity {

    // Membuat konten tentang about
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);
        if  (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Candra Julius Sinaga");
            getSupportActionBar().setSubtitle("About");
        }
    }
}
