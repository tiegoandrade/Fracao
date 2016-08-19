package tiegoandrade.github.fracao;

/**
 * Classe que representa uma exce��o gen�rica da aplica��o de agenda.
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
	 * @param message Mensagem lan�ada pelo aplicativo caso haja algum erro.
	 */
	public FracaoException(String message) {
		super(message);
	}
}
