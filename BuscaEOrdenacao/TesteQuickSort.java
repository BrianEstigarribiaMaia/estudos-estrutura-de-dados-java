package br.com.estudos.java.ordenacao;

public class TesteQuickSort {

	public static void main(String[] args) {
		 int vetor[] = {24, 66, 87, 43, 11, 27, 4, 2, 7, 8, 4, 5,
			     12, 53, 42, 22, 1, 5, 9, 13, 16, 23, 13, 7, 55, 67,
			     92, 22, 33, 27, 19};
		 
		 QuickSort ordenar = new QuickSort();
		 ordenar.ordenarVetorDeInteiros(vetor);
		 imprimir(vetor);

	}

	private static void imprimir(int[] vetor) {
		System.out.println("Vetor... \n");
		for(int numero: vetor){
			System.out.println(numero + ", ");
		}
		
	}

}
