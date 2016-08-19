package tiegoandrade.github.fracao;

/**
 * Classe que representa a l�gica da aplica��o do m�todo do M�nimo M�ltiplo
 * Comum
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class MMC {
	
	/**
	 * Realiza o c�lculo do MMC.
	 * 
	 * @param num1 � o primeiro denominador da primeira fra��o.
	 * @param num2 � o segundo denominador da segunda fra��o.
	 * @return O m�nimo m�ltiplo comum das duas fra��es.
	 */
	public static int calcMMC(int num1, int num2) {
		int n = 2;
		int resultado = 1;

		while (num1 != 1 || num2 != 1) {
			while (num1 % n != 0 && num2 % n != 0) {
				n++;
			}
			if (num1 % n == 0) {
				num1 = num1 / n;
			}
			if (num2 % n == 0) {
				num2 = num2 / n;
			}
			resultado *= n;
		}
		return resultado;
	}
}
