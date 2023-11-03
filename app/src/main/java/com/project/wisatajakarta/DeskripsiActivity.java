package com.project.wisatajakarta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DeskripsiActivity extends AppCompatActivity {

    private TextView txDeskripsi;
    private View btnBack;
    private String buttonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);

        btnBack = findViewById(R.id.btnbackdeskripsi);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DeskripsiActivity.this, DetailActivity.class);
                intent.putExtra("btn_id", buttonId);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        if (intent != null) {
            buttonId = intent.getStringExtra("btn_id");
            memasukanText();
            displayTitleDeskripsi(buttonId);
        }
    }
    private void memasukanText() {
        txDeskripsi = findViewById(R.id.textdeskripsi);
    }

    private void displayTitleDeskripsi(String buttonId) {
        TextView titleTextView = findViewById(R.id.juduldeskripsi);
        if (titleTextView != null) {
            titleTextView.setText("Deskripsi " + buttonId);
        }
        if ("Monas".equals(buttonId)) {
            txDeskripsi.setText(R.string.deskripsimonas);
        } else if ("Kota Tua".equals(buttonId)) {
            txDeskripsi.setText(R.string.deskripsikotatua);
        } else if ("TMII".equals(buttonId)) {
            txDeskripsi.setText(R.string.deskripsitmii);
        } else if ("Ancol".equals(buttonId)) {
            txDeskripsi.setText(R.string.deskripsiancol);
        } else if ("Kerak Telor".equals(buttonId)) {
            txDeskripsi.setText(R.string.deskripsikeraktelor);
        } else if ("Soto Betawi".equals(buttonId)) {
            txDeskripsi.setText(R.string.deskripsisotobetawi);
        } else if ("Asinan Betawi".equals(buttonId)) {
            txDeskripsi.setText(R.string.deskripsiasinanbetawi);
        } else if ("Sayur Babanci".equals(buttonId)) {
            txDeskripsi.setText(R.string.deskripsisayurbabanci);
        }
    }
}