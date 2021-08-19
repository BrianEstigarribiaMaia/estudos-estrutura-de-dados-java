package br.com.cap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploEntrada {
	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		String nome;
		
		try {
			System.out.println("Qual seu nome ?");
			nome = entrada.readLine();
			System.out.println("Seu nome é: "+nome);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}
	}
}
