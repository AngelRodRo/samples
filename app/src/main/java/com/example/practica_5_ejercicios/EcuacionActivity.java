package com.example.practica_5_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EcuacionActivity extends AppCompatActivity {

    EditText edtA,edtB,edtX;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuacion);

        edtA = (EditText) findViewById(R.id.edtA);
        edtB = (EditText) findViewById(R.id.edtB);
        edtX = (EditText) findViewById(R.id.edtX);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float a,b,c=0;
                a = Float.valueOf(edtA.getText().toString());
                b = Float.valueOf(edtB.getText().toString());
                if(a!=0){
                    c=-b/a;
                    edtX.setText(c+"");
                }

                if(a==0&&b!=0) {
                    Toast.makeText(EcuacionActivity.this, "Solucion Imposible", Toast.LENGTH_SHORT).show();
                }
                if(a==0&&b==0) {
                    Toast.makeText(EcuacionActivity.this, "Solucion indeterminada", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
