package tiegoandrade.github.fracao;

/**
 * Classe que representa o menu da aplicação
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Menu {

	/** A opção 1 é utilizada para somar duas frações. */
	public static final int SOMAR = 1;

	/** A opção 2 é utilizada para subtrair duas frações. */
	public static final int SUBTRAIR = 2;

	/** A opção 3 é utilizada para multiplicar duas frações. */
	public static final int MULTIPLICAR = 3;

	/** A opção 4 é utilizada para dividir duas frações. */
	public static final int DIVIDIR = 4;

	/** A opção 5 é utilizada para sair da aplicação. */
	public static final int SAIR = 5;

	/**
	 * Método que exiibe o menu de opções.
	 *
	 * @return A opção selecionada.
	 * 
	 * @throws FracaoException
	 *             Lançada caso seja selecionado uma opção que não existe.
	 */
	public int exibirOpcoes() throws FracaoException {
		System.out.println("---- MENU DE OPÇÕES ----");
		System.out.println("#1) Somar");
		System.out.println("#2) Subtrair");
		System.out.println("#3) Multiplicar");
		System.out.println("#4) Dividir");
		System.out.println("#5) Sair");
		System.out.println();
		System.out.print("Escolha uma opção: ");
		int opcao = Console.readInt();

		/*
		 * Se for inserido pelo usuário uma opção maior que a opção de sair ou
		 * menor que a opção de somar, será lançada uma exceção, pois essa opção
		 * não existirá.
		 */
		if (opcao > SAIR || opcao < SOMAR) {
			throw new FracaoException("Opcão Inválida");
		}
		return opcao;
	}
}
