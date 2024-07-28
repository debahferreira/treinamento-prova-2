package br.com.deborahferreira.treinamentocurso2java.desafios4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public double celsiusParaFahrenheit(double temperaturaEmCelsius) {
        return (temperaturaEmCelsius * 1.8) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaEmFahrenheit) {
        return (temperaturaEmFahrenheit - 32) / 1.8;
    }
}
