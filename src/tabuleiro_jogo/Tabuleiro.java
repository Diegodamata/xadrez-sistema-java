package tabuleiro_jogo;

public class Tabuleiro {

	//um tabuleiro tem linhas e colunas
	private int linhas;
	private int colunas;
	private Peca[][] peca; //e criei uma matriz para percorrer linhas e colunas
	
	//constructor com linhas e colunas 
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		peca = new Peca[linhas][colunas]; //e essa matriz vai ser instanciada com a quantidade de linhas e colunas que o usuario informou
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
}
