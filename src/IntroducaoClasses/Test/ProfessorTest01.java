package IntroducaoClasses.Test;

import IntroducaoClasses.Dominio.Professor;

public class ProfessorTest01 {

	public static void main(String[] args) {

		Professor professor = new Professor();
		Professor professor2 = new Professor();
		Professor professor3 = new Professor();
		
		professor.nome = "Luciene";
		professor.idade = 50;
		professor.sexo = 'F';
		
		professor2.nome = "Ingrid";
		professor2.idade = 26;
		professor2.sexo = 'F';
		
		professor3.nome = "Marcos";
		professor3.idade = 35;
		professor3.sexo = 'M';
		
		System.out.println("Nome:  " +professor.nome + " idade: " + professor.idade+ "  sexo:  "+professor.sexo);
		System.out.println("------------------------");
		System.out.println("Nome:  " +professor2.nome + " idade: " + professor2.idade+ "  sexo:  "+professor2.sexo);
		System.out.println("------------------------");
		System.out.println("Nome:  " +professor3.nome + " idade: " + professor3.idade+ "  sexo:  "+professor3.sexo);
	}

}
