package com.samuel.mediadenotas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.samuel.mediadenotas.R;

public class MainActivity extends AppCompatActivity {

    EditText edit_nota1_portugues;
    EditText edit_nota2_portugues;
    EditText edit_nota3_portugues;
    EditText edit_nota4_portugues;

    Button bt_calcular;
    TextView text_resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciandoPortugues();

        bt_calcular();
    }



    private void bt_calcular() {
        bt_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double nota1 = Double.parseDouble(edit_nota1_portugues.getText().toString());
                double nota2 = Double.parseDouble(edit_nota2_portugues.getText().toString());
                double nota3 = Double.parseDouble(edit_nota3_portugues.getText().toString());
                double nota4 = Double.parseDouble(edit_nota4_portugues.getText().toString());

                double media = CalcularMedia(nota1, nota2, nota3, nota4);

                if (media >= 6){
                    text_resultado.setText("" + media + " Aluno Aprovado");
                }
                else {
                    text_resultado.setText("" + media + " Aluno Reprovado");
                }
            }
        });
    }

    private double CalcularMedia(double nota1, double nota2, double nota3, double nota4) {
        double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
        return mediaFinal;
    }

    private void iniciandoPortugues() {
        edit_nota1_portugues = findViewById(R.id.edit_nota1_portugues);
        edit_nota2_portugues = findViewById(R.id.edit_nota2_portugues);
        edit_nota3_portugues = findViewById(R.id.edit_nota3_portugues);
        edit_nota4_portugues = findViewById(R.id.edit_nota4_portugues);
        bt_calcular = findViewById(R.id.bt_calcular);
        text_resultado = findViewById(R.id.text_resultado);
    }
}