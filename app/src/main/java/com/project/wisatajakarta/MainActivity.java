package com.project.wisatajakarta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;

    private String[] categories = {"Wisata", "Kuliner"};
    private String[][] cardContents = {
            {"Monas", "Kota Tua", "TMII", "Ancol"},
            {"Kerak Telor", "Soto Betawi", "Asinan Betawi", "Sayur Babanci"}
    };

    LinearLayout[] categoryLayouts = new LinearLayout[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryLayouts[0] = findViewById(R.id.wisataLayout);
        categoryLayouts[1] = findViewById(R.id.kulinerLayout);

        viewFlipper = findViewById(R.id.banner);
        viewFlipper.startFlipping(); // Untuk memulai otomatis berganti

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < cardContents[i].length; j++) {
                createCardView(categoryLayouts[i], cardContents[i][j]);
            }
        }
    }

    private void openDetailActivity(String buttonId) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("btn_id", buttonId);
        startActivity(intent);
    }

    private void createCardView(LinearLayout parentLayout, String cardContent) {
        View customCardView = getLayoutInflater().inflate(R.layout.custom_cardview, null);
        parentLayout.addView(customCardView);

        TextView textView = customCardView.findViewById(R.id.textview);
        ImageView imageView = customCardView.findViewById(R.id.imageview);

        textView.setText(cardContent);

        if (cardContent.equals("Monas")) {
            imageView.setImageResource(R.drawable.monas);
        } else if (cardContent.equals("Kota Tua")) {
            imageView.setImageResource(R.drawable.kota_tua);
        } else if (cardContent.equals("TMII")) {
            imageView.setImageResource(R.drawable.tmii);
        } else if (cardContent.equals("Ancol")) {
            imageView.setImageResource(R.drawable.ancol);
        } else if (cardContent.equals("Kerak Telor")) {
            imageView.setImageResource(R.drawable.keraktelor);
        } else if (cardContent.equals("Soto Betawi")) {
            imageView.setImageResource(R.drawable.sotobetawi);
        } else if (cardContent.equals("Asinan Betawi")) {
            imageView.setImageResource(R.drawable.asinanbetawi);
        } else if (cardContent.equals("Sayur Babanci")) {
            imageView.setImageResource(R.drawable.sayurbabanci);
        }
            customCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDetailActivity(cardContent);
            }
        });
    }
}