package com.example.skylineprojectmenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WaysMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabWay1;
    MaterialCardView cardWay1;
    TextView tvInfoWay1;
    boolean flag = true;

    FloatingActionButton fabWay2;
    MaterialCardView cardWay2;
    TextView tvInfoWay2;
    boolean flag2 = true;

    FloatingActionButton fabWay3;
    MaterialCardView cardWay3;
    TextView tvInfoWay3;
    boolean flag3 = true;

    FloatingActionButton HomeBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ways_menu);
        fabWay1 = findViewById(R.id.fab_way_1);
        cardWay1 = findViewById(R.id.card_ways_1);
        tvInfoWay1 = findViewById(R.id.tv_info_way_1);
        fabWay1.setOnClickListener(this);

        fabWay2 = findViewById(R.id.fab_way_2);
        cardWay2= findViewById(R.id.card_ways_2);
        tvInfoWay2 = findViewById(R.id.tv_info_ways_2);
        fabWay2.setOnClickListener(this);

        fabWay3 = findViewById(R.id.fab_way_3);
        cardWay3 = findViewById(R.id.card_ways_3);
        tvInfoWay3= findViewById(R.id.tv_info_way_3);
        fabWay3.setOnClickListener(this);

        init();

        HomeBTN = findViewById(R.id.fab_home);
        HomeBTN.setOnClickListener(this);

    }



    public void init() {
        tvInfoWay1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_way_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWay1.getLayoutParams();
                    layoutParams.height = 600;
                    cardWay1.setLayoutParams((layoutParams));
                    tvInfoWay1.setVisibility(View.VISIBLE);
                    tvInfoWay1.setText(R.string.Ways1Info);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWay1.getLayoutParams();
                    layoutParams.height = 300;
                    cardWay1.setLayoutParams((layoutParams));
                    tvInfoWay1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_way_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWay2.getLayoutParams();
                    layoutParams.height = 600;
                    cardWay2.setLayoutParams((layoutParams));
                    tvInfoWay2.setVisibility(View.VISIBLE);
                    tvInfoWay2.setText(R.string.Ways2Info);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWay2.getLayoutParams();
                    layoutParams.height = 300;
                    cardWay2.setLayoutParams((layoutParams));
                    tvInfoWay2.setVisibility(View.GONE);
                }

                break;


            case R.id.fab_way_3:_3:


                if (flag3 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWay3.getLayoutParams();
                    layoutParams.height = 600;
                    cardWay3.setLayoutParams((layoutParams));
                    tvInfoWay3.setVisibility(View.VISIBLE);
                    tvInfoWay3.setText(R.string.Ways3Info);
                    flag3 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWay3.getLayoutParams();
                    layoutParams.height = 300;
                    cardWay3.setLayoutParams((layoutParams));
                    tvInfoWay3.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_home:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}