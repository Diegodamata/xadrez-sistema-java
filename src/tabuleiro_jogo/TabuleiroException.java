package tabuleiro_jogo;

//exceção para mostrar uma msg na tela caso tenha algum erro
public class TabuleiroException extends RuntimeException {
	private static final long serialVersionUID = 1L; //versão

	//constructor recendo uma string
	public TabuleiroException(String msg) {
		super(msg); //e passando esse argumento ao constructor da super classe que é RuntimeException
	}
}
