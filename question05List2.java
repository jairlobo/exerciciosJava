package curso_programacao;
import java.util.Scanner;
import java.util.Locale;
public class question05List2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		double codProduto = sc.nextDouble();
		double quantidade = sc.nextDouble();
		 double total;
		if(codProduto == 1) {
			total = quantidade * 4.00;
			System.out.printf("O TOTAL: R$ %.2f%n", total);
			
		}
		else if(codProduto == 2) {
			total = quantidade * 4.50;
			System.out.printf("O TOTAL: R$ %.2f%n", total);
			
		}
		else if(codProduto == 3) {
			total = quantidade * 5.00;
			System.out.printf("O TOTAL: R$ %.2f%n", total);
			
		}
		else if(codProduto == 4) {
			total = quantidade * 2.00;
			System.out.printf("O TOTAL: R$ %.2f%n", total);
			
		}
		else if(codProduto == 5){
			total = quantidade * 1.50;
			System.out.printf("O TOTAL: R$ %.2f%n", total);
		}
		
		sc.close();

	}

}
