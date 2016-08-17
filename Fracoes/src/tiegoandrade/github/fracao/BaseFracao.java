package tiegoandrade.github.fracao;

/**
 * Classe que representa a l�gica para a resolu��o de fra��es.
 * 
 * @author Tiego
 *
 */
public class BaseFracao {

	/**
	 * Atributo que representa o elemento numerador em uma fra��o.
	 */
	private int numerador;

	/**
	 * Atributo que representa o elemento denominador em uma fra��o.
	 */
	private int denominador;

	/**
	 * Construtor
	 * 
	 * @param numerador
	 *            Inteiro que representa o numerador de uma fra��o.
	 * @param denominador
	 *            Inteiro que representa o denominador de uma fra��o.
	 */
	public BaseFracao(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	/**
	 * Construtor sem par�metros.
	 */
	public BaseFracao() {
	}

	/**
	 * Resolve determina fra��o.
	 * 
	 * @return O resultado da divis�o entre dois n�meros.
	 */
	public double calcvalor() {

		// Se o denominador de uma fra��o for zero, o seu resultado ser� zero.
		if (this.denominador == 0) {
			return 0;
		}

		/* 
		 * Vari�vel recebe o resultado da divis�o entre o numerador e o
		 * denominador de uma fra��o.
		 */
		double calc = (double) this.numerador / (double) this.denominador;
		return calc;
	}

	/**
	 * M�todo que faz a multiplica��o de duas fra��es.
	 * 
	 * @param f
	 *            Objeto da classe "BaseFracao" que representa uma fra��o.
	 * @return O resultado da multiplica��o entre duas fra��es.
	 */
	public BaseFracao multiplicar(BaseFracao f) {
		BaseFracao result = new BaseFracao();
		result.numerador = this.numerador * f.numerador;
		result.denominador = this.denominador * f.denominador;
		return result;
	}

	/**
	 * M�todo que aprenseta como uma fra��o deve ser apresentada.
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return numerador + "/" + denominador;
	}
}
