package exercicio.um;

public class ListaException extends Exception {

    public static final String VALOR_INVALIDO = "Um valor inválido foi informado na lista.";
    public static final String LISTA_VAZIA = "A lista esta vazia.";
    public static final String VALOR_NULO = "Valor nulo foi encontrado.";

    public ListaException(String mensagem) {
        super(mensagem);
    }
}
