package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textoedit;
    EditText textoedit1;
    EditText textoedit2;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoedit = findViewById(R.id.textoingresado);
        textoedit1 = findViewById(R.id.txtingresado2);
        textoedit2 = findViewById(R.id.txtingresado3);
        boton = findViewById(R.id.boton);

boton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String texto = textoedit.getText().toString();
        String texto1 = textoedit1.getText().toString();
        String texto2 = textoedit2.getText().toString();
        Intent intent = new Intent(MainActivity.this,Segunda.class);
        intent.putExtra("Texto_Ingresado",texto);
        intent.putExtra("Texto_Ingresado1",texto1);
        intent.putExtra("Texto_Ingresado2",texto2);
        startActivity(intent);
        finish();
    }
});


    }

}