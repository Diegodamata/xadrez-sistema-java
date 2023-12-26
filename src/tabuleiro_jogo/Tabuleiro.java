package tabuleiro_jogo;

public class Tabuleiro {

	//um tabuleiro tem linhas e colunas
	private int linhas;
	private int colunas;
	private Peca[][] pecas; //e criei uma matriz para percorrer linhas e colunas
	
	//constructor com linhas e colunas 
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; //e essa matriz vai ser instanciada com a quantidade de linhas e colunas que o usuario informou
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
	//um metodo do tipo peça para retornar as linhas e colunas
	public Peca peca(int linha, int coluna) {
		return pecas[linha][coluna];
	}
	
	//e uma sobrecarga para retornar a posição
	public Peca peca(Posicao posicao) {
		return pecas[posicao.getLinha()][posicao.getColuna()]; //esse metodo vai retornar a posição da peça
	}	
	
}
