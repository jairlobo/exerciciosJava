package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class question05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler o codigo de 1 pe�a, o n�mero de 1 pe�as,
		 * o valor unitario de cada pe�a 1, o codigo de uma pe�a 2, o numero de pecas 2
		 * e o valor unitario de cada pe�a 2. Calcule o mostre o valor a ser pago.
		 */
		
		
		// Cria��o de variaveis e do objeto Scanner
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
