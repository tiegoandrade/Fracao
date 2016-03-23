package etapas;

import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Criação da primeira fração.
		Base_Fracao f1 = new Base_Fracao();
		f1.definirValores(5, 2);
		
		// Criação da segunda fração.
		Base_Fracao f2 = new Base_Fracao();
		f2.definirValores(1, 7);
		
		// Atribuindo a uma terceira fração o retorno do método multiplicar.
		Base_Fracao f3 = f1.multiplicar(f2);
		
		// Saída de dados, apresentando a fração e o sua resolução.
		JOptionPane.showMessageDialog(null, f3.obterFracao());
		JOptionPane.showMessageDialog(null, f3.calcvalor());
	}

}
