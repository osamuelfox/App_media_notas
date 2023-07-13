package com.samuel.mediadenotas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.samuel.mediadenotas.R;
import com.samuel.mediadenotas.controller.ControllerNotas;
import com.samuel.mediadenotas.model.Portugues;

public class MainActivity extends AppCompatActivity {

    EditText edit_nota1_portugues, edit_nota2_portugues, edit_nota3_portugues, edit_nota4_portugues;

//    EditText edit_nota1_matematica, edit_nota2_matematica, edit_nota3_matematica, edit_nota4_matematica;
//
//    EditText edit_nota1_geografia, edit_nota2_geografia, edit_nota3_geografia, edit_nota4_geografia;
//
//    EditText edit_nota1_historia, edit_nota2_historia, edit_nota3_historia, edit_nota4_historia;
//
//    EditText edit_nota1_fisica, edit_nota2_fisica, edit_nota3_fisica, edit_nota4_fisica;

    Button bt_calcular;
    TextView text_resultado;
    ControllerNotas controllerNotas;
    Portugues portugues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_calcular = findViewById(R.id.bt_calcular);
        text_resultado = findViewById(R.id.text_resultado);

        controllerNotas = new ControllerNotas(MainActivity.this);
        controllerNotas.toString();

        portugues = new Portugues();

        iniciandoPortugues();
//        iniciandoMatematica();
//        iniciandoGeografia();
//        iniciandoHistoria();
//        iniciandoFisica();

        bt_calcular();
    }

    private void bt_calcular() {
        bt_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                port();
            }
        });
    }


    private void port() {
        double nota1 = Double.parseDouble(edit_nota1_portugues.getText().toString());
        double nota2 = Double.parseDouble(edit_nota2_portugues.getText().toString());
        double nota3 = Double.parseDouble(edit_nota3_portugues.getText().toString());
        double nota4 = Double.parseDouble(edit_nota4_portugues.getText().toString());

        String result;

        portugues.setEdit_nota1_portugues(String.valueOf(nota1));
        portugues.setEdit_nota2_portugues(String.valueOf(nota2));
        portugues.setEdit_nota3_portugues(String.valueOf(nota3));
        portugues.setEdit_nota4_portugues(String.valueOf(nota4));
        portugues.getMediaPortugues();

        result = controllerNotas.calculoPortugues(portugues);
        text_resultado.setText(result);
    }

//    private double CalcularMedia(double nota1, double nota2, double nota3, double nota4) {
//        double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
//        return mediaFinal;
//    }

//    private String notasPortugues() {
//        double nota1 = Double.parseDouble(edit_nota1_portugues.getText().toString());
//        double nota2 = Double.parseDouble(edit_nota2_portugues.getText().toString());
//        double nota3 = Double.parseDouble(edit_nota3_portugues.getText().toString());
//        double nota4 = Double.parseDouble(edit_nota4_portugues.getText().toString());
//
//        double mediaPortugues = CalcularMedia(nota1, nota2, nota3, nota4);
//        String resultado = null;
//
//        if (mediaPortugues >= 6) {
//            resultado = ("Portugues " + mediaPortugues + " Aluno Aprovado");
//        } else if (mediaPortugues < 5) {
//            resultado = ("Portugues " + mediaPortugues + " Aluno Reprovado");
//        }
//        return resultado;
//    }

    private void iniciandoPortugues() {
        edit_nota1_portugues = findViewById(R.id.edit_nota1_portugues);
        edit_nota2_portugues = findViewById(R.id.edit_nota2_portugues);
        edit_nota3_portugues = findViewById(R.id.edit_nota3_portugues);
        edit_nota4_portugues = findViewById(R.id.edit_nota4_portugues);
    }

//    private String notasMatematica() {
//        double nota1 = Double.parseDouble(edit_nota1_matematica.getText().toString());
//        double nota2 = Double.parseDouble(edit_nota2_matematica.getText().toString());
//        double nota3 = Double.parseDouble(edit_nota3_matematica.getText().toString());
//        double nota4 = Double.parseDouble(edit_nota4_matematica.getText().toString());
//
//        double mediaMatematica = CalcularMedia(nota1, nota2, nota3, nota4);
//        String resultado = null;
//
//        if (mediaMatematica >= 6) {
//            resultado = ("Matemaica " + mediaMatematica + " Aluno Aprovado");
//        } else if (mediaMatematica < 5) {
//            resultado = ("Matematica " + mediaMatematica + " Aluno Reprovado");
//        }
//        return resultado;
//    }
//
//    private void iniciandoMatematica() {
//        edit_nota1_matematica = findViewById(R.id.edit_nota1_matematica);
//        edit_nota2_matematica = findViewById(R.id.edit_nota2_matematica);
//        edit_nota3_matematica = findViewById(R.id.edit_nota3_matematica);
//        edit_nota4_matematica = findViewById(R.id.edit_nota4_matematica);
//    }

//    private String notasGeografia() {
//        double nota1 = Double.parseDouble(edit_nota1_geografia.getText().toString());
//        double nota2 = Double.parseDouble(edit_nota2_geografia.getText().toString());
//        double nota3 = Double.parseDouble(edit_nota3_geografia.getText().toString());
//        double nota4 = Double.parseDouble(edit_nota4_geografia.getText().toString());
//
//        double mediaGeografia = CalcularMedia(nota1, nota2, nota3, nota4);
//        String resultado = null;
//
//        if (mediaGeografia >= 6) {
//            resultado = ("Geografia " + mediaGeografia + " Aluno Aprovado");
//        } else if (mediaGeografia < 5) {
//            resultado = ("Geografia " + mediaGeografia + " Aluno Reprovado");
//        }
//        return resultado;
//    }
//
//    private void iniciandoGeografia() {
//        edit_nota1_geografia = findViewById(R.id.edit_nota1_geografia);
//        edit_nota2_geografia = findViewById(R.id.edit_nota2_geografia);
//        edit_nota3_geografia = findViewById(R.id.edit_nota3_geografia);
//        edit_nota4_geografia = findViewById(R.id.edit_nota4_geografia);
//    }

//    private String notasHistoria() {
//        double nota1 = Double.parseDouble(edit_nota1_historia.getText().toString());
//        double nota2 = Double.parseDouble(edit_nota2_historia.getText().toString());
//        double nota3 = Double.parseDouble(edit_nota3_historia.getText().toString());
//        double nota4 = Double.parseDouble(edit_nota4_historia.getText().toString());
//
//        double mediaHistoria = CalcularMedia(nota1, nota2, nota3, nota4);
//        String resultado = null;
//
//        if (mediaHistoria >= 6) {
//            resultado = ("Historia " + mediaHistoria + " Aluno Aprovado");
//        } else if (mediaHistoria < 5) {
//            resultado = ("Historia " + mediaHistoria + " Aluno Reprovado");
//        }
//        return resultado;
//    }
//
//    private void iniciandoHistoria() {
//        edit_nota1_historia = findViewById(R.id.edit_nota1_historia);
//        edit_nota2_historia = findViewById(R.id.edit_nota2_historia);
//        edit_nota3_historia = findViewById(R.id.edit_nota3_historia);
//        edit_nota4_historia = findViewById(R.id.edit_nota4_historia);
//    }


//    private String notasFisica() {
//        double nota1 = Double.parseDouble(edit_nota1_fisica.getText().toString());
//        double nota2 = Double.parseDouble(edit_nota2_fisica.getText().toString());
//        double nota3 = Double.parseDouble(edit_nota3_fisica.getText().toString());
//        double nota4 = Double.parseDouble(edit_nota4_fisica.getText().toString());
//
//        double mediaFisica = CalcularMedia(nota1, nota2, nota3, nota4);
//        String resultado = null;
//
//        if (mediaFisica >= 6) {
//            resultado = ("Fisica " + mediaFisica + " Aluno Aprovado");
//        } else if (mediaFisica < 5) {
//            resultado = ("Fisica " + mediaFisica + " Aluno Reprovado");
//        }
//        return resultado;
//    }
//
//    private void iniciandoFisica() {
//        edit_nota1_fisica = findViewById(R.id.edit_nota1_fisica);
//        edit_nota2_fisica = findViewById(R.id.edit_nota2_fisica);
//        edit_nota3_fisica = findViewById(R.id.edit_nota3_fisica);
//        edit_nota4_fisica = findViewById(R.id.edit_nota4_fisica);
//    }
}