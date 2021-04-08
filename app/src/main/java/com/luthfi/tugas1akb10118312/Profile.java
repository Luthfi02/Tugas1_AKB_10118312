package com.luthfi.tugas1akb10118312;
/*
Tanggal : 7 April 2020 s/d 8 April 2020
NIM     : 10118312
Nama    : Luthfi Rifqi Zulfiqar
Kelas   : IF-8
 */
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Profile extends AppCompatActivity {
    Button btnKem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnKem = (Button) findViewById(R.id.btnKem);
        btnKem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk mengakhiri aplikasi
                Intent intent = new Intent(Profile.this, Utama.class);
                startActivity(intent);

            }
        });
    }
}