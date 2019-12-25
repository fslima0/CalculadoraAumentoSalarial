package com.example.calculadoraaumentosalarial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText salarioInicial;
    private RadioGroup radioPercentualGrupo;
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }

    public void addListenerOnButton() {

        radioPercentualGrupo = (RadioGroup) findViewById(R.id.radioPercentual);
        botao = (Button) findViewById(R.id.b1);
        salarioInicial = findViewById(R.id.num);

        botao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioPercentualGrupo.getCheckedRadioButtonId();

                double salario = Double.parseDouble(salarioInicial.getText().toString());
                double resultado = 0;

                switch (selectedId) {
                    case R.id.r1:
                        resultado = salario * 1.40;
                        break;
                    case R.id.r2:
                        resultado = salario * 1.45;
                        break;
                    case R.id.r3:
                        resultado = salario * 1.50;
                }

                Toast.makeText(getApplicationContext(),
                        "" + resultado, Toast.LENGTH_SHORT).show();

            }

        });

    }

}
