package tiegoandrade.github.fracao;

/**
 * Classe que representa o menu da aplica��o
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Menu {

	/** A op��o 1 � utilizada para somar duas fra��es. */
	public static final int SOMAR = 1;

	/** A op��o 2 � utilizada para subtrair duas fra��es. */
	public static final int SUBTRAIR = 2;

	/** A op��o 3 � utilizada para multiplicar duas fra��es. */
	public static final int MULTIPLICAR = 3;

	/** A op��o 4 � utilizada para dividir duas fra��es. */
	public static final int DIVIDIR = 4;

	/** A op��o 5 � utilizada para sair da aplica��o. */
	public static final int SAIR = 5;

	/**
	 * M�todo que exiibe o menu de op��es.
	 *
	 * @return A op��o selecionada.
	 * 
	 * @throws FracaoException
	 *             Lan�ada caso seja selecionado uma op��o que n�o existe.
	 */
	public int exibirOpcoes() throws FracaoException {
		System.out.println("---- MENU DE OP��ES ----");
		System.out.println("#1) Somar");
		System.out.println("#2) Subtrair");
		System.out.println("#3) Multiplicar");
		System.out.println("#4) Dividir");
		System.out.println("#5) Sair");
		System.out.println();
		System.out.print("Escolha uma op��o: ");
		int opcao = Console.readInt();

		/*
		 * Se for inserido pelo usu�rio uma op��o maior que a op��o de sair ou
		 * menor que a op��o de somar, ser� lan�ada uma exce��o, pois essa op��o
		 * n�o existir�.
		 */
		if (opcao > SAIR || opcao < SOMAR) {
			throw new FracaoException("Opc�o Inv�lida");
		}
		return opcao;
	}
}
