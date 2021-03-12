package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class question02List2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Fazer um programa para ler um número inteiro 
		 * e dizer se este número é par ou ímpar.
		 */
		
		int x;
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if(x % 2 != 0) {
			System.out.println("Número IMPAR!");
		}
		else {
			System.out.println("Número PAR!");
		}
		
		sc.close();
	}

}
