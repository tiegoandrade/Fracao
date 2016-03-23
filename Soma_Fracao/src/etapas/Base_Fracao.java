package etapas;

public class Base_Fracao {
	
	//Atributos da classe
	private double numerador;
	private double denominador;
	
	// Método que resolve uma fração
	double calcvalor(){
		if (denominador == 0) {
			return 0;
		}
		return numerador / denominador;
	}
	
	// Método que faz a multiplicação de duas frações, que são representadas por objetos.
	Base_Fracao multiplicar (Base_Fracao f){
		Base_Fracao result = new Base_Fracao();
		result.numerador = this.numerador * f.numerador;
		result.denominador = this.denominador * f.denominador;
		return result;
	}
	
	// Método que define o valor do numerador e do denominador de uma fração
	void definirValores (double numerador, double denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	// Método para representar de uma fração como uma cadeia de caracteres
	String obterFracao(){
		return numerador + " / " + denominador;
	}
}
