package tiegoandrade.github.fracao;

/**
 * Classe que representa a lógica para a resolução de frações.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class BaseFracao {

	/**
	 * Atributo que representa o elemento numerador em uma fração.
	 */
	private int numerador;

	/**
	 * Atributo que representa o elemento denominador em uma fração.
	 */
	private int denominador;

	/**
	 * Construtor
	 * 
	 * @param numerador Inteiro que representa o numerador de uma fração.
	 * @param denominador Inteiro que representa o denominador de uma fração.
	 */
	public BaseFracao(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	/**
	 * Construtor sem parâmetros.
	 */
	public BaseFracao() {
	}

	/**
	 * Resolve determina fração.
	 * 
	 * @return O resultado da divisão entre dois números.
	 */
	public double calcvalor() {

		// Se o denominador de uma fração for zero, o seu resultado será zero.
		if (this.denominador == 0) {
			return 0;
		}

		/*
		 * Variável recebe o resultado da divisão entre o numerador e o
		 * denominador de uma fração.
		 */
		double calc = (double) this.numerador / (double) this.denominador;
		return calc;
	}

	/**
	 * Método que faz a multiplicação de duas frações.
	 * 
	 * @param f Fração que representa o segundo elemento da operação
	 * @return O resultado da multiplicação entre duas frações.
	 */
	public BaseFracao multiplicar(BaseFracao f) {
		BaseFracao result = new BaseFracao();
		result.numerador = this.numerador * f.numerador;
		result.denominador = this.denominador * f.denominador;
		return result;
	}

	/**
	 * Realiza a divisão entre duas frações.
	 * 
	 * @param f Fração que representa o segundo elemento da operação.
	 * @return O resultado da divisão das duas frações
	 */
	public BaseFracao dividir(BaseFracao f) {
		BaseFracao result = new BaseFracao();
		result.numerador = this.numerador * f.denominador;
		result.denominador = this.denominador * f.numerador;
		return result;
	}

	/**
	 * Realiza a soma entre duas frações.
	 * 
	 * @param f Fração que representa o segundo elemento da operação
	 * @return O resultado da soma entre duas frações.
	 */
	public BaseFracao adicao(BaseFracao f) {
		BaseFracao result = new BaseFracao();

		if (this.denominador == f.denominador) {
			result.numerador = this.numerador + f.numerador;
			result.denominador = this.denominador;
			return result;
		}
		
		int mmc = MMC.calcMMC(this.denominador, f.denominador);
		result.numerador = ((mmc / this.denominador) * this.numerador)
				+ ((mmc / f.denominador) * f.numerador);
		result.denominador = mmc;
		return result;
	}

	/**
	 * Realiza a subtração entre duas frações.
	 * 
	 * @param f Fração que representa o segundo elemento da operação.
	 * @return O resultado da subtração entre duas frações.
	 */
	public BaseFracao subtracao(BaseFracao f) {
		BaseFracao result = new BaseFracao();

		if (this.denominador == f.denominador) {
			result.numerador = this.numerador - f.numerador;
			result.denominador = this.denominador;
			return result;
		}
		
		int mmc = MMC.calcMMC(this.denominador, f.denominador);
		result.numerador = ((mmc / this.denominador) * this.numerador)
				- ((mmc / f.denominador) * f.numerador);
		result.denominador = mmc;
		return result;
	}

	/**
	 * Método que aprenseta como uma fração deve ser apresentada.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
}
