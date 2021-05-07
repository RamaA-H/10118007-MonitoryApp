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
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_masuk(View view) {
        Intent intent =  new Intent(this,BiodataActivity.class);
        startActivity(intent);
    }
}