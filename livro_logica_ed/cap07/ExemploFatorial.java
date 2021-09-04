package br.com.cap07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploFatorial {

	public static void main(String[] args) {
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Digite o numero para saber seu fatorial: ");
			int numero = Integer.parseInt(ler.readLine());
			int fatorial = calcularFatorial(numero);
			
			System.out.println("O fatorial do numero digitado é: "+fatorial);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na leitura");
		}

	}

	 static int calcularFatorial(int numero) {
		int fatorial = 1;
		
		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

}
