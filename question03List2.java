package curso_programacao;
import java.util.Scanner;
public class question03List2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 *  "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são 
		 *  múltiplos entre si. Atenção: os números devem poder ser digitados em ordem 
		 *  crescente ou decrescente.
		 */
		
		int A, B;
		System.out.println("Digite os dois números: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		//result = A % B;
		//System.out.println("O resto da divisão é " + result);
		
		if( A % B == 0 || B % A == 0 ) {
			System.out.println("é multiplo: ");
		}
		else {
			System.out.println("Não é multiplo: ");
		}
		
		
		
		
		sc.close();
	}

}
