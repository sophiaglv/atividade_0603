package exercicio0603;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		//Variáveis
		double base, altura, area;
		//Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada
		System.out.println("Informe valor da base: ");
		base = ler.nextDouble();

		System.out.println("Informe valor da altura; ");
		altura = ler.nextDouble();

		//Processamento
		area = (base * altura) / 2;

		//Saída
		System.out.println("A área do triângulo é: " + area);
		ler.close();

	}

}
