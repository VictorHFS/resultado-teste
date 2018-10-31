package exercicio.quatro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Troco {
	private static final List<Nota> notasDisponiveis =
		Arrays.asList(
		new Nota[]{
			Nota.criar(100), 
			Nota.criar(50), 
			Nota.criar(20), 
			Nota.criar(10), 
			Nota.criar(5), 
			Nota.criar(2)});

	public static Troco criar() {
		return new Troco();
	}

	public Notas buscarTroco(Integer valor) throws TrocoException {
	    if(valor < 0) throw new TrocoException(TrocoException.VALOR_NEGATIVO);
		Notas troco = Notas.criar();
		for(Nota nota: notasDisponiveis) {
			while(nota.ehMenor(valor)) {
				troco.add(nota);
				valor -= nota.getValor();
			}
		}
		if(valor != 0) {
		    throw new TrocoException(TrocoException.TROCO_NAO_ENCONTRADO);
        }
		return troco;
	}
}
