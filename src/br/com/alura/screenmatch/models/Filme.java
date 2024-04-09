package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Classification;

public class Filme extends Titulo implements Classification {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}