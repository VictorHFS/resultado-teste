package exercicio.tres;

public class ListaException extends Exception {
    public static final String LISTA_VAZIA = "A lista informada está vazia.";

    public ListaException(String mensagem) {
        super(mensagem);
    }
}
