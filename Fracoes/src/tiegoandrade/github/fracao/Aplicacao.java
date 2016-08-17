package tiegoandrade.github.fracao;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Cria��o da primeira fra��o.
		BaseFracao f1 = new BaseFracao(5, 2);
		
		// Cria��o da segunda fra��o.
		BaseFracao f2 = new BaseFracao(1, 7);
		
		// Atribuindo a uma terceira fra��o o retorno do m�todo multiplicar.
		BaseFracao f3 = f1.multiplicar(f2);
		
		// Sa�da de dados, apresentando a fra��o e o sua resolu��o.
		System.out.println("O resultado da multiplica��o entre " + f1 + " e " + f2 + " � "+ f3);
		System.out.println("A resolu��o da fra��o " + f3 + " � " + f3.calcvalor());
	}

}
