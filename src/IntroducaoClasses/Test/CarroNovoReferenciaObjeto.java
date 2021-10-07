package IntroducaoClasses.Test;

import IntroducaoClasses.Dominio.Carro;

public class CarroNovoReferenciaObjeto {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.nome = "PORSCHE";
		carro1.modelo = "Porsche 911";
		carro1.ano= 2020;
		
		carro2.nome ="FERRARI";
		carro2.modelo ="Ferrari Enzo";
		carro2.ano = 2021;
		
		carro1 = carro2; // Referência de Objeto.
		
		System.out.println("carro1");
		System.out.println(carro1.nome);
		System.out.println(carro1.modelo);
		System.out.println(carro1.ano);
		
		System.out.println("\ncarro 2");
		System.out.println(carro2.nome);
		System.out.println(carro2.modelo);
		System.out.println(carro2.ano);
	}

}
