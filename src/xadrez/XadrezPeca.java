package xadrez;

import tabuleiro_jogo.Peca;
import tabuleiro_jogo.Tabuleiro;

public class XadrezPeca extends Peca { // a classe XadrezPeça extends da classe Peça

	private Color color;

	//como essa classe é uma subclasse da classe peça, preciso colocar um construtor
	//
	public XadrezPeca(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);//super passa a chamada do constructor da superclasse
		this.color = color;
	}

	//apenas o get pois a cor não pode ser alterada só acessada
	public Color getColor() {
		return color;
	}
}
