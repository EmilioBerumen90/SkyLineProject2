package com.example.skylineprojectmenu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {


    Button FabMenu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        FabMenu = findViewById(R.id.btn_menu);
        FabMenu.setOnClickListener(this);


    }

    public void screenMenu(){
        Intent menu = new Intent(this,MainActivity.class);
        startActivity(menu);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn_menu:
               screenMenu();
               break;



        }





    }
}