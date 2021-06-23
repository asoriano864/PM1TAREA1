package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOperaciones = (Button) findViewById(R.id.btnOperaciones);
        btnOperaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PantallaOperaciones = new Intent(v.getContext(), Operadores.class);
                v.getContext().startActivity(PantallaOperaciones);
            }
        });

        Button btnFormulario = (Button) findViewById(R.id.btnFormulario);
        btnFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PantallaFormulario = new Intent(v.getContext(), Formulario.class);
                v.getContext().startActivity(PantallaFormulario);
            }
        });

    }
}