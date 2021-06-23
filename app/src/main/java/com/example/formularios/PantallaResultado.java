package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PantallaResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_resultado);

        TextView txtResultado = (TextView) findViewById(R.id.txtResultado);
        txtResultado.setText(getIntent().getStringExtra("RESULTADO"));


    }
}