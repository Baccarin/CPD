package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aviao.Aeroporto;
import aviao.Aviao;
import model.Fila;
import model.Pilha;

public class Principal {

	public static int TAMANHO = 10;
	public static List<String> lista = new ArrayList<>();

	public static void main(String[] args) {

//		testaPilha();
//		System.out.println("-------------");
//		testaFila();
//		System.out.println("-------------");
		testaAeroporto();

	}

	public static void testaPilha() {
		int remove = 4;

		Pilha pilha = new Pilha();
		for (int i = 0; i < TAMANHO; i++) {
			pilha.push(i);
			if (i % 2 == 0) {
				if (remove != 0) {
					pilha.remove();
					remove--;
				}
			}
		}
		pilha.imprime();
	}

	public static void testaFila() {
		int remove = 4;

		Fila fila = new Fila();
		for (int i = 0; i < TAMANHO; i++) {
			fila.entrarNaFila(i);
			if (i % 2 == 0) {
				if (remove != 0) {
					fila.removeDaFila();
					remove--;
				}
			}
		}
		fila.imprimeFila();
	}

	public static void testaAeroporto() {
		adicionaOperacoes();
		Aeroporto aeroporto = new Aeroporto("Aeroporto de Pelotas");
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe qual operação deseja realizar");
		imprimeOperacoes();

		while (true) {
			switch (sc.nextInt()) {
			case 1:
				aeroporto.imprimeFilaDeDecolagem();
				break;
			case 2:
				aeroporto.autoriza();
				break;
			case 3:
				sc.nextLine();
				System.out.printf("Qual o nome do aviao?\n");
				String nome = sc.nextLine();
				Aviao aviao = new Aviao(nome);
				aeroporto.adicionarAviaoNaFilaDeEspera(aviao);
				break;
			case 4:
				aeroporto.imprimeFilaDeEspera();
				break;
			case 5:
				aeroporto.proximoAviaoADecolar();
				break;
			case 6:
				aeroporto.decolar();
				break;
			case 9:
				sc.close();
				System.exit(1);
				break;
			default:
				System.out.println("Operação inválida");
			}
			imprimeOperacoes();
		}

	}

	public static void adicionaOperacoes() {
		lista.add("1 - Listar o número de aviões aguardando na fila de decolagem");
		lista.add("2 - Autorizar a decolagem do primeiro avião da fila");
		lista.add("3 - Adicionar um avião à fila de espera");
		lista.add("4 - Listar todos os aviões na fila de espera");
		lista.add("5 - Listar as características do primeiro avião da fila");
		lista.add("6 - Decolar");
		lista.add("9 - Sair");
	}

	public static void imprimeOperacoes() {
		lista.forEach(op -> System.out.println(op));
		System.out.println("\n");
	}
}
