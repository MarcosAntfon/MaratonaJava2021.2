package IntroducaoMetodosDominio;

//METODO - PARÂMETROS TIPO REFERÊNCIA

public class ImpressoraEstudante {
	public void imprime(Estudante estudante) {
		System.out.println("------------------");
		
		estudante.nome = "Andrew";
				
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		
		
		//	ALTERAÇÃO NA CLASS ImpressoraEstudante
		
	}

}
