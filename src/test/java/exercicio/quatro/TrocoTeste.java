package exercicio.quatro;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class TrocoTeste {

    Troco troco;

    @Before
    public void init() {
        troco = Troco.criar();
    }

    @Test
    public void trocarSetentaTeste() throws TrocoException {
        Notas notas = troco.buscarTroco(70);
        assertEquals(notas.size(), 2);
        assertTrue(notas.contains(50));
        assertTrue(notas.contains(20));
    }

    @Test
    public void trocarSetentaEDois() throws TrocoException {
        Notas notas = troco.buscarTroco(72);
        assertEquals(notas.size(), 3);
        assertTrue(notas.contains(50));
        assertTrue(notas.contains(20));
        assertTrue(notas.contains(2));
    }

    @Test
    public void trocarValoresMultiplosTeste() throws TrocoException {
        Notas notas = troco.buscarTroco(79);
        assertEquals(notas.size(), 5);
        assertTrue(notas.contains(50));
        assertTrue(notas.contains(20));
        assertTrue(notas.contains(2));
        assertTrue(notas.contains(5));
        assertTrue(notas.qntdOcorrencias(2) == 2);
    }

    @Test
    public void trocarValorNaoEncontradoTeste() {
        try {
            Notas notas = troco.buscarTroco(3);
        } catch (TrocoException e) {
            assertEquals(e.getMessage(), TrocoException.TROCO_NAO_ENCONTRADO);
        }
    }

    @Test
    public void trocarValorNegativoTeste() {
        try {
            troco.buscarTroco(-1);
        } catch (TrocoException e) {
            assertEquals(e.getMessage(), TrocoException.VALOR_NEGATIVO);
        }
    }

    @Test
    public void trocarZeroTeste() {
        Notas notas = null;
        try {
            notas = troco.buscarTroco(0);
        } catch (TrocoException e) {
            fail();
        }
        assertNotEquals(null, notas);
        assertEquals(0, notas.size());
    }
}
