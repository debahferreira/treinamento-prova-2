package br.com.deborahferreira.treinamentocurso2java.desafios3;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public void cobrarTarifaMensal(double tarifa) {
        if (tarifa <= saldo) {
            saldo -= tarifa;
        }
    }
}
