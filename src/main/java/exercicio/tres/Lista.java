package exercicio.tres;

public class Lista{
    private Integer[] lista;

    public Lista(Integer[] lista) {
        this.lista = lista;
    }
    public void remover(Integer valor){
        if(this.contains(valor)) {
            this.removerTodasAsOcorrencias(valor);
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

    private void removerTodasAsOcorrencias(Integer outro) {
		Integer[] resultado = criarListaUmHaMenos();
		int qntdAdicionada = 0;
		for(int indice = 0; indice < lista.length; indice++) {
		    Integer valor = get(indice);
			if(!valor.equals(outro)) {
				resultado[qntdAdicionada++] = valor;
			}
		}
        lista = resultado;
    }

    private Integer[] criarListaUmHaMenos() {
        return new Integer[lista.length-1];
    }

    public Integer get(int indice) {
        return lista[indice];
    }

    public int size(){ return lista.length;}
}
