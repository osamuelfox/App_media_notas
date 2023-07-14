package com.samuel.mediadenotas.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.samuel.mediadenotas.R;
import com.samuel.mediadenotas.controller.ControllerNotas;
import com.samuel.mediadenotas.controller.NotasController;
import com.samuel.mediadenotas.model.Aluno;

public class MainActivity extends AppCompatActivity {

    Aluno alunoPortugues;
    Aluno alunoMatematica;
    Aluno alunoGeografia;
    Aluno alunoHistoria;
    Aluno alunoFisica;

    EditText nomeAluno;

    String portugues = "Portugues ";
    String matematica = "Matematica ";
    String geografia = "Geografia ";
    String historia = "Historia ";
    String fisica = "Fisica ";

    EditText edit_nota1_portugues, edit_nota2_portugues, edit_nota3_portugues, edit_nota4_portugues;
    EditText edit_nota1_matematica, edit_nota2_matematica, edit_nota3_matematica, edit_nota4_matematica;
    EditText edit_nota1_geografia, edit_nota2_geografia, edit_nota3_geografia, edit_nota4_geografia;
    EditText edit_nota1_historia, edit_nota2_historia, edit_nota3_historia, edit_nota4_historia;
    EditText edit_nota1_fisica, edit_nota2_fisica, edit_nota3_fisica, edit_nota4_fisica;

    Button bt_calcular;
    Button bt_limpar;
    Button bt_salvar;

    TextView text_resultado;

    ControllerNotas controllerNotas;

    NotasController notasController;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_calcular = findViewById(R.id.bt_calcular);
        bt_salvar = findViewById(R.id.bt_salvar);
        bt_limpar = findViewById(R.id.bt_limpar);
        text_resultado = findViewById(R.id.text_resultado);

        notasController = new NotasController(MainActivity.this);

        controllerNotas = new ControllerNotas(MainActivity.this);
        controllerNotas.toString();

        alunoMatematica = new Aluno();
        alunoGeografia = new Aluno();
        alunoHistoria = new Aluno();
        alunoPortugues = new Aluno();
        alunoFisica = new Aluno();

        nomeAluno = findViewById(R.id.edit_nome);

        iniciandoPortugues();
        iniciandoMatematica();
        iniciandoGeografia();
        iniciandoHistoria();
        iniciandoFisica();

        bt_calcular();
        bt_salvar();
        bt_limpar();
    }

    private void bt_limpar() {

        bt_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nomeAluno.setText("");
                edit_nota1_matematica.setText("");
                edit_nota2_matematica.setText("");
                edit_nota3_matematica.setText("");
                edit_nota4_matematica.setText("");

                edit_nota1_portugues.setText("");
                edit_nota2_portugues.setText("");
                edit_nota3_portugues.setText("");
                edit_nota4_portugues.setText("");

                edit_nota1_historia.setText("");
                edit_nota2_historia.setText("");
                edit_nota3_historia.setText("");
                edit_nota4_historia.setText("");

                edit_nota1_fisica.setText("");
                edit_nota2_fisica.setText("");
                edit_nota3_fisica.setText("");
                edit_nota4_fisica.setText("");

                edit_nota1_geografia.setText("");
                edit_nota2_geografia.setText("");
                edit_nota3_geografia.setText("");
                edit_nota4_geografia.setText("");

                bt_salvar.setEnabled(false);

                Toast.makeText(MainActivity.this, " Limpo ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void bt_salvar() {
        bt_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                notasController.salvar(alunoMatematica);
                notasController.salvar(alunoPortugues);
                notasController.salvar(alunoFisica);
                notasController.salvar(alunoHistoria);
                notasController.salvar(alunoGeografia);

                Toast.makeText(MainActivity.this, " Salvo ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void bt_calcular() {
        bt_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado();
                bt_salvar.setEnabled(true);
            }
        });
    }

    private void resultado() {
        text_resultado.setText(mat() + " \n" + port() + " \n " + geo() + " \n" + hist() + " \n" + fisi());
    }

    private String port() {

        String nome = String.valueOf(nomeAluno.getText());

        double nota1 = Double.parseDouble(edit_nota1_portugues.getText().toString());
        double nota2 = Double.parseDouble(edit_nota2_portugues.getText().toString());
        double nota3 = Double.parseDouble(edit_nota3_portugues.getText().toString());
        double nota4 = Double.parseDouble(edit_nota4_portugues.getText().toString());

        String resultPortugues;

        alunoPortugues.setNome(nome);
        alunoPortugues.setDisciplina(portugues);
        alunoPortugues.setEdit_nota1(String.valueOf(nota1));
        alunoPortugues.setEdit_nota2(String.valueOf(nota2));
        alunoPortugues.setEdit_nota3(String.valueOf(nota3));
        alunoPortugues.setEdit_nota4(String.valueOf(nota4));

        resultPortugues = controllerNotas.calculo(alunoPortugues);

        return nome + " " + resultPortugues;
    }

    private void iniciandoPortugues() {
        edit_nota1_portugues = findViewById(R.id.edit_nota1_portugues);
        edit_nota2_portugues = findViewById(R.id.edit_nota2_portugues);
        edit_nota3_portugues = findViewById(R.id.edit_nota3_portugues);
        edit_nota4_portugues = findViewById(R.id.edit_nota4_portugues);
    }


    private String mat() {

        String nome = String.valueOf(nomeAluno.getText());

        double nota1 = Double.parseDouble(edit_nota1_matematica.getText().toString());
        double nota2 = Double.parseDouble(edit_nota2_matematica.getText().toString());
        double nota3 = Double.parseDouble(edit_nota3_matematica.getText().toString());
        double nota4 = Double.parseDouble(edit_nota4_matematica.getText().toString());

        String resultMatematica;

        alunoMatematica.setNome(nome);

        alunoMatematica.setDisciplina(matematica);
        alunoMatematica.setEdit_nota1(String.valueOf(nota1));
        alunoMatematica.setEdit_nota2(String.valueOf(nota2));
        alunoMatematica.setEdit_nota3(String.valueOf(nota3));
        alunoMatematica.setEdit_nota4(String.valueOf(nota4));

        resultMatematica = controllerNotas.calculo(alunoMatematica);

        return nome + " " + resultMatematica;
    }

    private void iniciandoMatematica() {
        edit_nota1_matematica = findViewById(R.id.edit_nota1_matematica);
        edit_nota2_matematica = findViewById(R.id.edit_nota2_matematica);
        edit_nota3_matematica = findViewById(R.id.edit_nota3_matematica);
        edit_nota4_matematica = findViewById(R.id.edit_nota4_matematica);
    }

    private String geo() {

        String nome = String.valueOf(nomeAluno.getText());

        double nota1 = Double.parseDouble(edit_nota1_geografia.getText().toString());
        double nota2 = Double.parseDouble(edit_nota2_geografia.getText().toString());
        double nota3 = Double.parseDouble(edit_nota3_geografia.getText().toString());
        double nota4 = Double.parseDouble(edit_nota4_geografia.getText().toString());

        String resultGeografia;

        alunoGeografia.setNome(nome);

        alunoGeografia.setDisciplina(geografia);
        alunoGeografia.setEdit_nota1(String.valueOf(nota1));
        alunoGeografia.setEdit_nota2(String.valueOf(nota2));
        alunoGeografia.setEdit_nota3(String.valueOf(nota3));
        alunoGeografia.setEdit_nota4(String.valueOf(nota4));

        resultGeografia = controllerNotas.calculo(alunoGeografia);

        return nome + " " + resultGeografia;
    }

    private void iniciandoGeografia() {
        edit_nota1_geografia = findViewById(R.id.edit_nota1_geografia);
        edit_nota2_geografia = findViewById(R.id.edit_nota2_geografia);
        edit_nota3_geografia = findViewById(R.id.edit_nota3_geografia);
        edit_nota4_geografia = findViewById(R.id.edit_nota4_geografia);
    }

    private String hist() {

        String nome = String.valueOf(nomeAluno.getText());

        double nota1 = Double.parseDouble(edit_nota1_historia.getText().toString());
        double nota2 = Double.parseDouble(edit_nota2_historia.getText().toString());
        double nota3 = Double.parseDouble(edit_nota3_historia.getText().toString());
        double nota4 = Double.parseDouble(edit_nota4_historia.getText().toString());

        String resultHistoria;

        alunoHistoria.setNome(nome);

        alunoHistoria.setDisciplina(historia);
        alunoHistoria.setEdit_nota1(String.valueOf(nota1));
        alunoHistoria.setEdit_nota2(String.valueOf(nota2));
        alunoHistoria.setEdit_nota3(String.valueOf(nota3));
        alunoHistoria.setEdit_nota4(String.valueOf(nota4));

        resultHistoria = controllerNotas.calculo(alunoHistoria);

        return nome + " " + resultHistoria;
    }


    private void iniciandoHistoria() {
        edit_nota1_historia = findViewById(R.id.edit_nota1_historia);
        edit_nota2_historia = findViewById(R.id.edit_nota2_historia);
        edit_nota3_historia = findViewById(R.id.edit_nota3_historia);
        edit_nota4_historia = findViewById(R.id.edit_nota4_historia);
    }

    private String fisi() {

        String nome = String.valueOf(nomeAluno.getText());

        double nota1 = Double.parseDouble(edit_nota1_fisica.getText().toString());
        double nota2 = Double.parseDouble(edit_nota2_fisica.getText().toString());
        double nota3 = Double.parseDouble(edit_nota3_fisica.getText().toString());
        double nota4 = Double.parseDouble(edit_nota4_fisica.getText().toString());

        String resultFisica;

        alunoFisica.setNome(nome);

        alunoFisica.setDisciplina(fisica);
        alunoFisica.setEdit_nota1(String.valueOf(nota1));
        alunoFisica.setEdit_nota2(String.valueOf(nota2));
        alunoFisica.setEdit_nota3(String.valueOf(nota3));
        alunoFisica.setEdit_nota4(String.valueOf(nota4));

        resultFisica = controllerNotas.calculo(alunoFisica);

        return nome + " " + resultFisica;
    }

    private void iniciandoFisica() {
        edit_nota1_fisica = findViewById(R.id.edit_nota1_fisica);
        edit_nota2_fisica = findViewById(R.id.edit_nota2_fisica);
        edit_nota3_fisica = findViewById(R.id.edit_nota3_fisica);
        edit_nota4_fisica = findViewById(R.id.edit_nota4_fisica);
    }
}