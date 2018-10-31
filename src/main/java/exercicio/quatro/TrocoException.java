package exercicio.quatro;

public class TrocoException extends Exception{
	public static final String VALOR_NEGATIVO= "O valor informado é inferior a zero.";
	public static final String TROCO_NAO_ENCONTRADO = "Não foi encontrado um troco referente ao valor informado.";

    public TrocoException(String mensagem) {
		super(mensagem);
	}
}
