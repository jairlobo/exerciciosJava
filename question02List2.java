package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class question02List2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Fazer um programa para ler um n�mero inteiro 
		 * e dizer se este n�mero � par ou �mpar.
		 */
		
		int x;
		System.out.println("Digite um n�mero: ");
		x = sc.nextInt();
		
		if(x % 2 != 0) {
			System.out.println("N�mero IMPAR!");
		}
		else {
			System.out.println("N�mero PAR!");
		}
		
		sc.close();
	}

}
