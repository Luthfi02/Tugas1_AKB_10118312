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
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin, btnRegistrasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button)findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("123")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, Utama.class);
                    startActivity(intent);
                }else {

                }
            }

        });

        btnRegistrasi = (Button) findViewById(R.id.btnRegistrasi);
        btnRegistrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent test = new Intent(MainActivity.this, Registrasi.class);
                startActivity(test);
            }
        });

    }
}