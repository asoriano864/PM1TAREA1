package com.example.formularios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Operadores extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operadores);

        EditText numero1 = (EditText) findViewById(R.id.Numero1);
        EditText numero2 = (EditText) findViewById(R.id.Numero2);


        Button btnSumar = (Button) findViewById(R.id.btnSumar);
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Numero1 = Integer.parseInt(numero1.getText().toString());
                int Numero2 = Integer.parseInt(numero2.getText().toString());

                int result = sumar(Numero1,Numero2);
                String Resultado = Integer.toString(result);

                Intent intent = new Intent(v.getContext(),PantallaResultado.class);
                intent.putExtra("RESULTADO",Resultado);
                startActivity(intent);

            }
        });
        Button btnRestar = (Button) findViewById(R.id.btnRestar);
        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Numero1 = Integer.parseInt(numero1.getText().toString());
                int Numero2 = Integer.parseInt(numero2.getText().toString());

                int result = restar(Numero1,Numero2);
                String Resultado = Integer.toString(result);

                Intent intent = new Intent(v.getContext(),PantallaResultado.class);
                intent.putExtra("RESULTADO",Resultado);
                startActivity(intent);
            }
        });
        Button btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Numero1 = Integer.parseInt(numero1.getText().toString());
                int Numero2 = Integer.parseInt(numero2.getText().toString());

                int result = multiplicar(Numero1,Numero2);
                String Resultado = Integer.toString(result);

                Intent intent = new Intent(v.getContext(),PantallaResultado.class);
                intent.putExtra("RESULTADO",Resultado);
                startActivity(intent);
            }
        });
        Button btnDividir = (Button) findViewById(R.id.btnDividir);
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Numero1 = Integer.parseInt(numero1.getText().toString());
                int Numero2 = Integer.parseInt(numero2.getText().toString());

                float result = dividir(Numero1,Numero2);
                String Resultado = Float.toString(result);

                Intent intent = new Intent(v.getContext(),PantallaResultado.class);
                intent.putExtra("RESULTADO",Resultado);
                startActivity(intent);
            }
        });

    }

    protected int sumar(int n1, int n2){
        return n1+n2;
    }

    protected int restar(int n1, int n2){
        return n1-n2;
    }

    protected int multiplicar(int n1, int n2){
        return n1*n2;
    }

    protected float dividir(int n1, int n2){
        float result = 0;
        if(n2>=n1){
            result = n1/n2;
        }
        return result;
    }


}