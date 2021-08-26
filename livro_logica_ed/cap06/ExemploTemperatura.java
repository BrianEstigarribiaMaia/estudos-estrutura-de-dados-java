package br.com.cap06;

/*
 * calcular a média das temperaturas da semana, efetuar ordenação exibir o 
 * maior e o menor deles
 */
public class ExemploTemperatura {
	public static void main(String[] args) {
		final int diasSemana = 7;
		float temperatura[] = new float [diasSemana];
		
		temperatura[0] = 19.0f;
		temperatura[1] = 23.0f;
		temperatura[2] = 21.0f;
		temperatura[3] = 25.0f;
		temperatura[4] = 22.0f;
		temperatura[5] = 20.0f;
		temperatura[6] = 24.0f;
		
		float soma = 0f, media;
		
		for (int i = 0; i < diasSemana; i++) {
			soma += temperatura[i];
		}
		
		media = soma/diasSemana;
		
		System.out.println("Média da semana = "+media);
		
		float auxiliar;
		int minima;
		
		for (int i = 0; i < diasSemana - 1; i++) {
			minima = i;
			
			for (int j = i + 1; j < diasSemana; i++) {
				if(temperatura[j] < temperatura[minima]){
					minima = j;
					auxiliar = temperatura[minima];
					temperatura[minima] = temperatura[i];
					temperatura[i] = auxiliar;
				}
			}
		}
		System.out.println("Minima da semana = "+temperatura[0]);
		System.out.println("Minima da semana = "+temperatura[6]);
	}
}
