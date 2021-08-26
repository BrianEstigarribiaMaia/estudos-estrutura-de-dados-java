package br.com.cap06;

/*
 * Somar elementos impar do vetor preenchido pelo usuário
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExemploSomaImpar {
	public static void main(String[] args) {
		final int tamanho = 5;
		int vetor[] = new int [tamanho];
		
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for (int i = 0; i < tamanho; i++) {
				System.out.println("Qual o numero ?");
				vetor[i] = Integer.parseInt(ler.readLine());
			}
			
			int soma = 0;
			
			for (int i = 0; i < tamanho; i++) {
				if(vetor[i] % 2 != 0){
					soma += vetor[i];
				}
			}
			
			System.out.println("Soma = "+soma);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}
		
	}
}
