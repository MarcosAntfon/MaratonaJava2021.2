package IntroducaoMetodosDominio;

public class Calculadora {
	
	public void somaDoisNumeros() {
		System.out.println(10 + 10);
	}
	
	public void subtraiDoisNumeros() {
		System.out.println(21 - 2);
	}

	public void somaTresNumeros() {
		System.out.println(200+ 158 +853);
	}
	
	public void multiplicaDoisNumeros(int num1, int num2) {
		System.out.println( num1 *  num2);
	}
	
	public double divideDoisNumeros(double num1 , double num2) {  //public int dividDoisNumeros(double num1 , double num2{
		return num1/num2;										// return (int) (num1/num2)
		
	//	return 0; // valor sempre vai ser zero.
		
	//ex2: if(num2 == 0){
	//	return = 0;
	//}
		
	}
	
	// USANDO O ELSE
	
	public double divideDoisNumeros02(double num1 , double num2) { 

		 if(num2 == 0){
			 return 0;
		 }else {
		 return num1/num2;
		 }
	}
	
	// MUDANDO A LOGICA
	
	public double divideDoisNumeros03(double num1 , double num2) { 

		 if(num2 != 0){
			 return num1/num2;
		 }
		 return 0;
	
	}
	
	//METODO VOID
	
	public void imprimeDivisaoDoisNumeros(double num1 , double num2) { 
		if(num2 == 0) {
			System.out.println("N�o existe divis�o por zero");
		}
		System.out.println(num1/num2);
	}
	
	//USANDO O RETURN
	
	public void imprimeDivisaoDoisNumeros02(double num1 , double num2) { 
		if(num2 == 0) {
			System.out.println("N�o existe divis�o por zero");
			return;
		}
		System.out.println(num1/num2);
	}
	
	// METODO - PAR�METROS TIPO PRIMITIVO
	public void alteraDoisNumeros(int num1, int num2) {
		
		num1 = 99;
		num2 = 33;
		System.out.println("Dentro do alteraDoisNumeros");
		System.out.println("num1 " +num1);
		System.out.println("num2 " +num2);

	}
		
	
}