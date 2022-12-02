package com.example.appdidactica;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;


public class Clasa0Activity extends AppCompatActivity {
    TextView text1;
    Button btnClasa0CLR;
    Button btnClasa0MEM;
    Button btnClasa0ENG;
    Button btnClasa0MM;
    Button btnClasa0DP;


    Button buton; //inapoi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasa0);
        buton = (Button) findViewById(R.id.button1);
        btnClasa0CLR = (Button) findViewById(R.id.btnClasa0CLR);
        btnClasa0MEM = (Button) findViewById(R.id.btnClasa0MEM);
        btnClasa0ENG = (Button) findViewById(R.id.btnClasa0ENGLEZĂ);
        btnClasa0MM = (Button) findViewById(R.id.btnClasa0MM);
        btnClasa0DP = (Button) findViewById(R.id.btnClasa0DP);
        text1 = (TextView) findViewById(R.id.text1);

        buton.setOnClickListener(v -> {
            finish(); //termina activitatea curenta
        });
    }

}
