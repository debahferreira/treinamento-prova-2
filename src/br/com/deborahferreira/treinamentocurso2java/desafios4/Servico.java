package br.com.deborahferreira.treinamentocurso2java.desafios4;

public class Servico implements Vendavel{
    private double preco;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return preco * quantidade * 0.85;
    }
}
