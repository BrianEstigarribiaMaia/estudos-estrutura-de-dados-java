package br.com.estudos.java.algoritmos;

public class ExecutaBuscaSequencialNumeros {

	public static void main(String[] args) {
		ExecutaBuscaSequencialNumeros sequencial = new ExecutaBuscaSequencialNumeros();
		int vetorNumeros[] = {5,4,0,8,7,9};
		
		sequencial.pesquisarNumero(0,vetorNumeros);
		sequencial.pesquisarNumero(3,vetorNumeros);
		
	}

	private void pesquisarNumero(int numero, int[] vetorNumeros) {
		int contador = 0;
		
		for(contador = 0; contador < vetorNumeros.length; contador++){
			if(vetorNumeros[contador] == numero){
				System.out.println("Encontrou Número "+numero);
				break;
			}
		}
		if(contador >= vetorNumeros.length){
			System.out.println("Não encontrou o numero "+numero);
		}
	}
}
