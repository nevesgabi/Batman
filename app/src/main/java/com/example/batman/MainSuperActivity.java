package com.example.batman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainSuperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_super);
    }
}
