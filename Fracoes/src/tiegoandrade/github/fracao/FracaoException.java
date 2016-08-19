package tiegoandrade.github.fracao;

/**
 * Classe que representa uma exceção genérica da aplicação de agenda.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
@SuppressWarnings("serial")
public class FracaoException extends Exception {
	
	/**
	 * Construtor
	 * 
	 * @see Exception$Exception(String)
	 * 
	 * @param message Mensagem lançada pelo aplicativo caso haja algum erro.
	 */
	public FracaoException(String message) {
		super(message);
	}
}
