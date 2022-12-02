package com.example.appdidactica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    TextView text1;
    Button btnClasa0;
    Button btnClasa1;
    Button btnClasa2;
    Button btnClasa3;
    Button btnClasa4;

    Button buton; //inapoi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        buton = (Button) findViewById(R.id.button1);
        btnClasa0 = (Button) findViewById(R.id.btnClasa0);
        btnClasa1 = (Button) findViewById(R.id.btnClasa1);
        btnClasa2 = (Button) findViewById(R.id.btnClasa2);
        btnClasa3 = (Button) findViewById(R.id.btnClasa3);
        btnClasa4 = (Button) findViewById(R.id.btnClasa4);
        text1 = (TextView) findViewById(R.id.text1);

        buton.setOnClickListener(v -> {
            finish(); //termina activitatea curenta
        });
    }

    public void ApasaPeClasa0(View view) {
        Intent in = new Intent(SecondActivity.this, Clasa0Activity.class);
        startActivity(in);
    }

    public void ApasaPeClasa1(View view) {
        Intent in = new Intent(SecondActivity.this, Clasa1Activity.class);
        startActivity(in);
    }

    public void ApasaPeClasa2(View view) {
        Intent in = new Intent(SecondActivity.this, Clasa2Activity.class);
        startActivity(in);
    }

    public void ApasaPeClasa3(View view) {
        Intent in = new Intent(SecondActivity.this, Clasa3Activity.class);
        startActivity(in);
    }

    public void ApasaPeClasa4(View view) {
        Intent in = new Intent(SecondActivity.this, Clasa4Activity.class);
        startActivity(in);
    }
}
