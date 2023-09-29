package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String respu;
    private EditText peso, altura;
    private double result;
    private Button calcular;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);
        calcular = findViewById(R.id.calcular);
        calcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double pesoValue = Integer.parseInt(peso.getText().toString());
                double alturaValue = Integer.parseInt(altura.getText().toString());
                result = pesoValue / (alturaValue * alturaValue);

                if(result < 18.5){
                    respu = "Bajo de peso: " + result;
                } else if (result < 24.9) {
                    respu = "Normal: " + result;
                }else if (result < 29.9) {
                    respu = "Sobre peso: " + result;
                }else if (result < 40) {
                    respu = "Obesidad: " + result;
                }else{
                    respu = "Obesidad extrema: " + result;
                }

                Bundle enviar = new Bundle();
                enviar.putString("respu", respu);

                intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtras(enviar);
                startActivity(intent);
            }

        });
    }

}