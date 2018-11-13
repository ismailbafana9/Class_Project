package com.example.android.attempt1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class spareparts extends AppCompatActivity {

    DatabaseHelper3 myDB;
    Button btnAdd3,btnView3;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spareparts);
        editText = (EditText) findViewById(R.id.editText);
        btnAdd3 = (Button) findViewById(R.id.btnAdd3);
        btnView3 = (Button) findViewById(R.id.btnView3);
        myDB = new DatabaseHelper3(this);

        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newEntry = editText.getText().toString();
                if(editText.length()!= 0){
                    AddData(newEntry);
                    editText.setText("");
                }else{
                    Toast.makeText(spareparts.this, "You must put something in the text field!", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(spareparts.this, ViewListContents2.class);
                startActivity(intent);
            }
        });


    }

    public void AddData(String newEntry) {

        boolean insertData = myDB.addData(newEntry);

        if(insertData==true){
            Toast.makeText(this, "Data Successfully Inserted!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Something went wrong :(.", Toast.LENGTH_LONG).show();
        }
    }
}
