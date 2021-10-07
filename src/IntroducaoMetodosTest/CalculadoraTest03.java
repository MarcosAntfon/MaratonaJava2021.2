package IntroducaoMetodosTest;

import IntroducaoMetodosDominio.Calculadora;

public class CalculadoraTest03 {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		double result = calculadora.divideDoisNumeros(20, 2);
		// ex2: double result = calculadora.divideDoisNumeros(20, 0);
		System.out.println(result);
		System.out.println(calculadora.divideDoisNumeros02(20,0));
		
		System.out.println("------------------");
		System.out.println(calculadora.divideDoisNumeros03(20,0));
		System.out.println(calculadora.divideDoisNumeros03(20,2)); //Mudando a logica
		
		System.out.println("------------------");
		calculadora.imprimeDivisaoDoisNumeros(86,5);
		calculadora.imprimeDivisaoDoisNumeros(86,0);
		
		System.out.println("------------------");
		// com return
		calculadora.imprimeDivisaoDoisNumeros02(86,5);
		calculadora.imprimeDivisaoDoisNumeros02(86,0);
	}

}
