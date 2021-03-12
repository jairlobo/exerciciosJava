package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class question04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		/*
		 * Fazer um programa que leia o numero do funcionario, seu numero de horas trabalhadas
		 * o valor que recebe por hora e calcular o salario desse funcionario. A seguir, mostre
		 * o número e o salario do funcionario, com duas casas decimais.
		 */
		
		// Criação de variaveis e objeto scanner
		
		Scanner sc = new Scanner(System.in);
		double horasTrabalhadas, valorHora, salario;
		int  numFunc; 
		
		numFunc = sc.nextInt();
		horasTrabalhadas = sc.nextDouble();
		valorHora = sc.nextDouble();
		
		// Processamento
		
		salario = valorHora * horasTrabalhadas;
		
		// Saida de dados
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();

	}

}
