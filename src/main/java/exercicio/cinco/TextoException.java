package exercicio.cinco;

public class TextoException  extends Exception{
    public static final String MENSAGEM_NULA = "Foi informado uma mensagem nula.";
    public static final String TEXTO_NULO = "Foi informado um texto nulo.";

    public TextoException(String mensagem) {
        super(mensagem);
    }
}
