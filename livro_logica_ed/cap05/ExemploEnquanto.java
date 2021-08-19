package br.com.cap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploEnquanto {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		float numero, media, soma = 0f;
		int contador = 0;
		
		try {
			
			do {
				System.out.println("Digite o numero");
				numero = Float.parseFloat(entrada.readLine());
				
				soma = soma + numero;
				contador++;
			} while (contador < 5);
			
			/*while(contador < 5){
				System.out.println("Digite o numero");
				numero = Float.parseFloat(entrada.readLine());
				
				soma = soma + numero;
				contador++;
			}*/
			
			media = soma/contador;
			System.out.println("Média = "+media);
			
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura !");
		}

	}

}
