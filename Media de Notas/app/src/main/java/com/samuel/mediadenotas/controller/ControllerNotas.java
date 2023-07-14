package com.samuel.mediadenotas.controller;

import com.samuel.mediadenotas.model.Aluno;
import com.samuel.mediadenotas.view.MainActivity;

public class ControllerNotas {

    Aluno aluno;

    public ControllerNotas(MainActivity mainActivity) {

    }

    public String calculo(Aluno aluno) {

        double nota1 = Double.parseDouble(aluno.getEdit_nota1());
        double nota2 = Double.parseDouble(aluno.getEdit_nota2());
        double nota3 = Double.parseDouble(aluno.getEdit_nota3());
        double nota4 = Double.parseDouble(aluno.getEdit_nota4());

        double media = CalcularMedia(nota1, nota2, nota3, nota4);
        String resultado = null;
        String disciplina = aluno.getDisciplina();

        aluno.setMedia(media);

        if (media >= 60) {
            resultado = (disciplina + media + " Aluno Aprovado");
            aluno.setResultado(resultado);
        } else if (media < 60) {
            resultado = (disciplina + media + " Aluno Reprovado");
            aluno.setResultado(resultado);
        }
        return resultado;
    }

    private double CalcularMedia(double nota1, double nota2, double nota3, double nota4) {
        aluno = new Aluno();
        aluno.setMedia((nota1 + nota2 + nota3 + nota4) / 4);

        return aluno.getMedia();
    }
}
