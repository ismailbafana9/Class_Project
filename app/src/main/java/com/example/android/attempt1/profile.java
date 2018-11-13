package com.example.android.attempt1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class profile extends AppCompatActivity{

    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        button1 = (Button) findViewById(R.id.btnAdd2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openActivity();
            }
        });
        button2 = (Button) findViewById(R.id.btnView2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }
    public void openActivity(){
        Intent intent = new Intent(profile.this, ViewListContents.class);
        startActivity(intent);
    }
    public void openActivity2(){
        Intent intent = new Intent(profile.this, ViewListContents2.class);
        startActivity(intent);
    }
}
