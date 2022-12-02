package com.example.appdidactica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Clasa1Activity extends AppCompatActivity {
    TextView text1;
    Button btnClasa1CLR;
    Button btnClasa1MEM;
    Button btnClasa1ENG;
    Button btnClasa1MM;
    Button btnClasa1DP;


    Button buton; //inapoi

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasa1);
        buton = (Button) findViewById(R.id.button1);
        btnClasa1CLR = (Button) findViewById(R.id.btnClasa1CLR);
        btnClasa1MEM = (Button) findViewById(R.id.btnClasa1MEM);
        btnClasa1ENG = (Button) findViewById(R.id.btnClasa1ENGLEZĂ);
        btnClasa1MM = (Button) findViewById(R.id.btnClasa1MM);
        btnClasa1DP = (Button) findViewById(R.id.btnClasa1DP);
        text1 = (TextView) findViewById(R.id.text1);



        buton.setOnClickListener(v -> {
            finish(); //termina activitatea curenta
        });
    }

}
