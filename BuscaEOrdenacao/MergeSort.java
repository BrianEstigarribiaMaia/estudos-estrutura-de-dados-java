package br.com.estudos.java.ordenacao;

public class MergeSort {
	public static void main(String[] args) {
		int[] numeros = {3, 9, 8, 7, 6, 2, 1};
		
		mergeSortRecursivo(0, numeros.length, numeros);
		
		for(int numero: numeros){
			System.out.println(numero +" ");
		}
	}

	private static void mergeSortRecursivo(int inicio, int fim, int[] vetor) {
	    System.out.println("Inicio: " + inicio + " - Fim: " + fim);
	    /* Se o inicio for menor que o fim menos 1, significa que tem elementos
			  dentro do vetor. */
	    if(inicio < fim - 1) {
	      // Guarda a posição do meio do vetor.
	      int meio = (inicio + fim) / 2;
	      
	      /* Chama este método recursivamente, indicando novas posições do
				  inicio e fim do vetor. */
	      mergeSortRecursivo(inicio, meio, vetor);
	      
	      /* Chama este método recursivamente, indicando novas posições do
				  inicio e fim do vetor. */
	      mergeSortRecursivo(meio, fim, vetor);
	      
	      // Chama o método que intercala os elementos do vetor.
	      intercala(vetor, inicio, meio, fim);
	    }
	  }

	private static void intercala(int[] vetor, int inicio, int meio, int fim) {
		int novoVetor[] = new int[fim - inicio];

		int i = inicio;
		int m = meio;
		int posicao = 0;

		/* Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor
	      não chegar até seu fim, compara os valores entre o inicio e o meio,
	      verificando em qual ordem vai guarda-los ordenado.*/
		while(i < meio && m < fim){
			/* Se o vetor[i] for menor que o vetor[m], então guarda o valor do
	        vetor[i] pois este é menor. */
			if(vetor[i] <= vetor[m]){
				novoVetor[posicao] = vetor[i];
				posicao =+ 1;
				i =+ 1;
			}else{
				novoVetor[posicao] = vetor[m];
				posicao =+ 1;
				m =+ 1;
			}

		}

		// Adicionar no vetor os elementos que estão entre o inicio e meio,
		// que ainda não foram adicionados no vetor.
		while(i < meio) {
			novoVetor[posicao] = vetor[i];
			posicao =+ 1;
			i =+ 1;
		}

		// Adicionar no vetor os elementos que estão entre o meio e o fim,
		// que ainda não foram adicionados no vetor.
		while(m < fim) {
			novoVetor[posicao] = vetor[m];
			posicao =+ 1;
			m =+ 1;
		}

		// Coloca no vetor os valores já ordenados.
		for(posicao = 0, i = inicio; i < fim; i++, posicao++) {
			vetor[i] = novoVetor[posicao];
		}
	}
}
