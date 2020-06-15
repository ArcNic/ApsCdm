package com.examplenicolaslima.aps;

import java.io.Serializable;

public class Turma implements Serializable {

    private Integer ID;
    private String nome_turma;
    private String sala;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String toString(){
        return nome_turma;
    }

}
