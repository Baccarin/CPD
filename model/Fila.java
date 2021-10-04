package model;
import java.util.ArrayList;
import java.util.List;

public class Fila {

	private List<Integer> lista = new ArrayList<>();

	public Fila () {
	}
	
	public void entrarNaFila (Integer x) {
		if (filaCheia()) {
			System.out.println("A fila está cheia");
			return;
		}
		System.out.println(x + " Entrou na fila");
		lista.add(x);
	}
	
	public void removeDaFila () {
		if (filaVazia()) {
			System.out.println("A fila está vazia");
			return;
		}
		int valor = lista.get(0);
		lista.remove(0);
		System.out.println(valor + " foi removido da fila");
	}

	public boolean filaCheia() {
		return !(lista.size() <= 10) ;
	}
	
	public boolean filaVazia() {
		return lista.size() == 0;
	}
	
	public void imprimeFila() {
		System.out.println("Ainda na fila ");
		lista.forEach(p -> System.out.println( String.format("%s", p)));
	}
	

}
