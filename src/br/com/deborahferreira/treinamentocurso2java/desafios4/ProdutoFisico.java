package br.com.deborahferreira.treinamentocurso2java.desafios4;

public class ProdutoFisico implements Calculavel{
    private int preco;

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
