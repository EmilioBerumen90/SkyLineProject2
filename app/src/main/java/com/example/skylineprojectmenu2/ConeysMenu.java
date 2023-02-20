package com.example.skylineprojectmenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ConeysMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabConey1;
    MaterialCardView cardConey1;
    TextView tvInfoConey1;
    boolean flag = true;

    FloatingActionButton fabConey2;
    MaterialCardView cardConey2;
    TextView tvInfoConey2;
    boolean flag2 = true;

    FloatingActionButton fabConey3;
    MaterialCardView cardConey3;
    TextView tvInfoConey3;
    boolean flag3 = true;


    FloatingActionButton HomeBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coneys_menu);
        fabConey1 = findViewById(R.id.fab_coney_1);
        cardConey1 = findViewById(R.id.card_coneys_1);
        tvInfoConey1 = findViewById(R.id.tv_info_coney_1);
        fabConey1.setOnClickListener(this);



        fabConey2 = findViewById(R.id.fab_coney_2);
        cardConey2 = findViewById(R.id.card_coneys_2);
        tvInfoConey2 = findViewById(R.id.tv_info_coney_2);
        fabConey2.setOnClickListener(this);

        fabConey3 = findViewById(R.id.fab_coney_3);
        cardConey3 = findViewById(R.id.card_coneys_3);
        tvInfoConey3 = findViewById(R.id.tv_info_coney_3);
        fabConey3.setOnClickListener(this);

        init();

        HomeBTN = findViewById(R.id.fab_home);
        HomeBTN.setOnClickListener(this);

    }



    public void init() {
        tvInfoConey1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_coney_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardConey1.getLayoutParams();
                    layoutParams.height = 600;
                    cardConey1.setLayoutParams((layoutParams));
                    tvInfoConey1.setVisibility(View.VISIBLE);
                    tvInfoConey1.setText(R.string.Coney1Info);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardConey1.getLayoutParams();
                    layoutParams.height = 300;
                    cardConey1.setLayoutParams((layoutParams));
                    tvInfoConey1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_coney_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardConey2.getLayoutParams();
                    layoutParams.height = 600;
                    cardConey2.setLayoutParams((layoutParams));
                    tvInfoConey2.setVisibility(View.VISIBLE);
                    tvInfoConey2.setText(R.string.Coney2Info);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardConey2.getLayoutParams();
                    layoutParams.height = 300;
                    cardConey2.setLayoutParams((layoutParams));
                    tvInfoConey2.setVisibility(View.GONE);
                }

                break;


            case R.id.fab_coney_3:


                if (flag3 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardConey3.getLayoutParams();
                    layoutParams.height = 600;
                    cardConey3.setLayoutParams((layoutParams));
                    tvInfoConey3.setVisibility(View.VISIBLE);
                    tvInfoConey3.setText(R.string.Coney3Info);
                    flag3 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardConey3.getLayoutParams();
                    layoutParams.height = 300;
                    cardConey3.setLayoutParams((layoutParams));
                    tvInfoConey3.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_home:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;


        }





    }
}