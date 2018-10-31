package exercicio.tres;

public class TrocoException extends Exception{
	public static final String VALOR_NEGATIVO= "O valor informado é inferior a zero.";
	public TrocoException(String mensagem) {
		super(mensagem);
	}
}
