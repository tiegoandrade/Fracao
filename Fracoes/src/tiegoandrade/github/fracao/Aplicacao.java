package tiegoandrade.github.fracao;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Criação da primeira fração.
		BaseFracao f1 = new BaseFracao(5, 2);
		
		// Criação da segunda fração.
		BaseFracao f2 = new BaseFracao(1, 7);
		
		// Atribuindo a uma terceira fração o retorno do método multiplicar.
		BaseFracao f3 = f1.multiplicar(f2);
		
		// Saída de dados, apresentando a fração e o sua resolução.
		System.out.println("O resultado da multiplicação entre " + f1 + " e " + f2 + " é "+ f3);
		System.out.println("A resolução da fração " + f3 + " é " + f3.calcvalor());
	}

}
