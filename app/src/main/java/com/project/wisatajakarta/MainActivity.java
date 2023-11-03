package com.project.wisatajakarta;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout cvMonas, cvKotaTua, cvTMII, cvAncol, cvKerakTelor, cvSotoBetawi, cvAsinanBetawi, cvSayurBabanci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvMonas = findViewById(R.id.btnmonas);
        cvKotaTua = findViewById(R.id.btnkotatua);
        cvTMII = findViewById(R.id.btntmii);
        cvAncol = findViewById(R.id.btnancol);
        cvKerakTelor = findViewById(R.id.btnkeraktelor);
        cvSotoBetawi = findViewById(R.id.btnsotobetawi);
        cvAsinanBetawi =findViewById(R.id.btnasinanbetawi);
        cvSayurBabanci = findViewById(R.id.btnsayurbabanci);

        cvMonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Monas");
            }
        });

        cvKotaTua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Kota Tua");
            }
        });

        cvTMII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("TMII");
            }
        });

        cvAncol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Ancol");
            }
        });

        cvKerakTelor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Kerak Telor");
            }
        });

        cvSotoBetawi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Soto Betawi");
            }
        });

        cvAsinanBetawi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Asinan Betawi");
            }
        });

        cvSayurBabanci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity("Sayur Babanci");
            }
        });



    }
    private void openDetailActivity(String buttonId) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("btn_id", buttonId);
        startActivity(intent);
    }
}