package com.samuel.mediadenotas.controller;

import com.samuel.mediadenotas.model.Portugues;
import com.samuel.mediadenotas.view.MainActivity;

public class ControllerNotas {

    Portugues portugues;

    public ControllerNotas(MainActivity mainActivity){

    }
    
    public String calculoPortugues(Portugues portugues){

        double nota1 = Double.parseDouble(portugues.getEdit_nota1_portugues());
        double nota2 = Double.parseDouble(portugues.getEdit_nota2_portugues());
        double nota3 = Double.parseDouble(portugues.getEdit_nota3_portugues());
        double nota4 = Double.parseDouble(portugues.getEdit_nota4_portugues());

        double mediaPortugues = CalcularMedia(nota1, nota2, nota3, nota4);
        String resultado = null;

        if (mediaPortugues >= 6) {
            resultado = ("Portugues " + mediaPortugues + " Aluno Aprovado");
        } else if (mediaPortugues < 6) {
            resultado = ("Portugues " + mediaPortugues + " Aluno Reprovado");
        }
        return resultado;

    }

    private double CalcularMedia(double nota1, double nota2, double nota3, double nota4) {
        portugues = new Portugues();
        portugues.setMediaPortugues((nota1 + nota2 + nota3 + nota4) / 4);

        return portugues.getMediaPortugues();
    }


}
