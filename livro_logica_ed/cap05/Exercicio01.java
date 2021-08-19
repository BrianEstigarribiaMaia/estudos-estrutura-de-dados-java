package br.com.cap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Ler 300 numeros divisiveis por 3, calcular a soma entre eles e exibir o 
 * resultado
 */
public class Exercicio01 {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		int contador = 0;
		double numero, acumulador = 0;
		
		try {
			while (contador < 300) {
				System.out.println("Digite um numero: ");
				numero = Float.parseFloat(entrada.readLine());
				
				if(numero % 3 == 0){
					contador++;
					acumulador += numero; 
				}
				
			}
			System.out.println("Soma: "+acumulador);
		} catch (Exception e) {
			System.out.println("Erro na leitura dos dados!");
		}


	}

}
