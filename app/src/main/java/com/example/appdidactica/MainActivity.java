package com.example.appdidactica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button login ;
    EditText user ;
    EditText password ;
    int i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        password = (EditText) findViewById(R.id.editText2);
        user = (EditText) findViewById(R.id.editText);
        login = (Button) findViewById(R.id.button);
        i=0;

        login.setOnClickListener(v -> {

            if (user.getText().toString().equals("admin") &&
                    password.getText().toString().equals("admin")){
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(in);
            }

            else {
                i++;
                if(i<3) Toast.makeText(getBaseContext(), "Login Failed !",
                        Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getBaseContext(), i+" x Login Failed !",
                            Toast.LENGTH_SHORT).show();

            }
        });
    }
}