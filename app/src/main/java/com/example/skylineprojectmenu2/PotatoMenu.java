package com.example.skylineprojectmenu2;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PotatoMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabpotato1;
    MaterialCardView cardpotato1;
    TextView tvInfopotato1;
    boolean flag = true;

    FloatingActionButton fabpotato2;
    MaterialCardView cardpotato2;
    TextView tvInfopotato2;
    boolean flag2 = true;

    FloatingActionButton fabpotato3;
    MaterialCardView cardpotato3;
    TextView tvInfopotato3;
    boolean flag3 = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato_menu);
        fabpotato1 = findViewById(R.id.fab_potatoes_1);
        cardpotato1 = findViewById(R.id.card_potatoes_1);
        tvInfopotato1 = findViewById(R.id.tv_info_potatoes_1);
        fabpotato1.setOnClickListener(this);

        fabpotato2 = findViewById(R.id.fab_potatoes_2);
        cardpotato2= findViewById(R.id.card_potatoes_2);
        tvInfopotato2 = findViewById(R.id.tv_info_potatoes_2);
        fabpotato2.setOnClickListener(this);

        fabpotato3 = findViewById(R.id.fab_potatoes_3);
        cardpotato3= findViewById(R.id.card_potatoes_3);
        tvInfopotato3 = findViewById(R.id.tv_info_potatoes_3);
        fabpotato3.setOnClickListener(this);

        init();

    }



    public void init() {
        tvInfopotato1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_potatoes_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardpotato1.getLayoutParams();
                    layoutParams.height = 600;
                    cardpotato1.setLayoutParams((layoutParams));
                    tvInfopotato1.setVisibility(View.VISIBLE);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardpotato2.getLayoutParams();
                    layoutParams.height = 300;
                    cardpotato1.setLayoutParams((layoutParams));
                    tvInfopotato1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_potatoes_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardpotato2.getLayoutParams();
                    layoutParams.height = 600;
                    cardpotato2.setLayoutParams((layoutParams));
                    tvInfopotato2.setVisibility(View.VISIBLE);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardpotato2.getLayoutParams();
                    layoutParams.height = 300;
                    cardpotato2.setLayoutParams((layoutParams));
                    tvInfopotato2.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_potatoes_3:


                if (flag3 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardpotato3.getLayoutParams();
                    layoutParams.height = 600;
                    cardpotato3.setLayoutParams((layoutParams));
                    tvInfopotato3.setVisibility(View.VISIBLE);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardpotato3.getLayoutParams();
                    layoutParams.height = 300;
                    cardpotato3.setLayoutParams((layoutParams));
                    tvInfopotato3.setVisibility(View.GONE);
                }

                break;

        }
    }
}