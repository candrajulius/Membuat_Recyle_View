package com.candra.candra_julius_sinaga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailAcitvity extends AppCompatActivity {
        private ImageView gambar1,gambar2;
        private TextView warna1,warna2,warna3,warna4,warna6,warna7;
        String nama;
        String detail;
        String penemu;
        String tanggal;
        int photo;
        int photoPenemu;
    String sejarah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_acitvity);

        // Membuat agar activity ada judul
        if  (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Candra Julius Sinaga");
            getSupportActionBar().setSubtitle("Detail");

            // Menginisiasi semua yang ada di layout
            gambar1 = findViewById(R.id.kotnak);
            gambar2 = findViewById(R.id.mantap);
            warna1 = findViewById(R.id.program1);
            warna2 = findViewById(R.id.nama2);
            warna3 = findViewById(R.id.tahun);
            warna4 = findViewById(R.id.muda);
            warna6 = findViewById(R.id.tua);
            warna7 = findViewById(R.id.tokoh1);

            // Mengambil data dari layout list
            nama = getIntent().getStringExtra("nama");
            photo = getIntent().getIntExtra("photo",0);
            detail = getIntent().getStringExtra("detail");
            penemu = getIntent().getStringExtra("penemu");
            tanggal = getIntent().getStringExtra("tanggal");
            sejarah = getIntent().getStringExtra("sejarah");
            photoPenemu = getIntent().getIntExtra("photoPenemu",0);

            // Meletakkan dat pada objek yang ada di layout
            gambar1.setImageResource(photo);
            warna1.setText(nama);
            warna2.setText(penemu);
            warna3.setText(tanggal);
            warna4.setText(detail);
            warna6.setText(sejarah);
            warna7.setText(penemu);
            gambar2.setImageResource(photoPenemu);

        }
    }
}
