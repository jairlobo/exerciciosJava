package curso_programacao;
import java.util.Scanner;
public class question03List2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 *  "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o 
		 *  m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem 
		 *  crescente ou decrescente.
		 */
		
		int A, B;
		System.out.println("Digite os dois n�meros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		
		//result = A % B;
		//System.out.println("O resto da divis�o � " + result);
		
		if( A % B == 0 || B % A == 0 ) {
			System.out.println("� multiplo: ");
		}
		else {
			System.out.println("N�o � multiplo: ");
		}
		
		
		
		
		sc.close();
	}

}
