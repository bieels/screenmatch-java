package Main;

import br.com.alura.screenmatch.calculation.CalculadoraTempo;
import br.com.alura.screenmatch.calculation.Recomendation;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Homem de Ferro", 2010);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(16);
        lost.setMinutosPorEpisodio(49);
        System.out.println("Duração total da serie: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Recomendation filtro = new Recomendation();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

        Object objeto = filmeDoPaulo;
    }


}
