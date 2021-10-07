package IntroducaoClasses.Test;

import IntroducaoClasses.Dominio.Estudante;

public class Estudante01 {

	
	public static void main(String[] args) {

	Estudante estudante = new Estudante ();
	estudante.nome = "Lucy";
	estudante.idade = 25;
	estudante.sexo = 'F';
	
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		System.out.println(estudante);
	}

}
