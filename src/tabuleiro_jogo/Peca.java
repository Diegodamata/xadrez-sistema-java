package tabuleiro_jogo;

//e quando um metodo é abstrato a classe precisa ser abstrata tambem
public abstract class Peca {

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
	
	//metodo abstrato pois a classe peça é generica demais para retornar um movimento de uma peça, pois tem peças diferentes
	public abstract boolean[][] possiveisMovimentos();
	
	//metodo concreto que ele utiliza o metodo abstrato, ele chama uma possivel implementação de uma sub classe concreta da subclasse Peca
	//tem padrão de projetos que é muito utilizados é chamado de templete metodo, consegue fornecer uma implementação padrao de um metodo que depende de um metodo abstrato
	public boolean possivelMovimento(Posicao posicao) {
		return possiveisMovimentos()[posicao.getLinha()][posicao.getColuna()];
	}
	
	//metodo que retorna possivel movimento, se ele não esta trancado 
	//se da para andar para o lado ou para frente
	//mais uma implementação concreta que precisa usar o metodo abstrato
	public boolean existeAlgumMoviPossivel() {
		boolean[][] mat = possiveisMovimentos();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if(mat[i][j]) { //se a posição da matriz for verdadeiro quer dizer que da para se movimentar
					return true;
				}
			}
		}
		return false;
	}
}
