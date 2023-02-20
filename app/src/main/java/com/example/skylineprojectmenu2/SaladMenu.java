package com.example.skylineprojectmenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SaladMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabsalad1;
    MaterialCardView cardsalad1;
    TextView tvInfosalad1;
    boolean flag = true;

    FloatingActionButton fabsalad2;
    MaterialCardView cardsalad2;
    TextView tvInfosalad2;
    boolean flag2 = true;

    FloatingActionButton fabsalad3;
    MaterialCardView cardsalad3;
    TextView tvInfosalad3;
    boolean flag3 = true;

    FloatingActionButton HomeBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salad_menu);
        fabsalad1 = findViewById(R.id.fab_salad_1);
        cardsalad1 = findViewById(R.id.card_salad_1);
        tvInfosalad1 = findViewById(R.id.tv_info_salad_1);
        fabsalad1.setOnClickListener(this);

        fabsalad2 = findViewById(R.id.fab_salad_2);
        cardsalad2= findViewById(R.id.card_salad_2);
        tvInfosalad2 = findViewById(R.id.tv_info_salad_2);
        fabsalad2.setOnClickListener(this);

        fabsalad3 = findViewById(R.id.fab_salad_3);
        cardsalad3= findViewById(R.id.card_salad_3);
        tvInfosalad3 = findViewById(R.id.tv_info_salad_3);
        fabsalad3.setOnClickListener(this);

        init();

        HomeBTN = findViewById(R.id.fab_home);
        HomeBTN.setOnClickListener(this);

    }



    public void init() {
        tvInfosalad1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_salad_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardsalad1.getLayoutParams();
                    layoutParams.height = 600;
                    cardsalad1.setLayoutParams((layoutParams));
                    tvInfosalad1.setVisibility(View.VISIBLE);
                    tvInfosalad1.setText(R.string.salad1Info);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardsalad1.getLayoutParams();
                    layoutParams.height = 300;
                    cardsalad1.setLayoutParams((layoutParams));
                    tvInfosalad1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_salad_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardsalad2.getLayoutParams();
                    layoutParams.height = 600;
                    cardsalad2.setLayoutParams((layoutParams));
                    tvInfosalad2.setVisibility(View.VISIBLE);
                    tvInfosalad2.setText(R.string.salad2Info);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardsalad2.getLayoutParams();
                    layoutParams.height = 300;
                    cardsalad2.setLayoutParams((layoutParams));
                    tvInfosalad2.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_salad_3:


                if (flag3 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardsalad3.getLayoutParams();
                    layoutParams.height = 600;
                    cardsalad3.setLayoutParams((layoutParams));
                    tvInfosalad3.setVisibility(View.VISIBLE);
                    tvInfosalad3.setText(R.string.salad3Info);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardsalad3.getLayoutParams();
                    layoutParams.height = 300;
                    cardsalad3.setLayoutParams((layoutParams));
                    tvInfosalad3.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_home:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}