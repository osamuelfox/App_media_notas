package com.samuel.mediadenotas.controller;

import android.content.ContentValues;
import android.util.Log;

import androidx.annotation.NonNull;

import com.samuel.mediadenotas.database.Notas_DB;
import com.samuel.mediadenotas.model.Aluno;
import com.samuel.mediadenotas.view.MainActivity;

public class NotasController extends Notas_DB {

    public  NotasController(MainActivity activity){
        super(activity);
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller iniciada");
        return super.toString();
    }

    public void salvar(Aluno aluno){
        Log.d("MVC_Controller", "Salvo");

        ContentValues dados = new ContentValues();
        dados.put("nome", aluno.getNome());
        dados.put("disciplina",aluno.getDisciplina());
        dados.put(" B1",aluno.getEdit_nota1());
        dados.put(" B2",aluno.getEdit_nota2());
        dados.put(" B3",aluno.getEdit_nota3());
        dados.put(" B4",aluno.getEdit_nota4());
        dados.put(" media ",aluno.getMedia());
        dados.put(" Resultado ",aluno.getResultado());

        salvarDados("Notas",dados);

    }
}
