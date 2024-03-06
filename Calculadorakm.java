package exercicio0603;
import java.util.Scanner;

public class Calculadorakm {

	public static void main(String[] args) {
		// Variáveis
		double valorgasolina, distanciakm, consmediokm, quantotal, gastotal;
		//Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada de dados
		System.out.println("Informe o valor do litro da gasolina: ");
		valorgasolina = ler.nextDouble();

		System.out.println("Informe a distância percorrida em Km: ");
		distanciakm = ler.nextDouble();

		System.out.println("Informe o consumo médio em Km: ");
		consmediokm = ler.nextDouble();

		//Processamento
		quantotal = distanciakm / consmediokm;
		gastotal = quantotal * valorgasolina;

		//Saída
		System.out.println("A quantidade total de litros gastos no trajeto é: " + quantotal);
		System.out.println("O gasto total com o combustível: " + gastotal);
		ler.close();

	}

}
