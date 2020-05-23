package com.candra.candra_julius_sinaga;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.candra.candra_julius_sinaga.Adapter.DataAdapter;
import com.candra.candra_julius_sinaga.Adapter.DataBahasa;
import com.candra.candra_julius_sinaga.Adapter.Hero;

import java.net.URI;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Hero> list;


    private RecyclerView kamu;
    private ArrayList<Hero> nama = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Candra Julius Sinaga");
            getSupportActionBar().setSubtitle("Home");
        }
        kamu = findViewById(R.id.bangst);
        kamu.setHasFixedSize(true);
        nama.addAll(DataBahasa.getLisData());
        tunjukkanList();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.saya,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.candra){
            Intent candra = new Intent(MainActivity.this,About2.class);
        }
        return super.onOptionsItemSelected(item);
    }

    private void tunjukkanList() {
        kamu.setLayoutManager(new LinearLayoutManager(this));
        DataAdapter adapter = new DataAdapter(this,nama);
        kamu.setAdapter(adapter);

    }


}


