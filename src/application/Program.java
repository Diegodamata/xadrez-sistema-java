package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.PartidaXadrez;
import xadrez.XadrezException;
import xadrez.XadrezPeca;
import xadrez.XadrezPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PartidaXadrez part = new PartidaXadrez();
		
		while (true) {
			try {
				UI.clearScreen();
				UI.mostrarTabuleiro(part.getPecas());
				System.out.println();
				System.out.print("Origem: ");
				XadrezPosition origem = UI.lerPositionXadrez(sc);
				
				System.out.println();
				System.out.print("Destino: ");
				XadrezPosition destino = UI.lerPositionXadrez(sc);	
				
				XadrezPeca capturaPeca = part.movimentoDePeca(origem, destino);
			}
			catch(XadrezException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		
	}

}
