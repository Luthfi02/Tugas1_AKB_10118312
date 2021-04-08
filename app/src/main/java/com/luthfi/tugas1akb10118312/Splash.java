package com.luthfi.tugas1akb10118312;
/*
Tanggal : 7 April 2020 s/d 8 April 2020
NIM     : 10118312
Nama    : Luthfi Rifqi Zulfiqar
Kelas   : IF-8
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000L);
    }
}