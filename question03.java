package curso_programacao;
import java.util.Scanner;


public class question03 {

	public static void main(String[] args) {
	
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		 * A seguir calcule e mostre a diferen�a(DIMINUIR) do produto(MULTIPLICA��O) de a e B pelo
		 * produto de C e D, seguindo a formula DIFERENCA = (A * B - C * D);
		 */
		
		// Cria��o de variaveis e do objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		// Processamento
		diferenca = A * B - C * D;
		
		// Saida de dados
		
		System.out.println("DiFEREN�A = " + diferenca);
		
		
		sc.close();
		
		

	}

}
