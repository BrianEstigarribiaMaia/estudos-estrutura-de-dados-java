package br.com.cap06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * ler elementos do vetor Teste1, criar o vetor Teste2 onde se o valor do indice
 * for par deve se * 5, se for impar + 5. Ao final mostrar os dois vetores
 */
public class ExOperacoes01 {

	public static void main(String[] args) {
		int teste1[] = new int [5];
		int teste2[] = new int [5];
		
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			for (int i = 0; i < teste1.length; i++) {
				System.out.println("Digite um numero: ");
				teste1[i] = Integer.parseInt(ler.readLine());
			}
			
			for (int i = 0; i < teste2.length; i++) {
				if(i % 2 == 0){
					teste2[i] = teste1[i] * 5;
				}else{
					teste2[i] = teste1[i] + 5;
				}
			}
			
			System.out.println("Resultado: ");
			for (int i = 0; i < 5; i++) {
				System.out.print("Teste1 [" +i+ "] = "+teste1[i]+"\t");
				System.out.println("Teste2 [" +i+ "] = "+teste2[i]);
			}
				
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}

	}

}
