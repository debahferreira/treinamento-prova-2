package br.com.deborahferreira.treinamentocurso2java.desafios4;

public class ConversorMoeda implements ConversaoFinanceira{
    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * 5.66;
    }
}
