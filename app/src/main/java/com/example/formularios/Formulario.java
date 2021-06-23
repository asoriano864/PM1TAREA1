package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        EditText txtNombres = (EditText) findViewById(R.id.txtNombre);
        EditText txtApellidos = (EditText) findViewById(R.id.txtApellidos);
        EditText txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        EditText intEdad = (EditText) findViewById(R.id.intEdad);

        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Nombres = txtNombres.getText().toString();
                String Apellidos = txtApellidos.getText().toString();
                String Correo = txtCorreo.getText().toString();
                String Edad = intEdad.getText().toString();

                Intent PantallaRespuesta = new Intent(v.getContext(), RespuestaFormulario.class);
                PantallaRespuesta.putExtra("NOMBRES",Nombres);
                PantallaRespuesta.putExtra("APELLIDOS",Apellidos);
                PantallaRespuesta.putExtra("CORREO",Correo);
                PantallaRespuesta.putExtra("EDAD",Edad);
                startActivity(PantallaRespuesta);
            }
        });
    }



}