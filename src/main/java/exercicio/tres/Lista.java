package exercicio.tres;

public class Lista{
    private final Integer[] lista;

    public Lista(Integer[] lista) {
        this.lista = lista;
    }
    public void remover(Integer valor){
        if(this.contains(valor)) {
            this.removerTodososElementos(valor);
        }
    }

    public boolean contains(Integer valor) {
        for(Integer elemento: lista){
            if(elemento.equals(valor)) {
                return true;
            }
        }
        return false;
    }

    private void removerTodososElementos(Integer outro) {
		/*
		for(Integer valor: lista) {
			if(valor.equals(outro)) {
				lista =
			}
		}
		*/
    }
}
