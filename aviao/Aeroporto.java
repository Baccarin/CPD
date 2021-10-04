package aviao;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {

	public String nome;
	public List<Aviao> listaDeEspera = new ArrayList<>();
	public List<Aviao> listaDeDecolagem = new ArrayList<>();
	public static int TAMANHO_LISTA = 10;

	
	public Aeroporto(String nome) {
		this.nome = nome;
	}
	
	public void decolar() {
		if (filaDeDecolagemVazia()) {
			System.out.println("A fila de decolagem está vazia");
			return;
		}
		Aviao aviao = listaDeDecolagem.get(0);
		System.out.println(aviao + " decolou");
		listaDeDecolagem.remove(aviao);
	}
	
	public void autoriza() {
		if (filaDeEsperaVazia()) {
			System.out.println("A fila de espera está vazia");
			return;
		}
		Aviao aviao = listaDeEspera.get(0);
		aviao.setAutorizado(true);
		this.removeDaFilaDeEspera();
		this.adicionaNaFilaDeDecolagem(aviao);
	}
	
	private void adicionaNaFilaDeDecolagem(Aviao aviao) {
		if (filaDeDecolagemCheia()) {
			System.out.println("A fila de decolagem está cheia");
			return;
		}
		System.out.println(aviao + " entrou na fila de decolagem");
		listaDeDecolagem.add(aviao);
	}

	public void adicionarAviaoNaFilaDeEspera (Aviao aviao) {
		if (filaDeEsperaCheia()) {
			System.out.println("A fila de espera está cheia");
			return;
		}
		System.out.println(aviao + " entrou na fila de espera");
		listaDeEspera.add(aviao);
	}
	
	public void removeDaFilaDeEspera () {
		if (filaDeEsperaVazia()) {
			System.out.println("A fila está vazia");
			return;
		}
		Aviao aviao = listaDeEspera.get(0);
		if (!aviao.isAutorizado()) {
			System.out.println("O avião prescisa estar autorizado para decolar");
			return;
		}
		listaDeEspera.remove(0);
		System.out.println(aviao + " foi removido da fila de espera");
	}
	
	public void removeDaFilaDeDecolagem () {
		if (filaDeDecolagemVazia()) {
			System.out.println("A fila está vazia");
			return;
		}
		Aviao aviao = listaDeDecolagem.get(0);
		if (!aviao.isAutorizado()) {
			System.out.println("O avião prescisa estar autorizado para decolar");
			return;
		}
		listaDeDecolagem.remove(0);
		System.out.println(aviao + " decolou");
	}

	public boolean filaDeEsperaCheia() {
		return !(listaDeEspera.size() < TAMANHO_LISTA) ;
	}
	
	public boolean filaDeEsperaVazia() {
		return listaDeEspera.size() == 0;
	}
	
	public boolean filaDeDecolagemCheia() {
		return !(listaDeDecolagem.size() < TAMANHO_LISTA) ;
	}
	
	public boolean filaDeDecolagemVazia() {
		return listaDeDecolagem.size() == 0;
	}
	
	public void imprimeFilaDeEspera() {
		if (filaDeEsperaVazia()) {
			System.out.println("Nenhum avião na fila de espera");
			return;
		}
		System.out.println("Ainda na fila de espera");
		listaDeEspera.forEach(p -> System.out.println(p.toString()));
	}
	
	public void imprimeFilaDeDecolagem() {
		if (filaDeDecolagemVazia()) {
			System.out.println("Nenhum avião na fila de decolagem");
			return;
		}
		System.out.println("Ainda na fila de decolagem");
		listaDeDecolagem.forEach(p -> System.out.println(p.toString()));
	}
	
	public void aviaosEsperando() {
		listaDeEspera.forEach( aviao -> aviao.toString());
	}
	
	public void proximoAviaoADecolar() {
		if (filaDeDecolagemVazia()) {
			System.out.println("Nenhum avião na fila de decolagem");
			return;
		}
		System.out.println("O próximo avião a decolar é: " + listaDeDecolagem.get(0).toString());
	}
	
	
}
