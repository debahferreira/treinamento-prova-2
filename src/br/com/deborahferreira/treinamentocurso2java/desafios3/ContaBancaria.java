package br.com.deborahferreira.treinamentocurso2java.desafios3;

public class ContaBancaria {
    protected double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public double consultarSaldo() {
        return saldo;
    }
}
