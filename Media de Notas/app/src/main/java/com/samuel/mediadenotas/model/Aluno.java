package com.samuel.mediadenotas.model;

public class Aluno {

    private String nome;
    private String resultado;

    private String disciplina;
    private double media;
    private String edit_nota1;
    private String edit_nota2;
    private String edit_nota3;
    private String edit_nota4;

    public Aluno() {
    }

    public Aluno(String nome, String resultado, String disciplina, double media, String edit_nota1, String edit_nota2, String edit_nota3, String edit_nota4) {
        this.nome = nome;
        this.resultado = resultado;
        this.disciplina = disciplina;
        this.media = media;
        this.edit_nota1 = edit_nota1;
        this.edit_nota2 = edit_nota2;
        this.edit_nota3 = edit_nota3;
        this.edit_nota4 = edit_nota4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getEdit_nota1() {
        return edit_nota1;
    }

    public void setEdit_nota1(String edit_nota1) {
        this.edit_nota1 = edit_nota1;
    }

    public String getEdit_nota2() {
        return edit_nota2;
    }

    public void setEdit_nota2(String edit_nota2) {
        this.edit_nota2 = edit_nota2;
    }

    public String getEdit_nota3() {
        return edit_nota3;
    }

    public void setEdit_nota3(String edit_nota3) {
        this.edit_nota3 = edit_nota3;
    }

    public String getEdit_nota4() {
        return edit_nota4;
    }

    public void setEdit_nota4(String edit_nota4) {
        this.edit_nota4 = edit_nota4;
    }
}
