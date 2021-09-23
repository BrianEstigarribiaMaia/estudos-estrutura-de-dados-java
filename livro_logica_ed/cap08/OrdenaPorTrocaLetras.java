package br.com.cap08;

public class OrdenaPorTrocaLetras {

	public static void main(String[] args) {
		String letras [] = new String [5];

		letras [0] = "AG";
		letras [1] = "AA";
		letras [2] = "AE";
		letras [3] = "AB";
		letras [4] = "AF";

		bolha(letras);

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras [i]);
		}
	}

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
}
