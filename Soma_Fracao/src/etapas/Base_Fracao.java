package etapas;

public class Base_Fracao {
	
	//Atributos da classe
	private double numerador;
	private double denominador;
	
	// M�todo que resolve uma fra��o
	double calcvalor(){
		if (denominador == 0) {
			return 0;
		}
		return numerador / denominador;
	}
	
	// M�todo que faz a multiplica��o de duas fra��es, que s�o representadas por objetos.
	Base_Fracao multiplicar (Base_Fracao f){
		Base_Fracao result = new Base_Fracao();
		result.numerador = this.numerador * f.numerador;
		result.denominador = this.denominador * f.denominador;
		return result;
	}
	
	// M�todo que define o valor do numerador e do denominador de uma fra��o
	void definirValores (double numerador, double denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	// M�todo para representar de uma fra��o como uma cadeia de caracteres
	String obterFracao(){
		return numerador + " / " + denominador;
	}
}
