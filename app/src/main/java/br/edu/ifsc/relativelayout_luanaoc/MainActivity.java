package br.edu.ifsc.relativelayout_luanaoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculaImc(View view){
        EditText edPeso = findViewById(R.id.edPeso);
        EditText edAltura = findViewById(R.id.edAltura);
        TextView lbIMC = findViewById(R.id.lbIMCResult);

        Double peso = Double.parseDouble(edPeso.getText().toString());
        Double altura = Double.parseDouble(edAltura.getText().toString());

        Double imc = peso / (altura  * altura);

        lbIMC.setText(Double.toString(imc));
    }

    public void abrirCreditos(View view){
        Intent i = new Intent(MainActivity.this, creditosActivity.class);
        startActivity(i);
    }
}
