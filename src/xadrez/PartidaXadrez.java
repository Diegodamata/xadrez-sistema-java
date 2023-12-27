package xadrez;

import tabuleiro_jogo.Posicao;
import tabuleiro_jogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	//uma partida de xadrez tem que ter um tabuleiro de xadrez
	private Tabuleiro tabuleiro;
	
	//cunstrutor da partida de xadrez
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8); //quem tem que sber a dimensão de um tabuleiro de xadrez é a classe partida de xadrez, aqui informo que ela é 8 por 8
		iniciarSetup(); //preciso chamar o metodo para iniciar a partida no constructor da partida
	}
	 
	//metodo do tipo XadrezPeca
	//esse metodo precisa retornar uma matriz de peças de xadrez correspondente a essa partida
	//essa peça de xadrez é o que o programa vai enxergar, vai ser a peça que esta no tabuleiro
	//agora a classe Peça ela é uma peça em si
	//então preciso fazer uma matriz para o programa
	public XadrezPeca[][] getPecas(){
		XadrezPeca[][] mat = new XadrezPeca[tabuleiro.getLinhas()][tabuleiro.getColunas()]; //variavel auxiliar, recebendo uma instancia, com a quantidade de linhas e colunas do tabuleiro
		
		//preciso percorrer essa matriz
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (XadrezPeca) tabuleiro.peca(i, j); //mat na linha i e coluna j recebe o tabuleiro acessando peca passando i e j como argumento, preciso fazer um casting para XadrezPeca, ai sera interpretado como peça de xadrez e não como uma peça comum 
			}
		}
		return mat;
	}
	
	//responsavel por iniciar a partida de xadrez colocando as peças no tabuleiro
	private void iniciarSetup() {
		tabuleiro.lugarPeca(new Torre(tabuleiro, Color.WHITE), new Posicao(2, 1));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Color.BLACK), new Posicao(0, 4));
		tabuleiro.lugarPeca(new Rei(tabuleiro, Color.WHITE), new Posicao(7, 4));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
