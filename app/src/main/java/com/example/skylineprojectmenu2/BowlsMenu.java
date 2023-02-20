package com.example.skylineprojectmenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BowlsMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabBowl1;
    MaterialCardView cardBowl1;
    TextView tvInfoBowl1;
    boolean flag = true;

    FloatingActionButton fabBowl2;
    MaterialCardView cardBowl2;
    TextView tvInfoBowl2;
    boolean flag2 = true;


    FloatingActionButton HomeBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bowls_menu);
        fabBowl1 = findViewById(R.id.fab_bowl_1);
        cardBowl1 = findViewById(R.id.card_bowl_1);
        tvInfoBowl1 = findViewById(R.id.tv_info_bowl_1);
        fabBowl1.setOnClickListener(this);



        fabBowl2 = findViewById(R.id.fab_bowl_2);
        cardBowl2 = findViewById(R.id.card_bowl_2);
        tvInfoBowl2 = findViewById(R.id.tv_info_bowl_2);
        fabBowl2.setOnClickListener(this);


        init();

        HomeBTN = findViewById(R.id.fab_home);
        HomeBTN.setOnClickListener(this);

    }



    public void init() {
        tvInfoBowl1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_bowl_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBowl1.getLayoutParams();
                    layoutParams.height = 600;
                    cardBowl1.setLayoutParams((layoutParams));
                    tvInfoBowl1.setVisibility(View.VISIBLE);
                    tvInfoBowl1.setText(R.string.Bowls1Info);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBowl1.getLayoutParams();
                    layoutParams.height = 300;
                    cardBowl1.setLayoutParams((layoutParams));
                    tvInfoBowl1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_bowl_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBowl2.getLayoutParams();
                    layoutParams.height = 600;
                    cardBowl2.setLayoutParams((layoutParams));
                    tvInfoBowl2.setVisibility(View.VISIBLE);
                    tvInfoBowl2.setText(R.string.Bowls2Info);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardBowl2.getLayoutParams();
                    layoutParams.height = 300;
                    cardBowl2.setLayoutParams((layoutParams));
                    tvInfoBowl2.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_home:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;


        }
    }
}