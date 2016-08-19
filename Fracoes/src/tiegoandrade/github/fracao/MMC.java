package tiegoandrade.github.fracao;

/**
 * Classe que representa a lógica da aplicação do método do Mínimo Múltiplo
 * Comum
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class MMC {
	
	/**
	 * Realiza o cálculo do MMC.
	 * 
	 * @param num1 É o primeiro denominador da primeira fração.
	 * @param num2 É o segundo denominador da segunda fração.
	 * @return O mínimo múltiplo comum das duas frações.
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
