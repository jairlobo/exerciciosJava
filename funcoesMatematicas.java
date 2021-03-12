package curso_programacao;

public class funcoesMatematicas {

	public static void main(String[] args) {
		
		double a = 30;
		
		System.out.println(Math.sqrt(a));
		
		a = 45;
		
		System.out.println(Math.sqrt(a));
		
		a = 60;
		
		System.out.println(Math.sqrt(a));
		
		a = 90;
		
		System.out.println(Math.sqrt(a));
		
		/* Para mostrar o funcionamento do método java.lang.Math.sqrt () 
		 * quando o argumento é NaN ou + infinito.
		 */
		
		
		double positiveInfinity = Double.POSITIVE_INFINITY;
		double negativeVal = -5;
		double nan = Double.NaN;
		double result;
		
		// Aqui o argumento é negativo,
		result = Math.sqrt(negativeVal);
		System.out.println(result);
		
		// Aqui o argumento é infinito positivo
		
		result = Math.sqrt(positiveInfinity);
		System.out.println(result);
		
		// Aqui o argumento é NaN e a saída também é um NaN
		result = Math.sqrt(nan);
		System.out.println(result);
		
		
		// Treinando a função de potenciação Math.pow
		
		double b = 10.0;
		double c = 5.0;
		double test;
		
		test = Math.pow(b, c);
		System.out.println(test);
		
		b = 7.0;
		c = 4;
		test = Math.pow(b, c);
		System.out.println(test);
		
		/* Casos especiais que acontecem no metodo Math.pow
		 * Primeiro Caso = Se o segundo parâmetro for zero 
		 * positivo ou negativo, o resultado será 1,0.
		 * 
		 * Segundo caso: Se o segundo parâmetro for 1.0, o
		 *  resultado será o mesmo do primeiro parâmetro.
		 *  
		 *  Se o segundo parâmetro for NaN, o resultado também 
		 *  será NaN.
		 */
		
		// caso 1
		b = 4;
		c = 0;
		test = Math.pow(b, c);
		System.out.println(test); // output: 1.0
		
		// caso 2
		b = 6.0;
		c = 1.0;
		test = Math.pow(b, c);
		System.out.println(test); // output: 6.0
		
		// caso 3
		
		b = 4.0;
		c = Double.NaN;
		test = Math.pow(b, c);
		System.out.println(test); // output: NaN
		
		
		// Treinando a função Math.abs
		
		double y = 4.0;
		double z = - 5.0;
		
		test = Math.abs(y);
		System.out.println(y);
		
		test = Math.abs(z);
		System.out.println(z);
		
		
	

	}

}
