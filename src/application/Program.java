package application;

import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.XadrezPeca;
import xadrez.XadrezPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaXadrez part = new PartidaXadrez();
		
		while(true) {
			UI.mostrarTabuleiro(part.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			XadrezPosition origem = UI.lerPositionXadrez(sc);
			
			System.out.println();
			System.out.print("Destino: ");
			XadrezPosition destino = UI.lerPositionXadrez(sc);
			
			XadrezPeca capturaPeca = part.movimentoDePeca(origem, destino);
		}
		
	}

}
