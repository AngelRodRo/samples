package com.example.practica_5_ejercicios;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtA,edtB,edtC,edtX1,edtX2;
    Button btnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtA = (EditText) findViewById(R.id.edtA);
        edtB = (EditText) findViewById(R.id.edtB);
        edtC = (EditText) findViewById(R.id.edtC);

        edtX1 = (EditText) findViewById(R.id.edtX1);
        edtX2 = (EditText) findViewById(R.id.edtX2);

        btnCalcular = (Button) findViewById(R.id.btnCalc);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a,b,c;
                double x1=0,x2=0;
                a = Integer.valueOf(edtA.getText().toString());
                b = Integer.valueOf(edtB.getText().toString());
                c = Integer.valueOf(edtC.getText().toString());
                double dis = Math.pow(b,2)-4*a*c;

                if(dis>0){
                    x1 = -b+Math.sqrt(dis)/2*a;
                    x2 = -b-Math.sqrt(dis)/2*a;
                }else if (dis==0){
                    x1 = -b+Math.sqrt(dis)/2*a;
                    x2 = x1;
                }else {
                    Toast.makeText(MainActivity.this,"Se tiene raices imaginarias",Toast.LENGTH_LONG).show();
                }

                edtX1.setText(x1+"");
                edtX2.setText(x2+"");

            }
        });

    }
}
