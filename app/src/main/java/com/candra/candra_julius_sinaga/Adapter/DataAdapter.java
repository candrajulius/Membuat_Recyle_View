package com.candra.candra_julius_sinaga.Adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.candra.candra_julius_sinaga.DetailAcitvity;
import com.candra.candra_julius_sinaga.MainActivity;
import com.candra.candra_julius_sinaga.R;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ListVoewHolder>{
     private ArrayList<Hero> ListBahasa;
     private Context context;

     public DataAdapter(Context context, ArrayList<Hero> list){
         this.ListBahasa = list;
         this.context = context;
     }

//    private ArrayList<Hero> ListBahasa;
//    private Context context;
//
//    public  DataAdapter(Context context,ArrayList<Hero> listBahasa){
//        this.ListBahasa = listBahasa;
//        this.context = context;
//    }

    // Membuat list pada layout main activity
    @NonNull
    @Override
    public ListVoewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View artikel = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_bahasa,parent,false);
        return new ListVoewHolder(artikel);
    }

    // Menampilkan list pada activity
    @Override
    public void onBindViewHolder(@NonNull final ListVoewHolder holder, final int position) {
        final Hero hero = ListBahasa.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getPhoto())
                .apply(new RequestOptions().override(80,80))
                .into(holder.gambar1);
        holder.nama1.setText(hero.getNama());
        holder.detail1.setText(hero.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent candra = new Intent(context,DetailAcitvity.class);
                candra.putExtra("nama",hero.getNama());
                candra.putExtra("photo",hero.getPhoto());
                candra.putExtra("detail",hero.getDetail());
                candra.putExtra("penemu",hero.getPenemu());
                candra.putExtra("tanggal",hero.getTangal());
                candra.putExtra("sejarah",hero.getSejarah());
                candra.putExtra("photoPenemu",hero.getPhotoPenemu());
                context.startActivity(candra);
            }
        });
    }

    // memberikan jumlah list pada activity
    @Override
    public int getItemCount() {
        return ListBahasa.size();
    }


    // Menginisiasi objek pada list layout
    class ListVoewHolder extends RecyclerView.ViewHolder{
       ImageView gambar1;
       TextView nama1,detail1;
        public ListVoewHolder(@NonNull View itemView) {
            super(itemView);
        gambar1 = itemView.findViewById(R.id.gambar);
        nama1 = itemView.findViewById(R.id.nama);
        detail1 = itemView.findViewById(R.id.detail);
        }
    }
}
