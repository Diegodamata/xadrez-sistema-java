package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.Color;
import xadrez.XadrezPeca;
import xadrez.XadrezPosition;

public class UI { // UI user interface

	// https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	// são codigos especiais para imprimir o projeto com cores
	// cores do texto
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	//cores do fundo
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
	
	// https://stackoverflow.com/questions/2979383/java-clear-the-console
	//metodo para limpar a tela
	public static void clearScreen() { 
		 System.out.print("\033[H\033[2J"); 
		 System.out.flush(); 
	} 

	
	public static XadrezPosition lerPositionXadrez(Scanner sc) {
		try {
			String s = sc.nextLine(); //eu li a posição da peça no tabuleiro, ex. a1 a2 b1 b2...
			char coluna = s.charAt(0); //criei uma variavel do tipo char e atribui a ela s primeira posição da variavel s 
			int linha = Integer.parseInt(s.substring(1)); //variavel linha, vai ser atribuida a ela a variavel s a partar da posição 1
			return new XadrezPosition(coluna, linha);
		}
		catch(RuntimeException e) {
			throw new InputMismatchException("Erro instanciando posicao do xadrez: Valores validos sao a1 ate h8."); //exceção de erro de entrada de dados
		}
	} 

	// metodo para mostrar o tabuleiro
	// static pois é um metodo estatico
	public static void mostrarTabuleiro(XadrezPeca[][] pecas) {

		for (int i = 0; i < pecas.length; i++) {
			System.out.print((8 - i) + " "); // para mostrar o numero das linhas
			for (int j = 0; j < pecas.length; j++) {
				printPiece(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h"); // para mostrar a posição das colunas
	}

	// metodo para imprimir apenas uma peça
	private static void printPiece(XadrezPeca piece) {
    	if (piece == null) {
            System.out.print("-");
        }
        else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print(ANSI_WHITE + piece + ANSI_RESET);
            }
            else {
                System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");
	}
}
