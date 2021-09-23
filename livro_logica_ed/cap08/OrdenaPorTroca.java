package br.com.cap08;

public class OrdenaPorTroca {

	public static void bolha(String[] palavras) {
		final int n = palavras.length;

		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n - 1 -i; j++) {
				if (palavras[j].compareTo(palavras[j+1]) > 0) {
					String aux = palavras[j];
					palavras[j] = palavras[j+1];
					palavras[j+1] = aux;
				}
			}
		}
	}
	
	public static void bolha(int[] numeros) {
		final int n = numeros.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n - 1 -i; j++) {
				if (numeros[j] > numeros[j+1]) {
					int aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;
				}
			}
		}
	}
}
