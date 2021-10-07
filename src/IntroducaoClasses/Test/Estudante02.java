package IntroducaoClasses.Test;

import IntroducaoClasses.Dominio.Estudante;

public class Estudante02 {

	public static void main(String[] args) {
		
		Estudante estudante = new Estudante();
		Estudante estudante02 = new Estudante();
		
		estudante.nome = "Vetida";
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		System.out.println(estudante.nome);
		
		System.out.println("---------------------");
		
		System.out.println(estudante02.idade);
		System.out.println(estudante02.sexo);
		System.out.println(estudante02.nome);
	
		// porque aqui nao tem nenhum objetos na variaveis.
	}

}
