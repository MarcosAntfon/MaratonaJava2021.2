package IntroducaoMetodosTest;

// METODO - PARÂMETROS TIPO REFERÊNCIA

import IntroducaoMetodosDominio.Estudante;
import IntroducaoMetodosDominio.ImpressoraEstudante;

public class EstudanteTest01 {

	public static void main(String[] args) {

		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante impressora = new ImpressoraEstudante();
		
		estudante01.nome = "Lucy";
		estudante01.idade = 30;
		estudante01.sexo = 'F';

		estudante02.nome = "Marcos";
		estudante02.idade = 29;
		estudante02.sexo = 'M';
		
		impressora.imprime(estudante01);
		
		impressora.imprime(estudante02);
		
		System.out.println("------------------------");
		
		impressora.imprime(estudante01);
		
		impressora.imprime(estudante02);
	}

}
