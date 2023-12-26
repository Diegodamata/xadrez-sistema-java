package application;

import xadrez.XadrezPeca;

public class UI { //UI user interface

	//metodo para mostrar o tabuleiro
	//static pois é um metodo estatico
	public static void mostrarTabuleiro(XadrezPeca[][] pecas) {
		
		for(int i=0; i<pecas.length; i++) {
			System.out.print((8 - i) + " "); //para mostrar o numero das linhas
			for (int j=0; j<pecas.length; j++) {
				mostrarPeca(pecas[i][j]); 
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h"); //para mostrar a posição das colunas
	}
	
	//metodo para imprimir apenas uma peça
	public static void mostrarPeca(XadrezPeca peca) {
		
		if(peca == null) { //se a peça igual a nulo quer dizer que não tem peça nenhuma na posição do tabuleiro 
			System.out.print("-");
		}
		else { //se ouver peça nessa posiçao do tabuleiro ira imprimir
			System.out.print(peca);
		}
		System.out.print(" "); //um espaço para separar uma peça da outra
	}
}
