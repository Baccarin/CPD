package model;
public class Pilha {

	private Object arranjo[];
	private int topo;

	static private final int DEFAULT = 10;

	public Pilha() {
		arranjo = new Object[DEFAULT];
		topo = -1;
	}

	public void esvazie() {
		topo = -1;
		for (int i = 0; i < arranjo.length; i++) {
			arranjo[i] = null;
		}
	}

	public void push(Object x) {
		if (this.cheia()) {
			System.out.println("Pilha está cheia");
			return;
		}
		topo++;
		arranjo[topo] = x;
		System.out.println(String.format("Foi inserido o valor %s na posição %s", x, topo));
	}

	public Object top() {
		if (topo >= 0) {
			return arranjo[topo];
		}
		return null;
	}

	public Object[] remove() {
		int valor = (int) arranjo[topo];
		arranjo[topo] = null;
		System.out.println(String.format("Foi removido o valor %s na posição %s", valor, topo));
		return arranjo;
	}

	public boolean cheia() {
		return topo >= DEFAULT -1;
	}

	public Object[] getArranjo() {
		return arranjo;
	}

	public void imprime() {
		for (int i = 0; i < arranjo.length; i++) {
			if (arranjo[i] != null) {
				System.out.println("Vetor na posição " + i + " é " + i);
			}
		}
	}
}
