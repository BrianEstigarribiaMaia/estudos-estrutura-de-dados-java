package br.com.cap06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * considere uma matriz de 30 linhase 3 colunas. cada linha esta associada a um aluno e as colunas
 * são associadas as notas das tres provas referentes aquele estudante.
 */
public class ExemploMatrizAlunos {

	public static void main(String[] args) {
		final int provas = 3;
		final int alunos = 30;
		float notaProva [][] = new float [alunos][provas];
		float mediaAlunos [] = new float [alunos];
		float mediaProvas [] = new float [provas];
		float soma;

		BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			for (int i = 0; i < alunos; i++) {
				soma = 0;
				
				for (int j = 0; j < provas; j++) {
					System.out.println("Entre com a nota do aluno "+i+ " nota: "+j);
					notaProva[i][j] = Float.parseFloat(ler.readLine());
					
					soma = soma + notaProva [i][j];
					mediaAlunos[i] = soma/provas;
				}
			}
			
			for (int i = 0; i < provas; i++) {
				soma = 0;
				
				for (int j = 0; j < alunos; j++) {
					soma = soma + notaProva[i][j];
					mediaProvas[j] = soma/alunos;
				}
			}
			
			for (int i = 0; i < alunos; i++) {
				System.out.println("Média do aluno: " +i+ " : "+mediaAlunos[i]);
			}
			
			for (int i = 0; i < provas; i++) {
				System.out.println("Média da prova: " +i+ " : "+mediaProvas[i]);
			}
		} catch (Exception e) {
			System.out.println("Ocorreu um erro durante a leitura!");
		}
	}

}
