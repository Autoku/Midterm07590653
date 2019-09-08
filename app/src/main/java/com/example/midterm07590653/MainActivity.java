package com.example.midterm07590653;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.security.Key;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = getIntent();
        String inputEmail = "aaa";
        String loginKey = intent.getStringExtra(inputEmail);
        if(loginKey.equals("aaa")){
            Toast.makeText(
                    MainActivity.this,
                    R.string.Login_susccss+" Autoku Sinthurak",
                    Toast.LENGTH_SHORT
            ).show();
            TextView PView = findViewById(R.id.ProfView);
            TextView GTV = findViewById(R.id.GtView);
            TextView LIV = findViewById(R.id.LiView);
            TextView FromV = findViewById(R.id.FromView);
            PView.setText("Autoku Sinthurak");
            GTV.setText("ชัยภูมิภักดีชุมพล");
            LIV.setText("ชัยภูมิ");
            FromV.setText("ชัยภูมิ");
        }
        else if(loginKey.equals("bbb")){
            Toast.makeText(
                    MainActivity.this,
                    R.string.Login_susccss+" Promlert Lovichit",
                    Toast.LENGTH_SHORT
            ).show();
            TextView PView = findViewById(R.id.ProfView);
            TextView GTV = findViewById(R.id.GtView);
            TextView LIV = findViewById(R.id.LiView);
            TextView FromV = findViewById(R.id.FromView);
            PView.setText("Promlert Lovichit");
            GTV.setText("สวนกุหลาบวิทยา");
            LIV.setText("กรุงเทพหมานคร");
            FromV.setText("กรุงเทพมหานคร");
        }
    }
}
