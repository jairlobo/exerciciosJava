package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class question07List2 {

	public static void main(String[] args) {
		// Setando o objeto Scanner e definindo o locale para padrão americano.
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		// Entrada de dados
		System.out.println("Por favor, digite o valor da absissa: ");
		double x = sc.nextDouble();
		System.out.println("Por favor, digite o valor da ordenada: ");
		double y = sc.nextDouble();
		
		// Processamento e saída.
		
		if(x == 0 && y == 0) {
			System.out.println("Origem");
		}
		
		else if (x == 0.0) {
			System.out.println("Eixo Y");
		}
		else if (y == 0.0) {
			System.out.println("Eixo X");
		}
		
		else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		
		else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		
		else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		sc.close();

	}

}
