package com.project.wisatajakarta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class LokasiActivity extends AppCompatActivity {
    private WebView webView;
    private View btnBack;
    String buttonId, tujuan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokasi);

        btnBack = findViewById(R.id.btnbacklokasi);

        Intent intent = getIntent();
        if (intent != null) {
            buttonId = intent.getStringExtra("btn_id");
            displayLokasiDetails(buttonId);
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LokasiActivity.this, DetailActivity.class);
                intent.putExtra("btn_id", buttonId);
                startActivity(intent);
            }
        });

        webView = findViewById(R.id.webView);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String url = "https://www.google.com/maps/search/"+tujuan;
        webView.loadUrl(url);
    }

    private void displayLokasiDetails(String buttonId) {
        TextView titleTextView = findViewById(R.id.judullokasi);
        if (titleTextView != null) {
            titleTextView.setText("Peta Lokasi " + buttonId);
        }

        if ("Monas".equals(buttonId)) {
            tujuan = buttonId;
        } else if ("Kota Tua".equals(buttonId)) {
            tujuan = "Kawasan Wisata Kota Tua Jakarta";
        } else if ("TMII".equals(buttonId)) {
            tujuan = "Taman Mini Indonesia Indah";
        } else if ("Ancol".equals(buttonId)) {
            tujuan = buttonId;
        } else if ("Kerak Telor".equals(buttonId)) {
            tujuan = buttonId;
        } else if ("Soto Betawi".equals(buttonId)) {
            tujuan = buttonId;
        } else if ("Asinan Betawi".equals(buttonId)) {
            tujuan = buttonId;
        } else if ("Sayur Babanci".equals(buttonId)) {
            tujuan = buttonId;
        }
    }
}