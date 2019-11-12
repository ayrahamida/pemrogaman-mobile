package com.ayrhamid.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnMoveActivity;
    Button getBtnMoveActivityWithData;
    Button btnMoveActivitySecond;
    Button btndial;
    Button btnURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        getBtnMoveActivityWithData = findViewById(R.id.btn_move_data);
        getBtnMoveActivityWithData.setOnClickListener(this);

        btnMoveActivitySecond = findViewById(R.id.btn_intent);
        btnMoveActivitySecond.setOnClickListener(this);

        btndial = findViewById(R.id.btn_dial);
        btndial.setOnClickListener(this);

        btnURL = findViewById(R.id.btn_url);
        btnURL.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity = new
                        Intent(MainActivity.this, NewActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_data:
                Intent moveWithDataInten = new Intent(MainActivity.this, MoveActivityWithData.class);
                moveWithDataInten.putExtra(MoveActivityWithData.EXTRA_NAME, "Aira");
                moveWithDataInten.putExtra(MoveActivityWithData.EXTRA_AGE, 19);
                startActivity(moveWithDataInten);
                break;
            case R.id.btn_dial:
                String phoneNumber = "0895387556768";
                Intent dialPhone = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhone);
                break;
            case R.id.btn_url:
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("http:/polines.ac.id"));
                startActivity(web);
                break;
            case R.id.btn_intent:
                Intent moveActivitySecond = new Intent(MainActivity.this, activity_intent.class);
                startActivity(moveActivitySecond);

        }

    }
}
