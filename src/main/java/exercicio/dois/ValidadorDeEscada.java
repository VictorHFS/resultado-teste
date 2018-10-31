package exercicio.dois;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidadorDeEscada {

    public boolean asteriscosSaoValidos(String[] linhas) {
        for(int indiceLinha = 0; indiceLinha < linhas.length ;indiceLinha ++) {
            String linha = linhas[indiceLinha];
            List<String> letras = Arrays.asList(linha.split(""));
            int numeroDeAsteriscos = letras.stream().filter(letra -> letra.equals(DegrauBuilder.ASTERISCO)).collect(Collectors.toList()).size();
            if(! (indiceLinha+1 == numeroDeAsteriscos)) {
                return false;
            }
        }
        return true;
    }

    public boolean vazioSaoValidos(String[] linhas) {
        for(int indiceLinha = 0; indiceLinha < linhas.length ;indiceLinha ++) {
            String linha = linhas[indiceLinha];
            List<String> letras = Arrays.asList(linha.split(""));
            int numeroDeVazios = letras.stream().filter(letra -> letra.equals(DegrauBuilder.VAZIO)).collect(Collectors.toList()).size();
            if(! (linhas.length - (indiceLinha + 1) == numeroDeVazios)) {
                return false;
            }
        }
        return true;
    }

    public boolean linhasEstaoAlinhadas(String[] linhas) {
        for(int indiceLinha = 0; indiceLinha < linhas.length ;indiceLinha ++) {
            String linha = linhas[indiceLinha];
            if (!estaAlinhadoHaDireita(linha)) {
                return false;
            }
        }
        return true;
    }

    public boolean estaAlinhadoHaDireita(String linha) {
        List<String> letras = Arrays.asList(linha.split(""));
        int numeroDeVazios = letras.stream().filter(letra -> letra.equals(DegrauBuilder.VAZIO)).collect(Collectors.toList()).size();
        for(int indiceLetras = 0; indiceLetras < numeroDeVazios; indiceLetras++){
            String letra = letras.get(indiceLetras);
            //Verifica se indice pertence a um numero vazio
            if(indiceLetras <= numeroDeVazios){
                if(!ehVazio(letra)) {
                    return false;
                }
            }else {
                if(!ehAsterisco(letra)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ehVazio(String letra) {
        return DegrauBuilder.VAZIO.equals(letra);
    }

    private boolean ehAsterisco(String letra) {
        return DegrauBuilder.ASTERISCO.equals(letra);
    }
}
