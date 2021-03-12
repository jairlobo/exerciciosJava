package curso_programacao;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// criando o objeto scanner para entrada de dados e utilizando o locale
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Criação de variáveis
		String x;
		int valor;
		double z;
		int q;
		
		x = sc.next();
		valor = sc.nextInt();
		z = sc.nextDouble();
		q = sc.nextInt();
		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou também : " + valor);
		System.out.println("Você digitou um número de ponto flutuante: " + z);
		
		// utilizando o printf
		
		System.out.printf("Utilizando o printf: %s\t", x);
		System.out.printf("Utilizando o printf: %d\t", valor);
		System.out.print("//////// ");
		System.out.printf("Utilizando o printf: %f%n", z);
		System.out.printf("Utilizando o printf: %d", q);
		
		
		sc.close();
		

	}

}
