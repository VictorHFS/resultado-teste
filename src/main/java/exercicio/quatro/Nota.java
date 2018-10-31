package exercicio.quatro;

import java.util.Objects;

public class Nota {
	private final Integer valor;
	public Nota(Integer valor) {
		this.valor = valor;
	}

	public static Nota criar(int i) {return new Nota(i);}

	public boolean ehMenor(Integer outro) {
		return valor <= outro;
	}

	public Integer getValor() {
		return this.valor;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Nota nota = (Nota) o;
		return Objects.equals(valor, nota.valor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}
}
