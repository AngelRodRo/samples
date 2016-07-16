package com.example.practica_5_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Arrays;

public class HoraActivity extends AppCompatActivity {
    EditText edtHoras,edtMinutos,edtSegundos,edtTiempo;
    Button btnCalcular;

    int[] horasM = {
      13,14,15,16,17,18,19,20,21,22,23
    };
    int[] horasN = {
      1,2,3,4,5,6,7,8,9,10,11
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);

        edtHoras = (EditText) findViewById(R.id.edtHoras);
        edtMinutos = (EditText) findViewById(R.id.edtMinutos);
        edtSegundos = (EditText) findViewById(R.id.edtSegundos);
        edtTiempo = (EditText) findViewById(R.id.edtTiempoCompleto);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int horas = Integer.valueOf(edtHoras.getText().toString());
                int horaN = 0;
                String tiempo;
                if(horas>=13){
                    horaN = horasN[Arrays.asList(horasM).indexOf(horas)];
                    tiempo = "PM";
                }else tiempo = "AM";

                String tiempoCompleto = "";
                tiempoCompleto = horaN + ":" + edtMinutos.getText().toString() + ":" + edtSegundos.getText().toString() + " " + tiempo;

                edtTiempo.setText(tiempoCompleto);

            }
        });


    }
}
