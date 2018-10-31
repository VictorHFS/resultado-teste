package exercicio.dois;

public class Escada {
    private int degrais;

    public Escada(int degrais) throws EscadaException {
        if (degrais < 2) {
            throw new EscadaException(EscadaException.VALOR_MENOR_QUE_DOIS);
        }
        this.degrais = degrais;
    }

    @Override
    public String toString() {
        int degrais = 0;
        StringBuilder resultado = new StringBuilder();
        DegrauBuilder builder = new DegrauBuilder(this.degrais);
        while((degrais++) < this.degrais) {
            resultado.append(
                    builder.criar(degrais));
            resultado.append("\n");
        }
        return resultado.toString();
    }
}
