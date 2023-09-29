package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView mostrar;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            mostrar = findViewById(R.id.mostrar);

            Bundle recibe = getIntent().getExtras();
            String res = recibe.getString("resup");
            mostrar.setText(res);
        }
}
