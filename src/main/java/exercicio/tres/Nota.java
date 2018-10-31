package exercicio.tres;

public class Nota {
	private final Integer valor;
	public Nota(Integer valor) {
		this.valor = valor;
	}

	public static Nota criar(int i) { return new Nota(i);}

	public boolean ehMenor(Integer outro) {
		return valor <= outro;
	}

	public Integer getValor() {
		return this.valor;
	}
}
