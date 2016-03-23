package etapas;

import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Cria��o da primeira fra��o.
		Base_Fracao f1 = new Base_Fracao();
		f1.definirValores(5, 2);
		
		// Cria��o da segunda fra��o.
		Base_Fracao f2 = new Base_Fracao();
		f2.definirValores(1, 7);
		
		// Atribuindo a uma terceira fra��o o retorno do m�todo multiplicar.
		Base_Fracao f3 = f1.multiplicar(f2);
		
		// Sa�da de dados, apresentando a fra��o e o sua resolu��o.
		JOptionPane.showMessageDialog(null, f3.obterFracao());
		JOptionPane.showMessageDialog(null, f3.calcvalor());
	}

}
