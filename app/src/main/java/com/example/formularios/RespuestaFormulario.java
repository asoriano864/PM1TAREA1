package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class RespuestaFormulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta_formulario);

        String Nombres = getIntent().getStringExtra("NOMBRES");
        String Apellidos = getIntent().getStringExtra("APELLIDOS");
        String Correos = getIntent().getStringExtra("CORREO");
        String Edad = getIntent().getStringExtra("EDAD");

        TextView NombresR = (TextView) findViewById(R.id.txtNombresR);
        TextView ApellidosR = (TextView) findViewById(R.id.txtApellidosR);
        TextView CorreoR = (TextView) findViewById(R.id.txtCorreoR);
        TextView EdadR = (TextView) findViewById(R.id.txtEdadR);

        NombresR.setText("Nombres: "+Nombres);
        ApellidosR.setText("Apellidos: "+ Apellidos);
        CorreoR.setText("Correo: "+Correos);
        EdadR.setText("Edad: "+Edad);



    }
}