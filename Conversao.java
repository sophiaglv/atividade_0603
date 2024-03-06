package exercicio0603;
import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		//Variáveis
		double real, euro;
		//Scanner
		Scanner ler = new Scanner (System.in);

		//Entrada
		System.out.println("Informe o valor em reais: ");
		real = ler.nextDouble();

		//Processamento
		euro = real * 0.19;

		//Saída
		System.out.println("O valor em euro é:" + euro);
		ler.close();
		
	}

}
