package com.luthfi.tugas1akb10118312;
/*
Tanggal : 7 April 2020 s/d 8 April 2020
NIM     : 10118312
Nama    : Luthfi Rifqi Zulfiqar
Kelas   : IF-8
 */
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Registrasi extends AppCompatActivity {
    Button btnBack, btnDaftar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnDaftar = (Button) findViewById(R.id.btnDaftar);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Registrasi.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Registrasi.this, "Akun anda berhasil di daftarkan",Toast.LENGTH_LONG).show();
                Intent test = new Intent(Registrasi.this, MainActivity.class);
                Registrasi.this.startActivity(test);

                finish();
            }

        });
    }
}