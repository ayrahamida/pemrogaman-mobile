package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMylist());
        mRecyclerView.setAdapter(myAdapter);
    }
    private ArrayList<Model> getMylist(){

     ArrayList<Model> models = new ArrayList<>();

     Model model = new Model();
     model.setTitle("Pantai Banyutowo");
     model.setDescription("Salah satu keindahan yang ditawarkan Objek Wisata Pantai Banyutowo adalah pesona matahari terbit dari timur. Jika anda ingin menikmati hal ini, anda harus pergi pagi-pagi sekali sebelum terbit fajar. Pastikan anda membawa pakaian berlapis-lapis karena angin yang berhembus sangat dingin sekali. Disini Anda juga dapat menikmati sunset di sore hari.");
     model.setImg(R.drawable.banyutowo);
     models.add(model);

     model = new Model();
     model.setTitle("Pulau Seprapat");
     model.setDescription("Kata Seprapat dalam Bahasa Jawa yang artinya seperempat, Pulau ini telah diberi nama Pulau Seprapat karena diambil dari cerita Dampo Awang yang meninggalkan seprempat harta miliknya di Pulau Seprapat.");
     model.setImg(R.drawable.seloromo);
     models.add(model);

     model = new Model();
     model.setTitle("Waduk Gunung Rowo");
     model.setDescription("Waduk ini tergolong luas dan mampu menampung air sebanyak kurang lebih 5,5 juta meter kubik. Waduk Gunung Rowo ini dibangun pada saat masa pemerintahan penjajahan Belanda, dilansir menurut catatan milik Kantor Dinas Permukiman dan Prasarana Daerah Jawa Tengah.");
     model.setImg(R.drawable.gunung_rowo);
     models.add(model);

     model = new Model();
     model.setTitle("Klating Puncak Wangi");
     model.setDescription("Klating sendiri merupakan sebuah sungai yang berada di atas pegunungan kendeng. Berbeda dengan sungai pada umumnya, kali klating membentuk undakan layaknya air terjun bertingkat. Di setiap undakan terdapat kobangan besar menyerupai waduk dengan kedalaman tertentu. Waduk kecil inilah yang sering dimanfaatkan wisatawan untuk berenang dan mendinginkan diri di tengah terik matahari yang hangat dan cerah.");
     model.setImg(R.drawable.klating);
     models.add(model);

     model = new Model();
     model.setTitle("Air Terjun Grenjengan Sewu Jolong");
     model.setDescription("Wisata Air Terjun Grenjengan Jolong di Gembong Pati Jawa Tengah adalah tempat wisata yang ramai dengan wisatawan pada hari biasa maupun hari liburan. Tempat ini sangat indah dan bisa memberikan sensasi yang berbeda dengan aktivitas kita sehari hari.");
     model.setImg(R.drawable.grenjengan_sewu);
     models.add(model);

     model = new Model();
     model.setTitle("Lorodan Semar");
     model.setDescription("Tak seperti air terjun pada umumnya, Lorodan Semar memiliki bentuk mirip pantat atau bokong Semar. Bukan hanya sekedar mengalir dari tempat tinggi ke rendah, jika dilihat dengan cermat perbukitan di sekitar air terjun tampak hampir sama seperti pantat tokoh pewayangan Semar.");
     model.setImg(R.drawable.lorodan);
     models.add(model);


     return models;
    }
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.profil:
                Intent activity1 = new Intent(this, Toolbar.class);
                startActivity(activity1);
                return true;
            default:
                return true;
        }
    }
}
