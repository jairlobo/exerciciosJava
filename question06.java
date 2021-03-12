package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class question06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/*
		 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. 
		 * Em seguida, calcule e mostre:
				a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
				b) a �rea do c�rculo de raio C. (pi = 3.14159)
				c) a �rea do trap�zio que tem A e B por bases e C por altura.
				d) a �rea do quadrado que tem lado B.
				e) a �rea do ret�ngulo que tem lados A e B.
		 */
		
		// Cria��o do objeto Scanner e cria��o de variaveis.
		Scanner sc = new Scanner(System.in);
		
		double A , B, C, pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		
		// Resolu��o da a)
		
		double areaTri;
		areaTri = A * C / 2.0;
		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		
		
		// Resolu��o da B)
		
		double areaCir;
		areaCir = pi * Math.pow(C, 2.0);
		System.out.printf("CIRCULO: %.3f%n", areaCir);
		
		// Resolu��o da C)
		double areaTrap;
		areaTrap = (A + B) * C / 2;
		System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
		
		// Resolu��o da D)
		double areaQua;
		areaQua = Math.pow(B, 2.0);
		System.out.printf("QUADRADO: %.3f%n", areaQua);
		
		// Resolu��o da E)
		
		double areaRet;
		areaRet = A * B;
		System.out.printf("RETANGULO: %.3f%n", areaRet);
		
		sc.close();
		
		
		
		

	}

}
