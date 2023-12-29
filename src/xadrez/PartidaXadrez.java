package xadrez;

import tabuleiro_jogo.Peca;
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
	
	public XadrezPeca movimentoDePeca(XadrezPosition originPosition, XadrezPosition destinoPosition) {
		//converti as posições para Posição
		Posicao origin = originPosition.toPosition();
		Posicao destino = destinoPosition.toPosition();
		//verificar se a posição de origem havia uma peça
		validateOriginPosiçao(origin);
		Peca capturaPeca = fazerMover(origin, destino);
		return (XadrezPeca) capturaPeca;
	}
	
	private Peca fazerMover(Posicao origin, Posicao destino) {
		Peca p = tabuleiro.removePeca(origin); //variavel recebendo a ramoçao da peça de origem 
		Peca capturada = tabuleiro.removePeca(destino); //variavel recebendo a posição de destino
		tabuleiro.lugarPeca(p, destino); //e no tabuleiro a peça de origem vai receber o destino
		return capturada;
	}
	
	private void validateOriginPosiçao(Posicao posicao) {
		if (!tabuleiro.temPeca(posicao)) {
			throw new XadrezException("Nao ha posicao de origem."); 
		}
	}
	
	//metodo para mostrar as cordenadas mostrando as posições do xadrez
	public void umaNovaPeca(char coluna, int linha, XadrezPeca peca) {
		tabuleiro.lugarPeca(peca, new XadrezPosition(coluna, linha).toPosition());
	}
	
	//responsavel por iniciar a partida de xadrez colocando as peças no tabuleiro
	private void iniciarSetup() {
		umaNovaPeca('c', 1, new Torre(tabuleiro, Color.WHITE));
		umaNovaPeca('c', 2, new Torre(tabuleiro, Color.WHITE));
		umaNovaPeca('d', 2, new Torre(tabuleiro, Color.WHITE));
		umaNovaPeca('e', 2, new Torre(tabuleiro, Color.WHITE));
		umaNovaPeca('e', 1, new Torre(tabuleiro, Color.WHITE));
		umaNovaPeca('d', 1, new Rei(tabuleiro, Color.WHITE));

		umaNovaPeca('c', 7, new Torre(tabuleiro, Color.BLACK));
		umaNovaPeca('c', 8, new Torre(tabuleiro, Color.BLACK));
		umaNovaPeca('d', 7, new Torre(tabuleiro, Color.BLACK));
		umaNovaPeca('e', 7, new Torre(tabuleiro, Color.BLACK));
		umaNovaPeca('e', 8, new Torre(tabuleiro, Color.BLACK));
		umaNovaPeca('d', 8, new Rei(tabuleiro, Color.BLACK));
	}	
}
