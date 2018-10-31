package exercicio.um;

import java.util.ArrayList;
import java.util.List;

public class ManipuladorDeLista {
    public Integer buscarPrimeiroValorDuplicado(List<Integer> valores) throws ListaException {
        List<Integer> valoresEncontrados = new ArrayList<Integer>();
        validarLista(valores);
        for(Integer valor: valores) {
            validarValor(valor);
            if(valoresEncontrados.contains(valor)) {
                return valor;
            }
            valoresEncontrados.add(valor);
        }
        return -1;
    }

    private void validarValor(Integer valor) throws ListaException {
        if(valor <= 0) throw new ListaException(ListaException.VALOR_INVALIDO);
    }

    private void validarLista(List<Integer> valores) throws ListaException {
        if(valores == null) throw new ListaException(ListaException.VALOR_NULO);
        if(valores.isEmpty()) throw new ListaException(ListaException.LISTA_VAZIA);
    }
}
