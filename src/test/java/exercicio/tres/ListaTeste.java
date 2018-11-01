package exercicio.tres;

import org.junit.Before;
import org.junit.Test;

import static exercicio.tres.Lista.criar;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ListaTeste {

    Lista lista, elementosMultiplos;

    @Before
    public void init() throws ListaException {
        lista = criar(new Integer[]{1,2,3,4,5});
        elementosMultiplos = criar(new Integer[]{1,2,3,4,5,2,3});
    }

    @Test
    public void listaCheiaTeste() {
        assertTrue(lista.toString().equals("[1,2,3,4,5]"));
    }

    @Test
    public void removerOElementoTeste() {
        lista.remover(2);
        assertTrue(lista.toString().equals("[1,3,4,5]"));
    }

    @Test
    public void removerElementosMultiplosTeste() {
        elementosMultiplos.remover(2);
        assertEquals(elementosMultiplos.toString(), "[1,3,4,5,3]");
        elementosMultiplos.remover(3);
        assertEquals(elementosMultiplos.toString(), "[1,4,5]");
    }

    @Test
    public void listaVaziaTeste() {
        try {
            Lista.criar(null);
        } catch (ListaException e) {
            assertEquals(e.getMessage(), ListaException.LISTA_VAZIA);
        }
        try {
            Lista.criar(new Integer[]{});
        } catch (ListaException e) {
            assertEquals(e.getMessage(), ListaException.LISTA_VAZIA);
        }
    }
}
