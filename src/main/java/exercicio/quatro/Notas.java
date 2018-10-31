package exercicio.quatro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Notas {
    private final List<Nota> notas;

    private Notas(){
        this.notas = new ArrayList<>();
    }

    public static Notas criar() {return new Notas();}

    public void add(Nota nota) {
        this.notas.add(nota);
    }

    public int size() {
        return this.notas.size();
    }

    public boolean contains(int valor) {
        return notas.contains(Nota.criar(valor));
    }

    public int qntdOcorrencias(int valor) {
        return notas.stream().filter(val -> val.equals(Nota.criar(2))).collect(Collectors.toList()).size();
    }
}
