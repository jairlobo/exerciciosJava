package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class question05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler o codigo de 1 peça, o número de 1 peças,
		 * o valor unitario de cada peça 1, o codigo de uma peça 2, o numero de pecas 2
		 * e o valor unitario de cada peça 2. Calcule o mostre o valor a ser pago.
		 */
		
		
		// Criação de variaveis e do objeto Scanner
			Scanner sc = new Scanner(System.in);
			
			int codPeca1, codPeca2, numPecas1, numPecas2;
			double unitarioPeca1, unitarioPeca2, valorTotal;
			
			codPeca1 = sc.nextInt();
			numPecas1 = sc.nextInt();
			unitarioPeca1 = sc.nextDouble();
			
			codPeca2 = sc.nextInt();
			numPecas2 = sc.nextInt();
			unitarioPeca2 = sc.nextDouble();
			
			
			// Processamento
			
			valorTotal = (numPecas1 * unitarioPeca1) + (numPecas2 * unitarioPeca2);
			
			// Saida de dados
			
			System.out.printf("VALOR A PAGAR : R$ %.2f", valorTotal);
			
			
			sc.close();
			

	}

}
