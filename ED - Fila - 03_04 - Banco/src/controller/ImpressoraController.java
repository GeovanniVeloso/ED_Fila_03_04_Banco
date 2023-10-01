package controller;

import br.edu.fatec.zl.Fila;

public class ImpressoraController {

	public ImpressoraController() {
		super();
	}
	
	public void ValidaDocumento(Fila<String> f, String doc) {
		if(doc.contains(" - Arquivo:")) {
			InsereDocumento(f, doc);
		}else {
			System.err.println("Documento Inválido");
		}
	}
	
	private void InsereDocumento(Fila<String> f, String doc) {
		f.insert(doc);
	}
	
	public void ImprimeDocumento(Fila<String> f) {
		int random;
		if(!f.isEmpty()) {
			while(!f.isEmpty()) {
				random = (int)((Math.random()*1001)+1000);
				try {
					Thread.sleep(random);
					System.out.println("O documento "+f.remove()+" foi impresso");
				} catch (InterruptedException e) {
					System.err.println(e);
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}else {
			System.err.println("Fila Vazia");
		}
	}

}
