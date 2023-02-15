package com.example.skylineprojectmenu2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    FloatingActionButton fabConey;

    FloatingActionButton fabWay;

    FloatingActionButton fabBowl;

    FloatingActionButton fabBC;

    FloatingActionButton fabWraps;

    FloatingActionButton fabsalad;

    FloatingActionButton fabpotatoes;

    FloatingActionButton fabkids;

    FloatingActionButton fabDessert;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fabConey = findViewById(R.id.fab_coney);
        fabConey.setOnClickListener(this);

        fabWay = findViewById(R.id.fab_ways);
        fabWay.setOnClickListener(this);

        fabBowl = findViewById(R.id.fab_bowl);
        fabBowl.setOnClickListener(this);

        fabBC = findViewById(R.id.fab_BC);
        fabBC.setOnClickListener(this);

        fabWraps = findViewById(R.id.fab_wraps);
        fabWraps.setOnClickListener(this);

        fabsalad = findViewById(R.id.fab_Salads);
        fabsalad.setOnClickListener(this);

        fabpotatoes = findViewById(R.id.fab_Potatoes);
        fabpotatoes.setOnClickListener(this);

        fabkids = findViewById(R.id.fab_kids);
        fabkids.setOnClickListener(this);

        fabDessert= findViewById(R.id.fab_Dessert);
        fabDessert.setOnClickListener(this);

    }

    public void screenMenuConey(){
        Intent menuConey = new Intent(this,ConeysMenu.class);
        startActivity(menuConey);
    }

    public void screenMenuWay(){
        Intent menuWay = new Intent(this,WaysMenu.class);
        startActivity(menuWay);
    }

    public void screenMenuBowl(){
        Intent menuBowl = new Intent(this,BowlsMenu.class);
        startActivity(menuBowl);
    }

    public void screenMenuBC(){
        Intent menuBC = new Intent(this,BurritosMenu.class);
        startActivity(menuBC);
    }

    public void screenMenuWraps(){
        Intent menuWraps = new Intent(this,WrapsMenu.class);
        startActivity(menuWraps);
    }

    public void screenMenusalad(){
        Intent menuSalad = new Intent(this,SaladMenu.class);
        startActivity(menuSalad);
    }

    public void screenMenupotatoes(){
        Intent menupotatoes = new Intent(this,PotatoMenu.class);
        startActivity(menupotatoes);
    }

    public void screenMenukids(){
        Intent menukids = new Intent(this,KidsMenu.class);
        startActivity(menukids);
    }

    public void screenMenuDessert(){
        Intent menudessert = new Intent(this,DessertMenu.class);
        startActivity(menudessert);
    }


    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.fab_coney:
                screenMenuConey();
                break;

            case R.id.fab_ways:
            screenMenuWay();
            break;

            case R.id.fab_bowl:
                screenMenuBowl();
                break;

            case R.id.fab_BC:
                screenMenuBC();
                break;

            case R.id.fab_wraps:
                screenMenuWraps();
                break;

            case R.id.fab_Salads:
                screenMenusalad();
                break;

            case R.id.fab_Potatoes:
                screenMenupotatoes();
                break;

            case R.id.fab_kids:
                screenMenukids();
                break;

            case R.id.fab_Dessert:
                screenMenuDessert();
                break;

        }
    }
}