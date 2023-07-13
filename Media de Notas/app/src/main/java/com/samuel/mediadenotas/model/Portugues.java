package com.samuel.mediadenotas.model;

public class Portugues {

    public double mediaPortugues;
    private String edit_nota1_portugues;
    private String edit_nota2_portugues;
    private String edit_nota3_portugues;
    private String edit_nota4_portugues;


    public Portugues() {
    }

    public Portugues(String edit_nota1_portugues, String edit_nota2_portugues, String edit_nota3_portugues, String edit_nota4_portugues, Double mediaPortugues) {
        this.edit_nota1_portugues = edit_nota1_portugues;
        this.edit_nota2_portugues = edit_nota2_portugues;
        this.edit_nota3_portugues = edit_nota3_portugues;
        this.edit_nota4_portugues = edit_nota4_portugues;
        this.mediaPortugues = mediaPortugues;
    }

    public String getEdit_nota1_portugues() {
        return edit_nota1_portugues;
    }

    public void setEdit_nota1_portugues(String edit_nota1_portugues) {
        this.edit_nota1_portugues = edit_nota1_portugues;
    }

    public String getEdit_nota2_portugues() {
        return edit_nota2_portugues;
    }

    public void setEdit_nota2_portugues(String edit_nota2_portugues) {
        this.edit_nota2_portugues = edit_nota2_portugues;
    }

    public String getEdit_nota3_portugues() {
        return edit_nota3_portugues;
    }

    public void setEdit_nota3_portugues(String edit_nota3_portugues) {
        this.edit_nota3_portugues = edit_nota3_portugues;
    }

    public String getEdit_nota4_portugues() {
        return edit_nota4_portugues;
    }

    public void setEdit_nota4_portugues(String edit_nota4_portugues) {
        this.edit_nota4_portugues = edit_nota4_portugues;
    }

    public Double getMediaPortugues() {
        return mediaPortugues;
    }

    public void setMediaPortugues(Double mediaPortugues) {
        this.mediaPortugues = mediaPortugues;
    }

    @Override
    public String toString() {
        return "Portugues{" +
                "edit_nota1_portugues='" + edit_nota1_portugues + '\'' +
                ", edit_nota2_portugues='" + edit_nota2_portugues + '\'' +
                ", edit_nota3_portugues='" + edit_nota3_portugues + '\'' +
                ", edit_nota4_portugues='" + edit_nota4_portugues + '\'' +
                ", mediaPortugues='" + mediaPortugues + '\'' +
                '}';
    }

}
