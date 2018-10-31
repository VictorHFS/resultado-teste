package exercicio.cinco;

public class Texto {

    private final String texto;

    public Texto(String mensagem) {
        this.texto = mensagem;
    }

    public static Texto criar(String texto) throws TextoException {
        if(texto == null) throw new TextoException(TextoException.TEXTO_NULO);
        return new Texto(texto);
    }

    public int procurarOcorrencasDe(String mensagem) throws TextoException {
        if(mensagem == null) throw new TextoException(TextoException.MENSAGEM_NULA);
        String percorrido = texto;
        int ocorrencias = 0;
        int qntdCaracteres = mensagem.length();
        while(percorrido.contains(mensagem)) {
            ocorrencias++;
            int indice = percorrido.indexOf(mensagem);
            percorrido = percorrido.substring(indice + qntdCaracteres);
        }
        return ocorrencias;
    }
}
