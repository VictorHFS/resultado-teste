public class TrocoException extends Exception{
	public static final VALOR_NEGATIVO= "O valor informado é inferior a zero.";
	public TrocoException(Strinv mensagem) {
		super(mensagem);
	}
}
