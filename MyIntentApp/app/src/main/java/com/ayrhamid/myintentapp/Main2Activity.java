package com.ayrhamid.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textView;
    private String nama;
    private String KEY_NAME = "Nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textView);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        textView.setText(nama);

    }
}
