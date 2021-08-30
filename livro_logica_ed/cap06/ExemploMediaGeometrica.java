package br.com.cap06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * dada uma matriz de 6 linhas e 2 colunas de inteiros, calcular e exibir
 * a média geométrica doa valores de cada uma das linhas.
 */
public class ExemploMediaGeometrica {
	public static void main(String[] args) {
		int geometrica [][] = new int [6][2];
		double produto;
		
		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for (int i = 0; i < 6; i++) {
				produto = 1;
				
				for (int j = 0; j < 2; j++) {
					System.out.println("Entre com os valores : " +i+ ", "+j);
					
					geometrica [i][j] = Integer.parseInt(ler.readLine());
					produto = produto * geometrica [i][j];
				}
				
				System.out.println("Linha "+i+ ": " +Math.sqrt(produto));
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}
	}
}
