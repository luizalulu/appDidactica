package com.example.appdidactica;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class Clasa3Activity extends AppCompatActivity {
    TextView text1;
    Button btnClasa3LBR;
    Button btnClasa3MATE;
    Button btnClasa3ENG;

    Button btnClasa3MM;
    Button btnClasa3SOC;


    Button buton; //inapoi

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasa3);
        buton = (Button) findViewById(R.id.button1);
        btnClasa3LBR = (Button) findViewById(R.id.btnClasa3LBR);
        btnClasa3MATE = (Button) findViewById(R.id.btnClasa3MATE);
        btnClasa3ENG = (Button) findViewById(R.id.btnClasa3ENGLEZĂ);
        btnClasa3MM = (Button) findViewById(R.id.btnClasa3MM);
        btnClasa3SOC = (Button) findViewById(R.id.btnClasa3SOC);
        text1 = (TextView) findViewById(R.id.text1);



        buton.setOnClickListener(v -> {
            finish(); //termina activitatea curenta
        });
    }

}
