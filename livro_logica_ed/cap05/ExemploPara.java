package br.com.cap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploPara {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		float numero, media, soma = 0f;
		int contador = 0;

		try {
			
			for (contador = 0; contador < 5; contador++) {
				System.out.println("Digite o numero");
				numero = Float.parseFloat(entrada.readLine());

				soma = soma + numero;
			}
			
			media = soma/contador;
			System.out.println("Média = "+media);

		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura !");
		}
	}
}

