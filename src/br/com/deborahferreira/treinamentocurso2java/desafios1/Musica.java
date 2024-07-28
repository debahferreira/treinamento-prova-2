package br.com.deborahferreira.treinamentocurso2java.desafios1;

public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double somaDasAvaliacoes;
    private int numAvaliacoes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibirFichaTecnica() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }
    public void avaliaMusica(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }
    public double calculaMedia() {
        return somaDasAvaliacoes/numAvaliacoes;
    }
}
