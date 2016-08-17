package tiegoandrade.github.fracao;

/**
 * Classe que representa a lógica para a resolução de frações.
 * 
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
	 * @param numerador
	 *            Inteiro que representa o numerador de uma fração.
	 * @param denominador
	 *            Inteiro que representa o denominador de uma fração.
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
	 * @param f
	 *            Objeto da classe "BaseFracao" que representa uma fração.
	 * @return O resultado da multiplicação entre duas frações.
	 */
	public BaseFracao multiplicar(BaseFracao f) {
		BaseFracao result = new BaseFracao();
		result.numerador = this.numerador * f.numerador;
		result.denominador = this.denominador * f.denominador;
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
