package br.com.cap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploSoma {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int valor1, valor2, soma;
		
		try {
			System.out.println("Digite o primeiro numero: ");
			valor1 = Integer.parseInt(entrada.readLine());
			System.out.println("Digite o segundo numero: ");
			valor2 = Integer.parseInt(entrada.readLine());
			
			soma = valor1 + valor2;
			System.out.println("A soma dos numeros digitados é: "+soma);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro duarante a leitura!");
		}
	}
}
