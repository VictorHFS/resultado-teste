package exercicio.dois;

import java.awt.print.PrinterException;

public class Printer {

    public static final String MENSAGEM_VAZIA = "A mensagem esta vazia.";

    public static void print(String mensagem) throws PrinterException {
        if(mensagem.length() <= 0) throw  new PrinterException(MENSAGEM_VAZIA);
        System.out.print(mensagem);
    }
}
