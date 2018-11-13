package com.example.android.attempt1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class homepage extends AppCompatActivity implements View.OnClickListener{
    private CardView profileCard, carCard, gasCard, sparepartsCard, serviceCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        //Card definitions

        profileCard = (CardView) findViewById(R.id.profile);
        carCard = (CardView) findViewById(R.id.car);
        gasCard = (CardView) findViewById(R.id.gas);
        sparepartsCard = (CardView) findViewById(R.id.spareparts);
        serviceCard = (CardView) findViewById(R.id.service);

        //Click listener
        profileCard.setOnClickListener(this);
        carCard.setOnClickListener(this);
        gasCard.setOnClickListener(this);
        sparepartsCard.setOnClickListener(this);
        serviceCard.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()){
            case R.id.profile : i = new Intent(this, profile.class);startActivity(i); break;
            case R.id.car : i = new Intent(this, car.class);startActivity(i); break;
            case R.id.gas : i = new Intent(this, gas.class);startActivity(i); break;
            case R.id.spareparts : i = new Intent(this, spareparts.class);startActivity(i); break;
            case R.id.service : i = new Intent(this, service.class);startActivity(i); break;
            default:break;
        }


    }
}
