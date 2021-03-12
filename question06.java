package curso_programacao;
import java.util.Scanner;
import java.util.Locale;

public class question06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
		 * Em seguida, calcule e mostre:
				a) a área do triângulo retângulo que tem A por base e C por altura.
				b) a área do círculo de raio C. (pi = 3.14159)
				c) a área do trapézio que tem A e B por bases e C por altura.
				d) a área do quadrado que tem lado B.
				e) a área do retângulo que tem lados A e B.
		 */
		
		// Criação do objeto Scanner e criação de variaveis.
		Scanner sc = new Scanner(System.in);
		
		double A , B, C, pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		
		// Resolução da a)
		
		double areaTri;
		areaTri = A * C / 2.0;
		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		
		
		// Resolução da B)
		
		double areaCir;
		areaCir = pi * Math.pow(C, 2.0);
		System.out.printf("CIRCULO: %.3f%n", areaCir);
		
		// Resolução da C)
		double areaTrap;
		areaTrap = (A + B) * C / 2;
		System.out.printf("TRAPEZIO: %.3f%n", areaTrap);
		
		// Resolução da D)
		double areaQua;
		areaQua = Math.pow(B, 2.0);
		System.out.printf("QUADRADO: %.3f%n", areaQua);
		
		// Resolução da E)
		
		double areaRet;
		areaRet = A * B;
		System.out.printf("RETANGULO: %.3f%n", areaRet);
		
		sc.close();
		
		
		
		

	}

}
