package br.com.deborahferreira.treinamentocurso2java.desafios1;

public class Carros {

    private String modelo;
    private String cor;
    private int anoLancamento;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibirFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }
    public int calcularIdadeCarro() {
        return 2024 - anoLancamento;
    }
}
