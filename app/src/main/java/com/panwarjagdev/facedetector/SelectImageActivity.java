package com.panwarjagdev.facedetector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SelectImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectimage);

        this.getSupportActionBar().hide();
    }
}