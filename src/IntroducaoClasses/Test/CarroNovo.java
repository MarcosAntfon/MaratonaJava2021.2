package IntroducaoClasses.Test;

import IntroducaoClasses.Dominio.Carro;

public class CarroNovo {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		 
		carro1.nome = "PORSCHE";
		carro1.modelo = "Porsche 911";
		carro1.ano= 2020;
		
		carro2.nome ="FERRARI";
		carro2.modelo ="Ferrari Enzo";
		carro2.ano = 2021;
		
		carro3.nome ="JAGUAR";
		carro3.modelo = "Jaguar E-Pace";
		carro3.ano = 2021;
		
		carro4.nome ="Lamborghini";
		carro4.modelo ="Lamborghini Veneno";
		carro4.ano = 2021;
		
		System.out.println("carro1");
		System.out.println(carro1.nome);
		System.out.println(carro1.modelo);
		System.out.println(carro1.ano);
		
		System.out.println("\ncarro 2");
		System.out.println(carro2.nome);
		System.out.println(carro2.modelo);
		System.out.println(carro2.ano);
		
		System.out.println("\ncarro 3");
		System.out.println(carro3.nome);
		System.out.println(carro3.modelo);
		System.out.println(carro3.ano);
		
		System.out.println("\ncarro 4");
		System.out.println(carro4.nome);
		System.out.println(carro4.modelo);
		System.out.println(carro4.ano);
		
	}
}
		