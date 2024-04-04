package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo t) {

        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
