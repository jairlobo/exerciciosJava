package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class question02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/*
		 * Faça um programa para ler o valor do raio do circulo
		 * e depois mostrar o valor da area deste circulo com
		 * quatro casas decimais conforme exemplos.
		 * formula da area: area = pi . raio²
		 * considere o valor de pi = 3.14159
		 */
		
		// Criação do objeto scanner para captura de entrada de dados
		Scanner sc = new Scanner(System.in);
		
		// Criação das variaveis e atribuindo a entrada de dados para a variavel raio
		double raio;
		double pi = 3.14159;
		double area;
		raio = sc.nextDouble();
		
		// Processamento
		
		area = pi * Math.pow(raio, 2.0);
		
		// Saida de dados
		
		System.out.printf("A = %.4f", area);
		sc.close();

	}

}
