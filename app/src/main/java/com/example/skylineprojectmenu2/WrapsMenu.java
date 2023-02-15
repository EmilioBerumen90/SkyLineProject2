package com.example.skylineprojectmenu2;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class WrapsMenu extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fabWraps1;
    MaterialCardView cardwraps1;
    TextView tvInfowraps1;
    boolean flag = true;

    FloatingActionButton fabWraps2;
    MaterialCardView cardWraps2;
    TextView tvInfoWraps2;
    boolean flag2 = true;

    FloatingActionButton fabWraps3;
    MaterialCardView cardWraps3;
    TextView tvInfoWraps3;
    boolean flag3 = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wraps_menu);
        fabWraps1 = findViewById(R.id.fab_wraps_1);
        cardwraps1= findViewById(R.id.card_wraps_1);
        tvInfowraps1 = findViewById(R.id.tv_info_wraps_1);
        fabWraps1.setOnClickListener(this);

        fabWraps2 = findViewById(R.id.fab_wraps_2);
        cardWraps2= findViewById(R.id.card_wraps_2);
        tvInfoWraps2 = findViewById(R.id.tv_info_wraps_2);
        fabWraps2.setOnClickListener(this);

        fabWraps3 = findViewById(R.id.fab_wraps_3);
        cardWraps3 = findViewById(R.id.card_wraps_3);
        tvInfoWraps3= findViewById(R.id.tv_info_wraps_3);
        fabWraps3.setOnClickListener(this);

        init();

    }



    public void init() {
        tvInfowraps1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.fab_wraps_1:


                if (flag == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardwraps1.getLayoutParams();
                    layoutParams.height = 600;
                    cardwraps1.setLayoutParams((layoutParams));
                    tvInfowraps1.setVisibility(View.VISIBLE);
                    tvInfowraps1.setText(R.string.Wraps1Info);
                    flag = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardwraps1.getLayoutParams();
                    layoutParams.height = 300;
                    cardwraps1.setLayoutParams((layoutParams));
                    tvInfowraps1.setVisibility(View.GONE);
                }
                break;

            case R.id.fab_wraps_2:


                if (flag2 == true) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWraps2.getLayoutParams();
                    layoutParams.height = 600;
                    cardWraps2.setLayoutParams((layoutParams));
                    tvInfoWraps2.setVisibility(View.VISIBLE);
                    tvInfoWraps2.setText(R.string.Wraps2nfo);
                    flag2 = false;
                } else {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWraps2.getLayoutParams();
                    layoutParams.height = 300;
                    cardWraps2.setLayoutParams((layoutParams));
                    tvInfoWraps2.setVisibility(View.GONE);
                }

                break;


            case R.id.fab_wraps_3:


            if (flag3 == true) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWraps3.getLayoutParams();
                layoutParams.height = 600;
                cardWraps3.setLayoutParams((layoutParams));
                tvInfoWraps3.setVisibility(View.VISIBLE);
                tvInfoWraps3.setText(R.string.Wraps3nfo);
                flag3 = false;
            } else {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardWraps3.getLayoutParams();
                layoutParams.height = 300;
                cardWraps3.setLayoutParams((layoutParams));
                tvInfoWraps3.setVisibility(View.GONE);
            }

                break;

        }
    }
}