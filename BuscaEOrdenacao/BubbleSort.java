package br.com.estudos.java.ordenacao;

public class BubbleSort {
	public static void main(String[] args) {
		int[] vetor = {5, 2, 4, 3, 0, 9, 7, 8, 1, 6};
		BubbleSort bs = new BubbleSort();
		
		bs.ordenar(vetor);
		
		for(int numero: vetor){
			System.out.println(numero+ " ");
		}
	}

	private void ordenar(int[] vetor) {
		//for para controlar a qtd de vezes que o vetor será ordenado
		for (int i = 0; i < vetor.length - 1; i++) {
			boolean ordenado = true;
			//for para ordenar o vetor
			for (int j = 0; j < vetor.length - 1 - i; j++) {
				 /* Se o valor da posição atual do vetor for maior 
				  * que o proximo valor, então troca os valores de 
				  * lugar no vetor. */
				if(vetor[j] > vetor[j+1]){
					int auxiliar = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = auxiliar;
					
					ordenado = false;
				}
			}
			
			if(ordenado){
				break;
			}
		}
	}
}
