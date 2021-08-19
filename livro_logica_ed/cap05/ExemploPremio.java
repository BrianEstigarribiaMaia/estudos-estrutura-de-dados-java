package br.com.cap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploPremio {

	public static void main(String[] args) {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		float salario, bonus;
		int tempo;
		
		try {
			System.out.println("Qual o salário?");
			salario = Float.parseFloat(entrada.readLine());
			
			System.out.println("Quanto tempo está na empresa?");
			tempo = Integer.parseInt(entrada.readLine());
			
			if (tempo >= 5) {
				bonus = salario * 0.20f;
			} else {
				bonus = salario * 0.10f;
			}
			
			System.out.println("O valor do bonus é: "+bonus);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}
	}
}
