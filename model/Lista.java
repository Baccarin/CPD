package model;
import java.util.ArrayList;
import java.util.List;

public class Lista {

	public List<Double> lista = new ArrayList<>();
	
	public Lista() {
		
	}
	
	public boolean existe(Double elemento) {
		return lista.contains(elemento);
	}
	
	public boolean existeForExplicito(Double elemento) {
		for (Double e : lista) {
			if ( e == elemento) {
				return true;
			}
		}
		return false;
	}
	
	public void adiciona(Double elemento) {
		System.out.println(elemento + " adicionado na lista");
		lista.add(0, elemento);
	}

	public void remove (Double elemento) {
		System.out.println("tentando remover o elemento " + elemento + " da lista");
		if (existe(elemento)) {
			System.out.println(elemento + " removido da lista");
			lista.remove(elemento);
			return;
		}
		System.out.println(elemento + " não encontrado na lista");
	}

	public void imprime() {
		lista.forEach(d -> System.out.println("Elemento: " + d));
	}
	
}
