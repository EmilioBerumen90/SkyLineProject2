package com.example.skylineprojectmenu2;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DessertMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabDessert1;
    MaterialCardView cardDessert1;
    TextView tvInfoDessert1;
    boolean flag = true;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert_menu);
        fabDessert1 = findViewById(R.id.fab_dessert_1);
        cardDessert1 = findViewById(R.id.card_dessert_1);
        tvInfoDessert1= findViewById(R.id.tv_info_dessert_1);
        fabDessert1.setOnClickListener(this);



        init();

    }



    public void init() {
        tvInfoDessert1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_dessert_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardDessert1.getLayoutParams();
                    layoutParams.height = 600;
                    cardDessert1.setLayoutParams((layoutParams));
                    tvInfoDessert1.setVisibility(View.VISIBLE);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardDessert1.getLayoutParams();
                    layoutParams.height = 300;
                    cardDessert1.setLayoutParams((layoutParams));
                    tvInfoDessert1.setVisibility(View.GONE);
                }
                break;



        }
    }
}