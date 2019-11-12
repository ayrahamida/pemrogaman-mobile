package com.ayrhamid.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_intent extends AppCompatActivity {
    EditText name;
    Button btnHasil;

    private String KEY_NAME = "Nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        name = (EditText) findViewById(R.id.username);
        btnHasil = (Button) findViewById(R.id.btn_hasil);

        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = name.getText().toString();
                    if (nama != null && nama != "") {
                        Intent i = new Intent(activity_intent.this, Main2Activity.class);
                        i.putExtra(KEY_NAME, nama);
                        startActivity(i);
                    } else {
                        Toast.makeText(getApplication(), "You Need to Fill Your Username", Toast.LENGTH_SHORT);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Error, Try Again", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}