package xadrez.pecas;

import tabuleiro_jogo.Tabuleiro;
import xadrez.Color;
import xadrez.XadrezPeca;

public class Rei extends XadrezPeca {

	public Rei(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}

	@Override
	public String toString() { //vai retornar a letra R de Rei
		return "R";
	}

	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return mat;
	}
}
