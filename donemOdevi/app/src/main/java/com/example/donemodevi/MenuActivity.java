package com.example.donemodevi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    ImageButton sinavAyarlari,soruEkle,questionListButton,sendExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Soru Ayarları
        sinavAyarlari = (ImageButton)findViewById(R.id.sinavAyarlari);
        sinavAyarlari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, questionSettings.class);
                startActivity(intent);
            }
        });

        //Soru Ekleme
        soruEkle = (ImageButton)findViewById(R.id.soruEkle);
        soruEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, questionAdd.class);
                startActivity(intent);
            }
        });

        //Soru Listeleme
        questionListButton = (ImageButton)findViewById(R.id.questionListButton);
        questionListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, questionList.class);
                startActivity(intent);
            }
        });

        //Sınav Ekleme
        sendExam = (ImageButton)findViewById(R.id.sendExam);
        sendExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, examAdd.class);
                startActivity(intent);
            }
        });

    }
}