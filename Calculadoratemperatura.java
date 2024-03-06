package exercicio0603;
import java.util.Scanner;

public class Calculadoratemperatura {

	public static void main(String[] args) {
		// Variáveis
		double fahrenheit;
		final double celsius;
		//Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada de dados
		System.out.println("Informe a temperatura em Fahrenheit:");
		fahrenheit = ler.nextDouble();

		//Processamento
		celsius = ((fahrenheit - 32) * 5) / 9;

		//Saída de dados
		System.out.println("A temperatura em Celsius é: " + celsius);
		ler.close();

	}

}
