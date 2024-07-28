package br.com.deborahferreira.treinamentocurso2java.desafios4;

public class Livro implements Calculavel{
    private double preco;


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.95;
    }
}
