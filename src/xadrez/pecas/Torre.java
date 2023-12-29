package xadrez.pecas;

import tabuleiro_jogo.Tabuleiro;
import xadrez.Color;
import xadrez.XadrezPeca;

public class Torre extends XadrezPeca{ //classe torre extends da classe XadrezPeca

	public Torre(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro, color);
	}
	
	@Override
	public String toString() { //toString para retornar a primeira letra da peça que é Torre
		return "T";
	}
	
	@Override
	public boolean[][] possiveisMovimentos() {
		boolean[][] mat = new boolean[getTabuleiro().getLinhas()][getTabuleiro().getColunas()];
		return mat;
	}
	
}
