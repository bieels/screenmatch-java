package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Titulo;

public class Recomendation {
    private String recomendacao;

    public void filtra(Classification classification) {
        if (classification.getClassificacao() >=4) {
            System.out.println("Está entre os melhores!");
        } else if (classification.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
