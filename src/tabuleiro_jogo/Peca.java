package tabuleiro_jogo;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	//constructor com o argumento tabuleiro, a posição precisa iniciar vazia
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	//apenas o get pois o tabuleiro não pode ser alterado
	//protected somente a propria classe e uma sub classe pode ter acesso
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
