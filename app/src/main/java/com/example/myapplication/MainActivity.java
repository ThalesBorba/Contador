package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView valor = findViewById(R.id.valor);
        Button menos = findViewById(R.id.menos);
        Button mais = findViewById(R.id.mais);

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(contador > 0) {
                    contador--;
                    valor.setText("" + contador);
                } else {
                    Toast.makeText(getApplicationContext(), "Número não pode ser negativo",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                valor.setText("" + contador);
            }
        });

        valor.setText("" + contador);
    }
}