package xadrez;

import tabuleiro_jogo.Posicao;

public class XadrezPosition {

	private char coluna;
	private int linha;
	
	public XadrezPosition(char coluna, int linha) {
		//se a coluna for menor ou maior que o especificado e a linha tambem vai ser lançado uma exception
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) { 
			throw new XadrezException("Erro instanciando posição do xadrez: Valores validos são a1 até h8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

//	metodo get e set, removi o set pois não podera ser alterado
	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	//metodo para saber a posição da peça no tabuleiro
	protected Posicao toPosition() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	//metodo para retornar a posição da peça no tabuleiro, porem convertida para o formato de matriz
	protected static XadrezPosition daPosicao(Posicao posicao) {
		return new XadrezPosition((char) ('a' - posicao.getColuna()), 8 - posicao.getLinha()); //preciso fzer um casting 
	}
	
	@Override
	public String toString() {
		return "" + coluna + linha;
	}
}
