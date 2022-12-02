package com.example.appdidactica;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class Clasa4Activity extends AppCompatActivity {
    TextView text1;
    Button btnClasa4LBR;
    Button btnClasa4MATE;
    Button btnClasa4ENG;

    Button btnClasa4MM;
    Button btnClasa4SOC;
    Button btnClasa4GEO;
    Button btnClasa4IST;


    Button buton; //inapoi

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasa4);
        buton = (Button) findViewById(R.id.button1);
        btnClasa4LBR = (Button) findViewById(R.id.btnClasa4LBR);
        btnClasa4MATE = (Button) findViewById(R.id.btnClasa4MATE);
        btnClasa4ENG = (Button) findViewById(R.id.btnClasa4ENGLEZĂ);
        btnClasa4MM = (Button) findViewById(R.id.btnClasa4MM);
        btnClasa4SOC = (Button) findViewById(R.id.btnClasa4SOC);
        btnClasa4GEO = (Button) findViewById(R.id.btnClasa4GEO);
        btnClasa4IST = (Button) findViewById(R.id.btnClasa4IST);
        text1 = (TextView) findViewById(R.id.text1);



        buton.setOnClickListener(v -> {
            finish(); //termina activitatea curenta
        });
    }

}
