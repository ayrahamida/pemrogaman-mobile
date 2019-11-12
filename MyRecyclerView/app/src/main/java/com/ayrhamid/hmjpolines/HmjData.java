package com.ayrhamid.hmjpolines;

import android.provider.ContactsContract;

import java.util.ArrayList;

public class HmjData {
    public static String[][] data = new String[][]{
            {"0", "HMJ Elektro", "Himpunan Mahasiswa Elektro Terdiri dari 5 Program Studi yaitu D3 Teknik Informatika, D3 Teknik Elektronika, D3 Teknk Listrik, D3 Teknik Telekomunikasi, D4 Teknik Telekomunikasi", "https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1", "HMJ Sipil", "Himpunan Mahasiswa Sipil Terdiri dari 5 Program Studi yaitu D4 Kontruksi Sipil, D3 Kontruksi Gedung, D3 Kontruksi Sipil, D3 Teknik Telekomunikasi", "https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"2", "HMJ Mesin", "Himpunan Mahasiswa Mesin Terdiri dari 5 Program Studi yaitu D3 Teknik Mesin, D4 Teknik Mesin, D4 Konversi Energi, D3 Pengembangan Energi", "https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"3", "HMJ Akuntansi", "Himpunan Mahasiswa Akuntansi Terdiri dari 5 Program Studi yaitu D3 Akuntansi, D4 Akuntansi, D3 Perbankan Syariah, D4 Komputerisasi Akuntansi", "https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            {"4", "HMJ Administrasi Bisnis", "Himpunan Mahasiswa Administrasi Bisnis Terdiri dari 5 Program Studi yaitu D3 Administrasi Bisnis, D4 Administrasi Bisnis Internasional, D3 Teknk Listrik", "https://i.postimg.cc/pLYvD1Z4/hmab.jpg"},

    };
    public  static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String[] aData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
