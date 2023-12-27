package tabuleiro_jogo;

public class Tabuleiro {

	//um tabuleiro tem linhas e colunas
	private int linhas;
	private int colunas;
	private Peca[][] pecas; //e criei uma matriz para percorrer linhas e colunas
	
	//constructor com linhas e colunas 
	public Tabuleiro(int linhas, int colunas) {
		//se a quantidade de linhas e colunas for menor do que 1 não faz sentido criar o tabuleiro, entao vou lançar uma exception
		if (linhas < 1 || colunas < 1) {
			throw new TabuleiroException("Erro criando o tabuleiro: é necessário que hàja 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas]; //e essa matriz vai ser instanciada com a quantidade de linhas e colunas que o usuario informou
	}

	//getters retirei os setters pois apos criadas as linhas e colunas não podera ser acessadas 
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	//um metodo do tipo peça para retornar as linhas e colunas
	public Peca peca(int linha, int coluna) {
		if(!positionExiste(linha, coluna)) { //se a posição não existe vou lançar outra exception
			throw new TabuleiroException("Posição não tem no tabuleiro");
		}
		return pecas[linha][coluna];
	}
	
	//e uma sobrecarga para retornar a posição
	public Peca peca(Posicao posicao) {
		if(!positionExiste(posicao)) { //se a posição não existe vou lançar outra exception
			throw new TabuleiroException("Posição não tem no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()]; //esse metodo vai retornar a posição da peça
	}	
	
	//metodo para saber o lugar que está a peça
	public void lugarPeca(Peca peca, Posicao posicao) {
		if (temPeca(posicao)) {
			throw new TabuleiroException("Já existe peça nessa posição " + posicao);
		}
		//na matriz na posição informada vai receber a peça
		pecas[posicao.getLinha()][posicao.getColuna()] = peca; //percorendo a matriz pecas e na posição da linha e da coluna, vai receber a peça
		//a posição não vai ser mais nulla 
		peca.posicao = posicao; //na classe pessa na posição sera atribuido o valor que eu informar como posição, como é protected e esta no mesmo pacote pode acessar normal
	}
	
	//metodo auxiliar para retornar se esta dentro da posição do tabuleiro
	private boolean positionExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;
	}
	
	public boolean positionExiste(Posicao posicao) {
		return positionExiste(posicao.getLinha(), posicao.getColuna()); //apriveitei o metodo auxiliar de cima passando a posição da linha e da coluna 
	}
	
	//metodo para saber se tem alguma peça em uma determinada posição do tabuleiro 
	public boolean temPeca(Posicao posicao) {
		if(!positionExiste(posicao)) { //se a posição não existe vou lançar outra exception
			throw new TabuleiroException("Posição não tem no tabuleiro");
		}
		return peca(posicao) != null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
