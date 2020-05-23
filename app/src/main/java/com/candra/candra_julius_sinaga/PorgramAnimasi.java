package com.candra.candra_julius_sinaga;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class PorgramAnimasi extends Animation  {
    private Context text;
    private ProgressBar proses;
    private TextView tview;
    private float frame;
    private float mantap;

    public PorgramAnimasi(Context text, ProgressBar proses,  TextView tview , float frame, float mantap){
        this.text = text;
        this.proses = proses;
        this.tview = tview;
        this.frame = frame;
        this.mantap = mantap;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        super.applyTransformation(interpolatedTime, t);
        float nilai =  frame + (mantap - frame) * interpolatedTime;
        proses.setProgress((int)nilai);
        tview.setText((int) nilai + "%");
        if (nilai == mantap){
            Intent kamu = new Intent(text,MainActivity.class);
            text.startActivity(kamu);


        }
    }

}
