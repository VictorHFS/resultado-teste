package exercicio.dois;

public class EscadaException extends Exception {
    public static final String VALOR_MENOR_QUE_DOIS = "Foi informado menos de dois degrais.";
    public EscadaException(String mensagem) {
        super(mensagem);
    }
}
