package view;

import javax.swing.JOptionPane;

import br.edu.fatec.zl.Fila;
import controller.ImpressoraController;

public class Principal {

	public static void main(String[] args) {
		Fila<String> fila = new Fila<String>();
		ImpressoraController ic = new ImpressoraController();
		int c = 0;
		String documento = "";
		
		do{
			c = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para adicionar um valor a fila de impressão. DIgite 2 para Imprimir e 0 para sair"));
			
			switch (c) {
			case 1:
				documento = JOptionPane.showInputDialog("Insira o nome do documento.");
				ic.ValidaDocumento(fila, documento);
				break;
			case 2:
				ic.ImprimeDocumento(fila);
				break;
			case 0:
				System.out.println("Finalizando");
				break;
			default:
				System.err.println("Valor Inválido");
				break;
			}
		}while(c!=0);

	}

}
