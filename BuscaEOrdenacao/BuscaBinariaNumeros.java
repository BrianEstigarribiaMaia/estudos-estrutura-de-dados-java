package br.com.estudos.java.algoritmos;

public class BuscaBinariaNumeros {

	public static void main(String[] args) {
		BuscaBinariaNumeros binaria = new BuscaBinariaNumeros();

		int [] numeros = {1, 3, 4, 10, 18, 21, 22};
		
		binaria.pesquisarNumero(20, numeros);
		binaria.pesquisarNumero(3, numeros);
	}

	public void pesquisarNumero(int numero,int[] numeros){
		int inicio = 0, meio = 0, fim = numeros.length -1;
		
		while(inicio <= fim){
			meio = (fim + inicio) / 2;
			
			System.out.println("Inicio: "+numeros[inicio]+" - Meio: " +numeros[meio]+ " - Fim: " +numeros[fim]);
			System.out.println("Inicio: "+inicio+" - Meio: " +meio+ " - Fim: " +fim);
			
			if (numeros[meio] == numero) {
				System.out.println("Encontrou o numero "+numero);
				break;
			}
			
			if (numeros[meio] < numero) {
				inicio = meio + 1;
			} else {
				fim = meio -1;
			}
			
			if (inicio > fim) {
				System.out.println("Valor " +numero+ " não encontrado!");
			}
		}
	}
}
