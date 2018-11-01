package exercicio.tres;

public class Lista{
    private Integer[] lista;

    private Lista(Integer[] lista) throws ListaException {
        if(lista == null || lista.length == 0) throw new ListaException(ListaException.LISTA_VAZIA);
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
        int ocorrencias = qntdOcorrenciasDe(outro);
		Integer[] resultado = criarListaMenor(ocorrencias);
		int qntdAdicionada = 0;
		for(int indice = 0; indice < lista.length; indice++) {
		    Integer valor = get(indice);
			if(!valor.equals(outro)) {
				resultado[qntdAdicionada++] = valor;
			}
		}
        lista = resultado;
    }

    private int qntdOcorrenciasDe(Integer outro) {
        int ocorrencias = 0;
        for(Integer valor: lista) {
            if(valor.equals(outro)) {
                ocorrencias++;
            }
        }
        return ocorrencias;
    }

    private Integer[] criarListaMenor(int valor) {
        return new Integer[lista.length-valor];
    }

    public Integer get(int indice) {
        return lista[indice];
    }

    public int size(){ return lista.length;}

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for(Integer valor: lista) {
            builder.append(valor).append(",");
        }
        if(lista.length > 2) {
            builder.deleteCharAt(builder.length()-1);
        }
        builder.append("]");
        return builder.toString();
    }

    public static Lista criar(Integer[] valores) throws ListaException { return new Lista(valores);}
}
