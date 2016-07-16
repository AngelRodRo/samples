package com.example.practica_5_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Estacionamiento extends AppCompatActivity {
    EditText edtHora,edtMinuto,edtResultado;
    Button btnCalcular;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estacionamiento);

        edtHora =(EditText) findViewById(R.id.edtHora);
        edtMinuto = (EditText) findViewById(R.id.edtMinutos);
        edtResultado = (EditText) findViewById(R.id.edtResultado);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);

        spinner = (Spinner) findViewById(R.id.days_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dia;
                double total=0;
                dia = spinner.getSelectedItem().toString();
                if(dia=="Lunes"||dia=="Martes"||dia=="Miercoles"){
                    total += Integer.valueOf(edtHora.getText().toString()) * 2;
                    total += Integer.valueOf(edtMinuto.getText().toString())>5? 2:0;
                }else if(dia=="Jueves"||dia=="Viernes"){
                    total   += Integer.valueOf(edtHora.getText().toString()) * 2.5;
                    total += Integer.valueOf(edtMinuto.getText().toString())>5? 2.5:0;
                }else if(dia=="Sabado"||dia=="Domingo"){
                    total   += Integer.valueOf(edtHora.getText().toString()) * 3;
                    total += Integer.valueOf(edtMinuto.getText().toString())>5? 3:0;
                }
                edtResultado.setText(String.valueOf(total));
            }
        });


    }
}
