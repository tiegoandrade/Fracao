package tiegoandrade.github.fracao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe utilizada para ler dados do console.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Console {
	
	/**
	 * Lê uma String do console.
	 *
	 * @return String lida.
	 */
	public static String readString() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			return reader.readLine();
		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler o dado do teclado");
		}
	}
	
	/**
	 * Lê um valor do tipo inteiro do console.
	 * 
	 * @return valor int lido.
	 */
	public static int readInt() {
		String str = readString();

		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new RuntimeException(str + " não é um inteiro válido");
		}
	}
}
