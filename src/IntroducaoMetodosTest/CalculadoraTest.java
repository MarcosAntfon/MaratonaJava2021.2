package IntroducaoMetodosTest;

import IntroducaoMetodosDominio.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		calculadora.somaDoisNumeros();
		System.out.println("Finalizando CalculadoraTest");

		calculadora.subtraiDoisNumeros();
		
		calculadora.somaTresNumeros();

	}
}
