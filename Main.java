package curso_programacao;
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// criando o objeto scanner para entrada de dados e utilizando o locale
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// Cria��o de vari�veis
		String x;
		int valor;
		double z;
		int q;
		
		x = sc.next();
		valor = sc.nextInt();
		z = sc.nextDouble();
		q = sc.nextInt();
		System.out.println("Voc� digitou: " + x);
		System.out.println("Voc� digitou tamb�m : " + valor);
		System.out.println("Voc� digitou um n�mero de ponto flutuante: " + z);
		
		// utilizando o printf
		
		System.out.printf("Utilizando o printf: %s\t", x);
		System.out.printf("Utilizando o printf: %d\t", valor);
		System.out.print("//////// ");
		System.out.printf("Utilizando o printf: %f%n", z);
		System.out.printf("Utilizando o printf: %d", q);
		
		
		sc.close();
		

	}

}
