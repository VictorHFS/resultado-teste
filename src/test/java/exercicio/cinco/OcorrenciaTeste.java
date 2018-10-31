package exercicio.cinco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OcorrenciaTeste {
    Texto texto;

    @Before
    public void init() throws TextoException {
         texto = Texto.criar("Programador Programação");
    }

    @Test
    public void encontrarUmaOcorrenciaTeste() throws TextoException {
        int ocorrencias = texto.procurarOcorrencasDe("gramador");
        assertEquals(1 , ocorrencias);
        ocorrencias = texto.procurarOcorrencasDe("gramação");
        assertEquals(1 , ocorrencias);
        ocorrencias = texto.procurarOcorrencasDe(" ");
        assertEquals(1 , ocorrencias);
    }
    @Test
    public void encontrarDuasOcorrenciaTeste() throws TextoException {
        int ocorrencias = texto.procurarOcorrencasDe("ama");
        assertEquals(2 , ocorrencias);
        ocorrencias = texto.procurarOcorrencasDe("Progra");
        assertEquals(2 , ocorrencias);
        ocorrencias = texto.procurarOcorrencasDe("grama");
        assertEquals(2 , ocorrencias);
    }

    @Test
    public void encontrarQuatroOcorrenciasTeste() throws TextoException {
        int ocorrencias = texto.procurarOcorrencasDe("o");
        assertEquals(4, ocorrencias);
    }


    @Test
    public void encontrarPalavraNulaTeste() {
        try {
            Texto.criar(null);
        } catch (TextoException e) {
            assertEquals(e.getMessage(), TextoException.TEXTO_NULO);
        }
    }

    @Test
    public void encontrarOcorrenciaNulaTeste() {
        try {
            texto.procurarOcorrencasDe(null);
        }
        catch(TextoException e){
            assertEquals(e.getMessage(), TextoException.MENSAGEM_NULA);
        }
    }
}
