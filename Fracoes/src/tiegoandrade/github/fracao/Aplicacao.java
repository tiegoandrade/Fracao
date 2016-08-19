package tiegoandrade.github.fracao;

import java.io.IOException;
import java.util.Scanner;

/**
 * Classe que possibilita a interação do usuário com o programa.
 * 
 * @version 1.0 18-08-2016
 * @author Tiego
 *
 */
public class Aplicacao {

	/**
	 * Menu de opções.
	 */
	private Menu menu;

	/**
	 * Inicia a aplicação
	 * 
	 * @throws IOException
	 *             Lançado caso ocorra um erro na entrada de dados feita pelo
	 *             usuário.
	 */
	public void iniciar() throws IOException {
		menu = new Menu();

		// Armazena a opção que o usuário irá digitar.
		int opcao = 0;

		/*
		 * Laço que será executado enquanto não for selecionado a opção de sair
		 * pelo usuário.
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
		System.out.println("Fim da aplicação!");
	}

	/**
	 * Realiza a soma entre duas frações.
	 */
	public void somar() {
		System.out.print("Insira a primeira fração da operação:");

		// Variável que recebe a entrada do usuário.
		String fracao1 = Console.readString();

		/* 
		 * Objeto que recebe a fração e distribui seus valores para os devidos
		 * atributos.
		 */
		Scanner scanner1 = new Scanner(fracao1);
		scanner1.useDelimiter("/");
		int numerador1 = scanner1.nextInt();
		int denominador1 = scanner1.nextInt();
		scanner1.close();
		
		System.out.print("Insira a Segunda fração da operação:");
		String fracao2 = Console.readString();
		Scanner scanner2 = new Scanner(fracao2);
		scanner2.useDelimiter("/");
		int numerador2 = scanner2.nextInt();
		int denominador2 = scanner2.nextInt();
		scanner2.close();
		
		// Cria as frações e realiza o cálculo.
		BaseFracao fracobj1 = new BaseFracao(numerador1, denominador1);
		BaseFracao fracobj2 = new BaseFracao(numerador2, denominador2);
		BaseFracao result = fracobj1.adicao(fracobj2);
		System.out.println("O resultado da operação " + fracao1 + " + "
				+ fracao2 + " é " + result);
	}
	
	/**
	 * Realiza a subtração entre duas frações.
	 */
	public void subtrair() {
		System.out.print("Insira a primeira fração da operação:");
		String fracao1 = Console.readString();
		Scanner scanner1 = new Scanner(fracao1);
		scanner1.useDelimiter("/");
		int numerador1 = scanner1.nextInt();
		int denominador1 = scanner1.nextInt();
		scanner1.close();
		
		System.out.print("Insira a Segunda fração da operação:");
		String fracao2 = Console.readString();
		Scanner scanner2 = new Scanner(fracao2);
		scanner2.useDelimiter("/");
		int numerador2 = scanner2.nextInt();
		int denominador2 = scanner2.nextInt();
		scanner2.close();
		
		BaseFracao fracobj1 = new BaseFracao(numerador1, denominador1);
		BaseFracao fracobj2 = new BaseFracao(numerador2, denominador2);
		BaseFracao result = fracobj1.subtracao(fracobj2);
		System.out.println("O resultado da operação " + fracao1 + " - "
				+ fracao2 + " é " + result);
	}
	
	/**
	 * Realiza a multiplicação entre duas frações.
	 */
	public void multiplicar() {
		System.out.print("Insira a primeira fração da operação:");
		String fracao1 = Console.readString();
		Scanner scanner1 = new Scanner(fracao1);
		scanner1.useDelimiter("/");
		int numerador1 = scanner1.nextInt();
		int denominador1 = scanner1.nextInt();
		scanner1.close();
		
		System.out.print("Insira a Segunda fração da operação:");
		String fracao2 = Console.readString();
		Scanner scanner2 = new Scanner(fracao2);
		scanner2.useDelimiter("/");
		int numerador2 = scanner2.nextInt();
		int denominador2 = scanner2.nextInt();
		scanner2.close();
		
		BaseFracao fracobj1 = new BaseFracao(numerador1, denominador1);
		BaseFracao fracobj2 = new BaseFracao(numerador2, denominador2);
		BaseFracao result = fracobj1.multiplicar(fracobj2);
		System.out.println("O resultado da operação " + fracao1 + " x "
				+ fracao2 + " é " + result);
	}
	
	/** 
	 * Realiza a divisão entre duas frações.
	 */
	public void dividir() {
		System.out.print("Insira a primeira fração da operação:");
		String fracao1 = Console.readString();
		Scanner scanner1 = new Scanner(fracao1);
		scanner1.useDelimiter("/");
		int numerador1 = scanner1.nextInt();
		int denominador1 = scanner1.nextInt();
		scanner1.close();
		
		System.out.print("Insira a Segunda fração da operação:");
		String fracao2 = Console.readString();
		Scanner scanner2 = new Scanner(fracao2);
		scanner2.useDelimiter("/");
		int numerador2 = scanner2.nextInt();
		int denominador2 = scanner2.nextInt();
		scanner2.close();
		
		BaseFracao fracobj1 = new BaseFracao(numerador1, denominador1);
		BaseFracao fracobj2 = new BaseFracao(numerador2, denominador2);
		BaseFracao result = fracobj1.dividir(fracobj2);
		System.out.println("O resultado da operação " + fracao1 + " : "
				+ fracao2 + " é " + result);
	}
}
