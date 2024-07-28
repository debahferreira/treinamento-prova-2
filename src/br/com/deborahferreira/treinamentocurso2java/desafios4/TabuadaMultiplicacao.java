package br.com.deborahferreira.treinamentocurso2java.desafios4;

public class TabuadaMultiplicacao implements Tabuada{
    private int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void mostrarTabuada() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero * i);
        }
    }
}
