package com.example.skylineprojectmenu2;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class KidsMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabkids1;
    MaterialCardView cardkids1;
    TextView tvInfokids1;
    boolean flag = true;

    FloatingActionButton fabkids2;
    MaterialCardView cardkids2;
    TextView tvInfokids2;
    boolean flag2 = true;

    FloatingActionButton fabkids3;
    MaterialCardView cardkids3;
    TextView tvInfokids3;
    boolean flag3 = true;

    FloatingActionButton fabkids4;
    MaterialCardView cardkids4;
    TextView tvInfokids4;
    boolean flag4 = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_menu);
        fabkids1 = findViewById(R.id.fab_kids_1);
        cardkids1 = findViewById(R.id.card_kids_1);
        tvInfokids1 = findViewById(R.id.tv_info_kids_1);
        fabkids1.setOnClickListener(this);

        fabkids2 = findViewById(R.id.fab_kids_2);
        cardkids2= findViewById(R.id.card_kids_2);
        tvInfokids2 = findViewById(R.id.tv_info_kids_2);
        fabkids2.setOnClickListener(this);

        fabkids3 = findViewById(R.id.fab_kids_3);
        cardkids3= findViewById(R.id.card_kids_3);
        tvInfokids3 = findViewById(R.id.tv_info_kids_3);
        fabkids3.setOnClickListener(this);

        fabkids4 = findViewById(R.id.fab_kids_4);
        cardkids4= findViewById(R.id.card_kids_4);
        tvInfokids4 = findViewById(R.id.tv_info_kids_4);
        fabkids4.setOnClickListener(this);

        init();

    }



    public void init() {
        tvInfokids3.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_kids_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardkids1.getLayoutParams();
                    layoutParams.height = 600;
                    cardkids1.setLayoutParams((layoutParams));
                    tvInfokids1.setVisibility(View.VISIBLE);
                    tvInfokids1.setText(R.string.Kids1Info);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardkids2.getLayoutParams();
                    layoutParams.height = 300;
                    cardkids1.setLayoutParams((layoutParams));
                    tvInfokids1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_kids_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardkids2.getLayoutParams();
                    layoutParams.height = 600;
                    cardkids2.setLayoutParams((layoutParams));
                    tvInfokids2.setVisibility(View.VISIBLE);
                    tvInfokids2.setText(R.string.Kids2Info);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardkids2.getLayoutParams();
                    layoutParams.height = 300;
                    cardkids2.setLayoutParams((layoutParams));
                    tvInfokids2.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_kids_3:


                if (flag3 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardkids3.getLayoutParams();
                    layoutParams.height = 600;
                    cardkids3.setLayoutParams((layoutParams));
                    tvInfokids3.setVisibility(View.VISIBLE);
                    tvInfokids3.setText(R.string.Kids3Info);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardkids3.getLayoutParams();
                    layoutParams.height = 300;
                    cardkids3.setLayoutParams((layoutParams));
                    tvInfokids3.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_kids_4:

            if (flag4 == true) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardkids4.getLayoutParams();
                layoutParams.height = 600;
                cardkids4.setLayoutParams((layoutParams));
                tvInfokids4.setVisibility(View.VISIBLE);
                tvInfokids4.setText(R.string.Kids4Info);
                flag = false;
            } else {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardkids2.getLayoutParams();
                layoutParams.height = 300;
                cardkids4.setLayoutParams((layoutParams));
                tvInfokids4.setVisibility(View.GONE);
            }
            break;

        }
    }
}