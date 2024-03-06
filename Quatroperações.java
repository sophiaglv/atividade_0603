package exercicio0603;
import java.util.Scanner;

public class Quatroperações {

	public static void main(String[] args) {
		// Variáveis
		double a, b, soma, subtracao, multiplicacao, divisao;
		//Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada
		System.out.println("Digite o primeiro valor: ");
		a = ler.nextDouble();

		System.out.println("Digite o segundo valor: ");
		b = ler.nextDouble();

		//Processamento
		soma = a + b;
		subtracao = a - b;
		multiplicacao = a * b;
		divisao = a / b;

		//Saída
		System.out.println("O resultado da soma é: " + soma);
		System.out.println("O resultado da subtração é: " + subtracao);
		System.out.println("O resultado da multiplicação é: " + multiplicacao);
		System.out.println("O resultado da divisão é: " + divisao);
		ler.close();

	}

}
