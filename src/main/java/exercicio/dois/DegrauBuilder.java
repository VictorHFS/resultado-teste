package exercicio.dois;

public class DegrauBuilder {
    public static final String VAZIO = " ";
    public static final String ASTERISCO = "#";
    private final int degrais;

    public DegrauBuilder(int degrais) {
        this.degrais = degrais;
    }

    public String criar(int degrau) {
        StringBuilder resultado = new StringBuilder();
        int vazio = this.degrais - degrau;
        resultado.append(
                getVazios(vazio));
        resultado.append(
                getPreenchidos(degrau));
        return resultado.toString();
    }

    private StringBuilder getVazios(int vazio) {
        StringBuilder vazios = new StringBuilder();
        while(vazio-- > 0) {
            vazios.append(VAZIO);
        }
        return vazios;
    }

    private StringBuilder getPreenchidos(int preenchido) {
        StringBuilder preenchidos = new StringBuilder();
        while(preenchido-- > 0) {
            preenchidos.append(ASTERISCO);
        }
        return preenchidos;
    }
}
