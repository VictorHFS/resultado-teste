package exercicio.dois;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class ValidadorDeEscadaTeste {

    @Test
    public void asteriscosValidosTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "  #";
        String linha2 = " ##";
        String linha3 = "###";
        String[] linhas = new String[]{linha1,linha2,linha3};
        assertTrue(validador.asteriscosSaoValidos(linhas));
    }

    @Test
    public void asteriscosInvalidosTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "  #";
        String linha2 = " ##";
        String linha3 = " ##";
        String[] linhas = new String[]{linha1,linha2,linha3};
        assertFalse(validador.asteriscosSaoValidos(linhas));
    }

    @Test
    public void vaziosValidosTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "  #";
        String linha2 = " ##";
        String linha3 = "###";
        String[] linhas = new String[]{linha1,linha2,linha3};
        assertTrue(validador.vazioSaoValidos(linhas));
    }


    @Test
    public void vaziosInvalidosTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "  #";
        String linha2 = "##";
        String linha3 = "###";
        String[] linhas = new String[]{linha1,linha2,linha3};
        assertFalse(validador.vazioSaoValidos(linhas));
    }

    @Test
    public void linhaAlinhadaADireitaTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "    #";
        String linha2 = "   ##";
        String linha3 = "  ###";
        String linha4 = " ####";
        String linha5 = "#####";
        String[] linhas = new String[]{linha1,linha2,linha3, linha4, linha5};
        assertTrue(validador.estaAlinhadoHaDireita(linha1));
        assertTrue(validador.estaAlinhadoHaDireita(linha2));
        assertTrue(validador.estaAlinhadoHaDireita(linha3));
    }

    @Test
    public void linhaNaoAlinhadaADireitaTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "#  ";
        String linha2 = "## ";
        String linha3 = "### ";
        String[] linhas = new String[]{linha1,linha2,linha3};
        assertFalse(validador.estaAlinhadoHaDireita(linha1));
        assertFalse(validador.estaAlinhadoHaDireita(linha2));
        assertFalse(validador.estaAlinhadoHaDireita(linha3));
    }

    @Test
    public void alinhamentoValidoTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "  #";
        String linha2 = " ##";
        String linha3 = "###";
        String[] linhas = new String[]{linha1,linha2,linha3};
        assertTrue(validador.linhasEstaoAlinhadas(linhas));
    }

    @Test
    public void alinhamentoInvalidoTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "  #";
        String linha2 = "## ";
        String linha3 = "## #";
        String[] linhas = new String[]{linha1,linha2,linha3};
        assertFalse(validador.linhasEstaoAlinhadas(linhas));
    }

    @Test
    public void alinhamentoInvalidoDoisTeste() {
        ValidadorDeEscada validador = new ValidadorDeEscada();
        String linha1 = "  #";
        String linha3 = "## #";
        String[] linhas = new String[]{linha1,linha3};
        assertFalse(validador.linhasEstaoAlinhadas(linhas));
    }

}

