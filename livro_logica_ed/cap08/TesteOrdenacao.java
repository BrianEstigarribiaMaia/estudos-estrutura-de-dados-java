package br.com.cap08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TesteOrdenacao {

	public static void main(String[] args) {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));

		try {
			int qtd;
			boolean ok;

			do {
				System.out.println("---ORDENAR---");
				System.out.println("O que deseja ordenar?");
				System.out.println("1 - Numeros Inteiros");
				System.out.println("2 - Palavras");
				System.out.println("Opcao: ");

				int opcao = Integer.parseInt(ler.readLine());

				switch (opcao) {
				case 1:
					System.out.println("Quantos numeros ?");
					qtd = Integer.parseInt(ler.readLine());
					int numeros[] = new int [qtd];

					for (int i = 0; i < qtd; i++) {
						System.out.println("Numero [" + (i+1) +"] = ");
						numeros[i] = Integer.parseInt(ler.readLine());
					}

					OrdenaPorTroca.bolha(numeros);
					System.out.println("Ordenados: ");
					for (int i = 0; i < qtd; i++) {
						System.out.println(numeros[i]);
					}

					ok = true;
					break;

				case 2:
					System.out.println("Quantas palavras ?");
					qtd = Integer.parseInt(ler.readLine());
					String palavras[] = new String [qtd];

					for (int i = 0; i < qtd; i++) {
						System.out.println("Palavra [" + (i+1) +"] = ");
						palavras[i] = ler.readLine().toUpperCase();
					}

					OrdenaPorTroca.bolha(palavras);
					System.out.println("Ordenados: ");
					for (int i = 0; i < qtd; i++) {
						System.out.println(palavras[i]);
					}

					ok = true;
					break;

				default:
					System.out.println("Opcao invalida!");
					ok = false;
				}
			} while (!ok);

		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!" + e);
		}
	}
}
