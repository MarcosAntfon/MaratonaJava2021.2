package IntroducaoMetodosDominio;

//METODO - PAR�METROS TIPO REFER�NCIA

public class ImpressoraEstudante {
	public void imprime(Estudante estudante) {
		System.out.println("------------------");
		
		estudante.nome = "Andrew";
				
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		
		
		//	ALTERA��O NA CLASS ImpressoraEstudante
		
	}

}
