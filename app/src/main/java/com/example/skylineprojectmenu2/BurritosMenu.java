package com.example.skylineprojectmenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BurritosMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabBC1;
    MaterialCardView cardBC1;
    TextView tvInfoBC1;
    boolean flag = true;

    FloatingActionButton fabBC2;
    MaterialCardView cardBC2;
    TextView tvInfoBC2;
    boolean flag2 = true;

    FloatingActionButton fabBC3;
    MaterialCardView cardBC3;
    TextView tvInfoBC3;
    boolean flag3 = true;

    FloatingActionButton HomeBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burritos_menu);
        fabBC1 = findViewById(R.id.fab_BC_1);
        cardBC1 = findViewById(R.id.card_BC_1);
        tvInfoBC1 = findViewById(R.id.tv_info_BC_1);
        fabBC1.setOnClickListener(this);

        fabBC2 = findViewById(R.id.fab_BC_2);
        cardBC2= findViewById(R.id.card_BC_2);
        tvInfoBC2 = findViewById(R.id.tv_infoBC_2);
        fabBC2.setOnClickListener(this);

        fabBC3 = findViewById(R.id.fab_BC_3);
        cardBC3 = findViewById(R.id.card_BC_3);
        tvInfoBC3= findViewById(R.id.tv_infoBC_3);
        fabBC3.setOnClickListener(this);

        init();

        HomeBTN = findViewById(R.id.fab_home);
        HomeBTN.setOnClickListener(this);

    }



    public void init() {
        tvInfoBC1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_BC_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBC1.getLayoutParams();
                    layoutParams.height = 600;
                    cardBC1.setLayoutParams((layoutParams));
                    tvInfoBC1.setVisibility(View.VISIBLE);
                    tvInfoBC1.setText(R.string.BC1Info);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBC1.getLayoutParams();
                    layoutParams.height = 300;
                    cardBC1.setLayoutParams((layoutParams));
                    tvInfoBC1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_BC_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBC2.getLayoutParams();
                    layoutParams.height = 600;
                    cardBC2.setLayoutParams((layoutParams));
                    tvInfoBC2.setVisibility(View.VISIBLE);
                    tvInfoBC2.setText(R.string.BC2Info);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBC2.getLayoutParams();
                    layoutParams.height = 300;
                    cardBC2.setLayoutParams((layoutParams));
                    tvInfoBC2.setVisibility(View.GONE);
                }

                break;


            case R.id.fab_BC_3:


            if (flag3 == true) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBC3.getLayoutParams();
                layoutParams.height = 600;
                cardBC3.setLayoutParams((layoutParams));
                tvInfoBC3.setVisibility(View.VISIBLE);
                tvInfoBC3.setText(R.string.BC3Info);
                flag3 = false;
            } else {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBC3.getLayoutParams();
                layoutParams.height = 300;
                cardBC3.setLayoutParams((layoutParams));
                tvInfoBC3.setVisibility(View.GONE);
            }

                break;

            case R.id.fab_home:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}