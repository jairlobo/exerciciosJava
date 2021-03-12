package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class question06List2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite um número: ");
		double numero = sc.nextDouble();
		
		if(numero >= 0 && numero <= 25 ) {
			System.out.println("Está dentro do intervalo: [0,25]");
		}
		else if(numero > 25 && numero <= 50 ) {
			System.out.println("Está dentro do intervalo: [25,50]");
		}
		else if(numero > 50 && numero <= 75) {
			System.out.println("Está dentro do intervalo: [50,75]");
		}
		else if(numero > 75 && numero <= 100) {
			System.out.println("Está dentro do intervalo: [75,100]");
		}
		else {
			System.out.println("Está fora do intervalo");
		}
		
		
		
		sc.close();
		

	}

}
