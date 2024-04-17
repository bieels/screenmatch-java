package Main;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class MainWithList {
    public static void main(String[] args) {
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(9);
        var outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(5);
        var meuFilme = new Filme("Homem de Ferro", 2010);
        meuFilme.avalia(8);
        var lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);
        listaDeAssistidos.forEach(item -> {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        });

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Tom Hanks");
        buscaPorArtista.add("Jennifer Lawrence");
        buscaPorArtista.add("Will Smith");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeAssistidos);
        System.out.println(listaDeAssistidos);

    }
}
