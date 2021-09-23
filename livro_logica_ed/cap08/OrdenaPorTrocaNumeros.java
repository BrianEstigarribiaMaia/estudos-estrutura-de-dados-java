package br.com.cap08;

public class OrdenaPorTrocaNumeros {

	public static void main(String[] args) {
		int num [] = new int [5];
		
		num [0] = 9;
		num [1] = 1;
		num [2] = 5;
		num [3] = 2;
		num [4] = 7;
		
		bolha(num);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num [i]);
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
