package exercicio;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PrimeiraOcorrenciaTeste {

    @Test
    public void valor3Teste() throws ListaException {
        List<Integer> lista = Arrays.asList(new Integer[] {2, 3, 3, 1, 5, 2});
        ManipuladorDeLista manipulador = new ManipuladorDeLista();
        Integer valor = manipulador.buscarPrimeiroValorDuplicado(lista);
        Assert.assertEquals(3, valor.intValue());
    }


    @Test
    public void valor2Teste() throws ListaException {
        List<Integer> lista = Arrays.asList(new Integer[] {2, 3, 1, 5, 2, 3});
        ManipuladorDeLista manipulador = new ManipuladorDeLista();
        Integer valor = manipulador.buscarPrimeiroValorDuplicado(lista);
        Assert.assertEquals(2, valor.intValue());
    }

    @Test
    public void listaVaziaTeste(){
        List<Integer> lista = Arrays.asList(new Integer[] {});
        ManipuladorDeLista manipulador = new ManipuladorDeLista();
        Integer valor = null;
        try {
            valor = manipulador.buscarPrimeiroValorDuplicado(lista);
        } catch (ListaException e) {
            Assert.assertTrue(e.getMessage().equals(ListaException.LISTA_VAZIA));
        }
    }

    @Test
    public void valorInvalidoTeste() {
        List<Integer> lista = Arrays.asList(new Integer[] {2, 3, 1, 5, 2, -3});
        ManipuladorDeLista manipulador = new ManipuladorDeLista();
        try {
            Integer valor = manipulador.buscarPrimeiroValorDuplicado(lista);
        } catch (ListaException e) {
            Assert.assertTrue(e.getMessage().equals(ListaException.VALOR_INVALIDO));
        }
    }

    @Test
    public void listaSemDuplicidadeTeste() throws ListaException {
        List<Integer> lista = Arrays.asList(new Integer[] {2, 3, 1, 5, 9, 10});
        ManipuladorDeLista manipulador = new ManipuladorDeLista();
        Integer valor = manipulador.buscarPrimeiroValorDuplicado(lista);
        Assert.assertEquals(-1, valor.intValue());
    }

    @Test
    public void parametroNuloTeste() {
        ManipuladorDeLista manipulador = new ManipuladorDeLista();
        try {
            manipulador.buscarPrimeiroValorDuplicado(null);
        } catch (ListaException e) {
            Assert.assertTrue(e.getMessage().equals(ListaException.VALOR_NULO));
        }
    }

}
