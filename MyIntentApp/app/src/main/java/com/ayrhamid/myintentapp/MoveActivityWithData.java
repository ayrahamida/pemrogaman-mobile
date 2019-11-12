package com.ayrhamid.myintentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MoveActivityWithData extends AppCompatActivity {
    public static final String EXTRA_AGE = "extra age";
    public static final String EXTRA_NAME = "extra name";

    TextView TvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TvDataReceived = findViewById(R.id.tv_data_received);
        String nama = getIntent().getStringExtra(EXTRA_NAME);
        int umur = getIntent().getIntExtra(EXTRA_AGE,0 );
        String text="Nama : " +nama+",\nUmur : "+umur;
        TvDataReceived.setText(text);
    }
}
