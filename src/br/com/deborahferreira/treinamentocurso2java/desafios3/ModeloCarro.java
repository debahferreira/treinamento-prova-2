package br.com.deborahferreira.treinamentocurso2java.desafios3;

public class ModeloCarro extends Carro{

    public ModeloCarro(String modelo, double precoAno1, double precoAno2, double precoAno3) {
        super(modelo, precoAno1, precoAno2, precoAno3);
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + getModelo());
        System.out.println("Preço ano 1: " + getPrecoAno1());
        System.out.println("Preço ano 2: " + getPrecoAno2());
        System.out.println("Preço ano 3: " + getPrecoAno3());
    }
}
