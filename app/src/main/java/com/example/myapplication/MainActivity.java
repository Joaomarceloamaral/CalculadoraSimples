package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText InputPrimeiroNumero;
    private EditText InputSegundoNumero;
    private TextView ViewResultadoFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        InputPrimeiroNumero = findViewById(R.id.InputPrimeiroNumero);
        InputSegundoNumero = findViewById(R.id.InputSegundoNumero);
        ViewResultadoFinal = findViewById(R.id.ViewResultadoFinal);

        // Find the button and set the click listener explicitly
        Button ButtonSomar = findViewById(R.id.buttonSomar);
        ButtonSomar.setOnClickListener(this::somar);

        Button ButtonSubtrair = findViewById(R.id.buttonSubtrair);
        ButtonSubtrair.setOnClickListener(this::subtrair);

        Button ButtonMultiplicar = findViewById(R.id.buttonMultiplicar);
        ButtonMultiplicar.setOnClickListener(this::multiplicar);

        Button ButtonDividir = findViewById(R.id.buttonDividir);
        ButtonDividir.setOnClickListener(this::dividir);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void somar(View view) {
        int valor1 = Integer.parseInt(InputPrimeiroNumero.getText().toString());
        int valor2 = Integer.parseInt(InputSegundoNumero.getText().toString());

        ViewResultadoFinal.setText(String.valueOf(valor1 + valor2));

    }

    public void subtrair(View view) {
        int valor1 = Integer.parseInt(InputPrimeiroNumero.getText().toString());
        int valor2 = Integer.parseInt(InputSegundoNumero.getText().toString());

        ViewResultadoFinal.setText(String.valueOf(valor1 - valor2));

    }

    public void multiplicar(View view) {
        int valor1 = Integer.parseInt(InputPrimeiroNumero.getText().toString());
        int valor2 = Integer.parseInt(InputSegundoNumero.getText().toString());

        ViewResultadoFinal.setText(String.valueOf(valor1 * valor2));

    }

    public void dividir(View view) {
        int valor1 = Integer.parseInt(InputPrimeiroNumero.getText().toString());
        int valor2 = Integer.parseInt(InputSegundoNumero.getText().toString());

        ViewResultadoFinal.setText(String.valueOf(valor1 / valor2));

    }

}