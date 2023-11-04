package com.project.wisatajakarta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private ImageView gambar1, gambar2, gambar3;
    private String buttonId;
    private View btnBack,btnDeskripsi, btnMaps;
    private String tujuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btnBack = findViewById(R.id.btnbackdetail);
        btnDeskripsi = findViewById(R.id.btndeskripsi);
        btnMaps = findViewById(R.id.btnmaps);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, LokasiActivity.class);
                intent.putExtra("btn_id", buttonId);
                startActivity(intent);
            }
        });

        btnDeskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailActivity.this, DeskripsiActivity.class);
                intent.putExtra("btn_id", buttonId);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        if (intent != null) {
            buttonId = intent.getStringExtra("btn_id");
            memasukanGambar();
            displayTitleDetails(buttonId);
        }
    }
    private void memasukanGambar() {
        gambar1 = findViewById(R.id.gambar1);
        gambar2 = findViewById(R.id.gambar2);
        gambar3 = findViewById(R.id.gambar3);
    }
    private void displayTitleDetails(String buttonId) {
        TextView titleTextView = findViewById(R.id.juduldetail);
        if (titleTextView != null) {
            titleTextView.setText("Gallery " + buttonId);
        }

        if ("Monas".equals(buttonId)) {
            gambar1.setImageResource(R.drawable.monasdetail1);
            gambar2.setImageResource(R.drawable.monasdetail2);
            gambar3.setImageResource(R.drawable.monasdetail3);
            tujuan = buttonId;
        } else if ("Kota Tua".equals(buttonId)) {
            gambar1.setImageResource(R.drawable.kotatuadetail1);
            gambar2.setImageResource(R.drawable.kotatuadetail2);
            gambar3.setImageResource(R.drawable.kotatuadetail3);
            tujuan = buttonId;
        } else if ("TMII".equals(buttonId)) {
            gambar1.setImageResource(R.drawable.tmiidetail1);
            gambar2.setImageResource(R.drawable.tmiidetail2);
            gambar3.setImageResource(R.drawable.tmiidetail3);
            tujuan = buttonId;
        } else if ("Ancol".equals(buttonId)) {
            gambar1.setImageResource(R.drawable.ancoldetail1);
            gambar2.setImageResource(R.drawable.ancoldetail2);
            gambar3.setImageResource(R.drawable.ancoldetail3);
            tujuan = buttonId;
        } else if ("Kerak Telor".equals(buttonId)) {
            gambar1.setImageResource(R.drawable.keraktelordetail1);
            gambar2.setImageResource(R.drawable.keraktelordetail2);
            gambar3.setImageResource(R.drawable.keraktelordetail3);
            tujuan = buttonId;
        } else if ("Soto Betawi".equals(buttonId)) {
            gambar1.setImageResource(R.drawable.sotobetawildetail1);
            gambar2.setImageResource(R.drawable.sotobetawildetail2);
            gambar3.setImageResource(R.drawable.sotobetawildetail3);
            tujuan = buttonId;
        } else if ("Asinan Betawi".equals(buttonId)) {
            gambar1.setImageResource(R.drawable.asinanbetawidetail1);
            gambar2.setImageResource(R.drawable.asinanbetawidetail2);
            gambar3.setImageResource(R.drawable.asinanbetawidetail3);
            tujuan = buttonId;
        } else if ("Sayur Babanci".equals(buttonId)) {
            gambar1.setImageResource(R.drawable.sayurbabancidetail1);
            gambar2.setImageResource(R.drawable.sayurbabancidetail2);
            gambar3.setImageResource(R.drawable.sayurbabancidetail3);
            tujuan = buttonId;
        }
    }
}