package tiegoandrade.github.fracao;

import java.io.IOException;
import java.util.Scanner;

/**
 * Classe que possibilita a intera��o do usu�rio com o programa.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Aplicacao {

	/**
	 * Menu de op��es.
	 */
	private Menu menu;

	/**
	 * Inicia a aplica��o
	 * 
	 * @throws IOException
	 *             Lan�ado caso ocorra um erro na entrada de dados feita pelo
	 *             usu�rio.
	 */
	public void iniciar() throws IOException {
		menu = new Menu();

		// Armazena a op��o que o usu�rio ir� digitar.
		int opcao = 0;

		/*
		 * La�o que ser� executado enquanto n�o for selecionado a op��o de sair
		 * pelo usu�rio.
		 */
		while (opcao != Menu.SAIR) {
			try {
				opcao = menu.exibirOpcoes();

				switch (opcao) {
				case Menu.SOMAR:
					somar();
					break;

				case Menu.SUBTRAIR:
					subtrair();
					break;

				case Menu.MULTIPLICAR:
					multiplicar();
					break;

				case Menu.DIVIDIR:
					dividir();
					break;
				}
			} catch (FracaoException e) {
				System.out.println("Erro: " + e.getMessage());
				System.out.println();
			}
		}
		System.out.println("Fim da aplica��o!");
	}

	/**
	 * Realiza a soma entre duas fra��es.
	 */
	public void somar() {
		System.out.print("Insira a primeira fra��o da opera��o:");

		// Vari�vel que recebe a entrada do usu�rio.
		String fracao1 = Console.readString();

		/* 
		 * Objeto que recebe a fra��o e distribui seus valores para os devidos
		 * atributos.
		 */
		Scanner scanner1 = new Scanner(fracao1);
		scanner1.useDelimiter("/");
		int numerador1 = scanner1.nextInt();
		int denominador1 = scanner1.nextInt();
		scanner1.close();
		
		System.out.print("Insira a Segunda fra��o da opera��o:");
		String fracao2 = Console.readString();
		Scanner scanner2 = new Scanner(fracao2);
		scanner2.useDelimiter("/");
		int numerador2 = scanner2.nextInt();
		int denominador2 = scanner2.nextInt();
		scanner2.close();
		
		// Cria as fra��es e realiza o c�lculo.
		BaseFracao fracobj1 = new BaseFracao(numerador1, denominador1);
		BaseFracao fracobj2 = new BaseFracao(numerador2, denominador2);
		BaseFracao result = fracobj1.adicao(fracobj2);
		System.out.println("O resultado da opera��o " + fracao1 + " + "
				+ fracao2 + " � " + result);
	}
	
	/**
	 * Realiza a subtra��o entre duas fra��es.
	 */
	public void subtrair() {
		System.out.print("Insira a primeira fra��o da opera��o:");
		String fracao1 = Console.readString();
		Scanner scanner1 = new Scanner(fracao1);
		scanner1.useDelimiter("/");
		int numerador1 = scanner1.nextInt();
		int denominador1 = scanner1.nextInt();
		scanner1.close();
		
		System.out.print("Insira a Segunda fra��o da opera��o:");
		String fracao2 = Console.readString();
		Scanner scanner2 = new Scanner(fracao2);
		scanner2.useDelimiter("/");
		int numerador2 = scanner2.nextInt();
		int denominador2 = scanner2.nextInt();
		scanner2.close();
		
		BaseFracao fracobj1 = new BaseFracao(numerador1, denominador1);
		BaseFracao fracobj2 = new BaseFracao(numerador2, denominador2);
		BaseFracao result = fracobj1.subtracao(fracobj2);
		System.out.println("O resultado da opera��o " + fracao1 + " - "
				+ fracao2 + " � " + result);
	}
	
	/**
	 * Realiza a multiplica��o entre duas fra��es.
	 */
	public void multiplicar() {
		System.out.print("Insira a primeira fra��o da opera��o:");
		String fracao1 = Console.readString();
		Scanner scanner1 = new Scanner(fracao1);
		scanner1.useDelimiter("/");
		int numerador1 = scanner1.nextInt();
		int denominador1 = scanner1.nextInt();
		scanner1.close();
		
		System.out.print("Insira a Segunda fra��o da opera��o:");
		String fracao2 = Console.readString();
		Scanner scanner2 = new Scanner(fracao2);
		scanner2.useDelimiter("/");
		int numerador2 = scanner2.nextInt();
		int denominador2 = scanner2.nextInt();
		scanner2.close();
		
		BaseFracao fracobj1 = new BaseFracao(numerador1, denominador1);
		BaseFracao fracobj2 = new BaseFracao(numerador2, denominador2);
		BaseFracao result = fracobj1.multiplicar(fracobj2);
		System.out.println("O resultado da opera��o " + fracao1 + " x "
				+ fracao2 + " � " + result);
	}
	
	/** 
	 * Realiza a divis�o entre duas fra��es.
	 */
	public void dividir() {
		System.out.print("Insira a primeira fra��o da opera��o:");
		String fracao1 = Console.readString();
		Scanner scanner1 = new Scanner(fracao1);
		scanner1.useDelimiter("/");
		int numerador1 = scanner1.nextInt();
		int denominador1 = scanner1.nextInt();
		scanner1.close();
		
		System.out.print("Insira a Segunda fra��o da opera��o:");
		String fracao2 = Console.readString();
		Scanner scanner2 = new Scanner(fracao2);
		scanner2.useDelimiter("/");
		int numerador2 = scanner2.nextInt();
		int denominador2 = scanner2.nextInt();
		scanner2.close();
		
		BaseFracao fracobj1 = new BaseFracao(numerador1, denominador1);
		BaseFracao fracobj2 = new BaseFracao(numerador2, denominador2);
		BaseFracao result = fracobj1.dividir(fracobj2);
		System.out.println("O resultado da opera��o " + fracao1 + " : "
				+ fracao2 + " � " + result);
	}
}
