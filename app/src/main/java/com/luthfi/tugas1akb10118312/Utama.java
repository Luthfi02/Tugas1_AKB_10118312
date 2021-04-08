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

import androidx.appcompat.app.AppCompatActivity;

public class Utama extends AppCompatActivity {

    Button btnExit, btnPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        btnExit = (Button) findViewById(R.id.btnExit);
        btnPro = (Button) findViewById(R.id.btnPro);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                Intent intent = new Intent(Utama.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnPro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        //perintah untuk mengakhiri aplikasi
              Intent test = new Intent(Utama.this, Profile.class);
             startActivity(test);

          }
        });

    }
}