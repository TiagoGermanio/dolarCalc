package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText valorDolar, quantidadeUs;
    TextView resultadoValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorDolar = findViewById(R.id.valorDolar);
        quantidadeUs = findViewById(R.id.quantidadeUs);

        resultadoValor = findViewById(R.id.resultadoValor);
    }

    public void caulcular (View view){

        double  quantDolar      = Double.parseDouble(quantidadeUs.getText().toString());
        double  valorDolarEdt   = Double.parseDouble(valorDolar.getText().toString());

        double  totalReias      = quantDolar * valorDolarEdt;

        resultadoValor.setText("R$: " + totalReias);

    }



}