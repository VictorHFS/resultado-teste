package exercicio.tres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Troco {
	private static final List<Nota> notasDiponiveis =
		Arrays.asList(
		new Nota[]{
			Nota.criar(100), 
			Nota.criar(50), 
			Nota.criar(20), 
			Nota.criar(10), 
			Nota.criar(5), 
			Nota.criar(2)});
      
	public List<Nota> buscarTroco(Integer valor) {
		List<Nota> troco = new ArrayList<>();
		for(Nota nota: notasDiponiveis) {
			if(nota.ehMenor(valor)) {
				troco.add(nota);
				valor -= nota.getValor();
			}
		}
		return troco;
	}
}
