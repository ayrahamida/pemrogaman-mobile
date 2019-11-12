package com.ayrhamid.hmjpolines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailListHmj extends AppCompatActivity {

    private int hmj_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Hmj> listHmj = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_hmj);

        hmj_id =getIntent().getIntExtra("hmj_id", 0);
        tvName = findViewById(R.id.nama_hmj);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listHmj.addAll(HmjData.getListData());
        setLayout();
    }

    void setLayout(){
        tvName.setText(listHmj.get(hmj_id).getName());
        tvDesc.setText(listHmj.get(hmj_id).getDescription());
        Glide.with(this).load(listHmj.get(hmj_id).getPhoto()).apply(new RequestOptions().fitCenter()).into(imgDetail);
    }
}
