package exercicio.dois;

import org.junit.Test;

import java.awt.print.PrinterException;

import static org.junit.Assert.assertTrue;

public class EscadaTeste {

    private static final ValidadorDeEscada validador = new ValidadorDeEscada();


    @Test
    public void escadaDoisTeste() throws EscadaException {
        int degrais = 2;
        Escada escada = new Escada(degrais);
        String[] linhas = escada.toString().split("\n");
        assertTrue(validador.asteriscosSaoValidos(linhas));
        assertTrue(validador.vazioSaoValidos(linhas));
    }

    @Test
    public void printEscadaDezTeste() throws PrinterException, EscadaException {
        Escada escada = new Escada(10);
        String[] linhas = escada.toString().split("\n");
        assertTrue(validador.asteriscosSaoValidos(linhas));
        assertTrue(validador.vazioSaoValidos(linhas));
    }

    @Test
    public void valorMenorQueDoisTeste() throws PrinterException {
        try {
            Escada escada = new Escada(-10);
        } catch (EscadaException e) {
            assertTrue(e.getMessage().equals(EscadaException.VALOR_MENOR_QUE_DOIS));
        }
    }

}
