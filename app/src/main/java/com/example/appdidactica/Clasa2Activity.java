package com.example.appdidactica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class Clasa2Activity extends AppCompatActivity {
    TextView text1;
    Button btnClasa2CLR;
    Button btnClasa2MEM;
    Button btnClasa2ENG;
    Button btnClasa2MM;
    Button btnClasa2DP;


    Button buton; //inapoi


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasa2);
        buton = (Button) findViewById(R.id.button1);
        btnClasa2CLR = (Button) findViewById(R.id.btnClasa2CLR);
        btnClasa2MEM = (Button) findViewById(R.id.btnClasa2MEM);
        btnClasa2ENG = (Button) findViewById(R.id.btnClasa2ENGLEZĂ);
        btnClasa2MM = (Button) findViewById(R.id.btnClasa2MM);
        btnClasa2DP = (Button) findViewById(R.id.btnClasa2DP);
        text1 = (TextView) findViewById(R.id.text1);



        buton.setOnClickListener(v -> {
            finish(); //termina activitatea curenta
        });
    }

}
