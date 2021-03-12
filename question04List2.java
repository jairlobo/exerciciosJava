package curso_programacao;
import java.util.Scanner;

public class question04List2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double horaIn, horaFi, duracao;
		System.out.println("Digite a hora inicial: ");
		horaIn = sc.nextDouble();
		
		System.out.println("Digite a hora final: ");
		horaFi = sc.nextDouble();
		
		if(horaIn < 0 && horaFi > 24) {
			System.out.println("ERRO - Digite valores válidos");
		}
		
		if(horaIn == 0 && horaFi == 0) {
			horaIn = 12;
			horaFi = 12;
			duracao = horaIn + horaFi;
			System.out.println("O jogo Durou " + duracao + " HORA(s)");
		}
		
		if(horaIn > horaFi) {
			duracao = ( 24 - horaIn) + horaFi;
			System.out.println("O jogo Durou " + duracao + " HORA(s)");
		}
		else if(horaIn < horaFi) {
			duracao = horaFi - horaIn;
			System.out.println("O jogo Durou " + duracao + " HORA(s)");
		}
		 
		sc.close();

	}

}
