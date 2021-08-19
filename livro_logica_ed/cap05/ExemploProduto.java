package br.com.cap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploProduto {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int codigo;
		
		try {
			System.out.println("Digite o código: ");
			codigo = Integer.parseInt(entrada.readLine());
			
			switch (codigo) {
			case 1:
				System.out.println("Caderno");
				break;
			case 2:
				System.out.println("Lápis");
				break;
			case 3:
				System.out.println("Borracha");
				break;
			default: System.out.println("Diversos");
			
			}
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na leitura!");
		}
	}
}
