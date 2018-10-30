package exercicio;

import java.util.ArrayList;
import java.util.List;

public class ManipuladorDeLista {
    public Integer buscarPrimeiroValorDuplicado(List<Integer> valores) throws ListaException {
        List<Integer> valoresEncontrados = new ArrayList<Integer>();
        if(valores == null) throw new ListaException(ListaException.VALOR_NULO);
        if(valores.isEmpty()) throw new ListaException(ListaException.LISTA_VAZIA);
            for(Integer valor: valores) {
                if(valor <= 0) throw new ListaException(ListaException.VALOR_INVALIDO);
                if(valoresEncontrados.contains(valor)) {
                    return valor;
                }
                valoresEncontrados.add(valor);
            }
        return -1;
    }
}
