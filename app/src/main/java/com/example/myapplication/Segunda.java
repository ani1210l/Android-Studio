package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Segunda extends AppCompatActivity {

    TextView textomostrado;
    TextView textomostrado1;
    TextView textomostrado2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Intent intent = getIntent();
        textomostrado = findViewById(R.id.txtmostrado);
        textomostrado1 = findViewById(R.id.txtmostrado2);
        textomostrado2 = findViewById(R.id.txtmostrado3);
        String textoing = intent.getStringExtra("Texto_Ingresado");
        String textoing1 = intent.getStringExtra("Texto_Ingresado1");
        String textoing2 = intent.getStringExtra("Texto_Ingresado2");
        textomostrado.setText(textoing);
        textomostrado1.setText(textoing1);
        textomostrado2.setText(textoing2);

    }
}