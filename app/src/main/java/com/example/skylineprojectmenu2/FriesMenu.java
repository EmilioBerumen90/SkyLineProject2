package com.example.skylineprojectmenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FriesMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabFries1;
    MaterialCardView cardFries1;
    TextView tvInfoFries1;
    boolean flag = true;

    FloatingActionButton fabFries2;
    MaterialCardView cardFries2;
    TextView tvInfoFries2;
    boolean flag2 = true;

    FloatingActionButton HomeBTN;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fries_menu);
        fabFries1 = findViewById(R.id.fab_fries_1);
        cardFries1 = findViewById(R.id.card_fries_1);
        tvInfoFries1 = findViewById(R.id.tv_info_fries_1);
        fabFries1.setOnClickListener(this);

        fabFries2 = findViewById(R.id.fab_fries_2);
        cardFries2= findViewById(R.id.card_fries_2);
        tvInfoFries2 = findViewById(R.id.tv_info_fries_2);
        fabFries2.setOnClickListener(this);

        init();

        HomeBTN = findViewById(R.id.fab_home);
        HomeBTN.setOnClickListener(this);

    }



    public void init() {
        tvInfoFries1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_fries_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardFries1.getLayoutParams();
                    layoutParams.height = 600;
                    cardFries1.setLayoutParams((layoutParams));
                    tvInfoFries1.setVisibility(View.VISIBLE);
                    tvInfoFries1.setText(R.string.Fries1Info);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardFries1.getLayoutParams();
                    layoutParams.height = 300;
                    cardFries1.setLayoutParams((layoutParams));
                    tvInfoFries1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_fries_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardFries2.getLayoutParams();
                    layoutParams.height = 600;
                    cardFries2.setLayoutParams((layoutParams));
                    tvInfoFries2.setVisibility(View.VISIBLE);
                    tvInfoFries2.setText(R.string.Fries2nfo);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardFries2.getLayoutParams();
                    layoutParams.height = 300;
                    cardFries2.setLayoutParams((layoutParams));
                    tvInfoFries2.setVisibility(View.GONE);
                }

                break;

            case R.id.fab_home:
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                break;

        }
    }
}