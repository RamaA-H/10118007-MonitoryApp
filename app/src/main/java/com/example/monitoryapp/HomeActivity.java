package com.example.monitoryapp;
/*
 * NIM   : 10118007
 * Nama  : Rama Al Halik
 * Kelas : IF-1
 * TGL   : 07/05/2021
 * */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //get data intent
        Intent intent = getIntent();
        String pesan = intent.getStringExtra(BiodataActivity.EXTRA_MESSAGE);

        //set text
        TextView teks2 = findViewById(R.id.txt_home2);
        teks2.setText(pesan);
        TextView teks6 = findViewById(R.id.txt_home5);
        teks6.setText(pesan);
    }
}