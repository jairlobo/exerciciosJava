package curso_programacao;
import java.util.Locale;
import java.util.Scanner;
public class question01List2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 
		 * Fazer um programa para ler um número inteiro, e depois dizer 
		 * se este número é negativo ou não.
		 */
		
		int x;
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("NEGATIVO");
		} 
		else {
			System.out.println("POSITIVO");
		}
		sc.close();
	}

}
