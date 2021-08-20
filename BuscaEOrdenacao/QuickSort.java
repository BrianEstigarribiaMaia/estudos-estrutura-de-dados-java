package br.com.estudos.java.ordenacao;

public class QuickSort {

	public void ordenarVetorDeInteiros(int[] vetor){
		quickSort(vetor, 0, vetor.length - 1);
	}

	private void quickSort(int[] vetor, int inicio, int fim) {
		if(fim > inicio){
			//dividir vetor em 3 partes
			int indexPivo = dividir(vetor, inicio, fim);
			//redivisão de elementos menores que o pivo
			quickSort(vetor, inicio, indexPivo - 1);
			//redivisão de elemenos maiores que o pivo
			quickSort(vetor, indexPivo + 1, fim);
			
		}
		
	}

	private int dividir(int[] vetor, int inicio, int fim) {
		int pivo, ponteiroEsquerdo, ponteiroDireito = fim;
		ponteiroEsquerdo = inicio + 1;
		pivo = vetor[inicio];
		
		while(ponteiroEsquerdo <= ponteiroDireito){
			/*correr o vetor até ultrapassar o ponteiro ou até que o elemento em questão
			 * seja menor que o pivo*/
			while(ponteiroEsquerdo <= ponteiroDireito && vetor[ponteiroEsquerdo] <= pivo){
				ponteiroEsquerdo++;
			}
	
			/*correr o vetor até ultrapassar o outro ponteiro que o elemento em questão
			 * seja maior que o pivo*/
			while(ponteiroDireito >= ponteiroEsquerdo && vetor[ponteiroDireito] > pivo){
				ponteiroDireito--;
			}
			
			 /* Caso os ponteiros ainda nao tenham se cruzado, significa que valores
			  *  menores e maiores que o pivô foram localizados em ambos os lados.
			  *   Trocar estes elementos de lado. */
			if(ponteiroEsquerdo < ponteiroDireito){
				trocar(vetor, ponteiroDireito, ponteiroEsquerdo);
				ponteiroEsquerdo++;
				ponteiroEsquerdo--;
			}
		}
		trocar(vetor, inicio, ponteiroDireito);
		return ponteiroDireito;
	}

	private void trocar(int[] vetor, int ponteiroDireito, int ponteiroEsquerdo) {
		int temporario = vetor[ponteiroDireito];
		vetor[ponteiroDireito] = vetor[ponteiroEsquerdo];
		vetor[ponteiroEsquerdo] = temporario;
	}
}
