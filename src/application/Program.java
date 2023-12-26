package application;

import xadrez.PartidaXadrez;

public class Program {

	public static void main(String[] args) {
		
		PartidaXadrez part = new PartidaXadrez();
		UI.mostrarTabuleiro(part.getPecas());
	}

}
