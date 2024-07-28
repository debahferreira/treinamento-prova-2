import br.com.deborahferreira.treinamentocurso2java.desafios1.*;
import br.com.deborahferreira.treinamentocurso2java.desafios2.IdadePessoa;
import br.com.deborahferreira.treinamentocurso2java.desafios2.NotasAluno;
import br.com.deborahferreira.treinamentocurso2java.desafios2.Produto;
import br.com.deborahferreira.treinamentocurso2java.desafios3.ContaCorrente;
import br.com.deborahferreira.treinamentocurso2java.desafios3.Gato;
import br.com.deborahferreira.treinamentocurso2java.desafios3.ModeloCarro;
import br.com.deborahferreira.treinamentocurso2java.desafios4.*;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        System.out.println(pessoa1.exibeFrase());

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobroDoNumero(3));

        Musica musica1 = new Musica();
        musica1.setTitulo("Into You");
        musica1.setArtista("Ariana Grande");
        musica1.setAnoLancamento(2016);
        musica1.exibirFichaTecnica();
        musica1.avaliaMusica(8);
        musica1.avaliaMusica(10);
        System.out.println(musica1.calculaMedia());

        Carros carro1 = new Carros();
        carro1.setModelo("Ora Ballet Cat");
        carro1.setCor("Rosa");
        carro1.setAnoLancamento(2022);
        carro1.exibirFichaTecnica();
        System.out.println(carro1.calcularIdadeCarro());

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Deborah Ferreira");
        aluno1.setIdade(19);
        aluno1.exibirInformacoes();

        IdadePessoa idadePessoa1 = new IdadePessoa();
        idadePessoa1.setNome("Deborah");
        idadePessoa1.setIdade(19);
        idadePessoa1.verificarIdade();

        Produto produto1 = new Produto("Livro", 45);
        System.out.println(produto1.aplicarDesconto(0.10));

        NotasAluno aluno2 = new NotasAluno("Eliane", 10, 8, 9);
        System.out.println(aluno2.calcularMedia());

        ModeloCarro modeloCarro1 = new ModeloCarro("Ora Ballet Car", 200000, 190000, 170000);
        modeloCarro1.exibirInformacoes();
        System.out.println(modeloCarro1.calcularMaiorPreco());

        Gato gato1 = new Gato();
        System.out.println(gato1.emitirSom());

        ContaCorrente contaCorrente1 = new ContaCorrente(1000);
        System.out.println(contaCorrente1.consultarSaldo());
        contaCorrente1.depositar(500);
        System.out.println(contaCorrente1.consultarSaldo());
        contaCorrente1.sacar(700);
        System.out.println(contaCorrente1.consultarSaldo());
        contaCorrente1.sacar(900);
        System.out.println(contaCorrente1.consultarSaldo());
        contaCorrente1.cobrarTarifaMensal(200);
        System.out.println(contaCorrente1.consultarSaldo());

        ConversorMoeda conversor = new ConversorMoeda();
        System.out.println(conversor.converterDolarParaReal(4));

        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.setAltura(2);
        sala.setLargura(3);
        System.out.println(sala.calcularArea());
        System.out.println(sala.calcularPerimetro());

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(5);
        tabuada.mostrarTabuada();

        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        System.out.println(conversorTemperatura.celsiusParaFahrenheit(30));
        System.out.println(conversorTemperatura.fahrenheitParaCelsius(86));

        Servico servico1 = new Servico();
        servico1.setPreco(100);
        System.out.println(servico1.calcularPrecoTotal(3));
    }
}
