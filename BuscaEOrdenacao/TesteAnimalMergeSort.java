package br.com.estudos.java.ordenacao;

public class TesteAnimalMergeSort {

	public static void main(String[] args) {
		Animal scooby = new Animal("Scooby", "Cachorro");
		Animal gumball = new Animal("Gumball", "Gato");
		Animal pernalonga = new Animal("Pernalonga", "Coelho");
		Animal picapau = new Animal("Picapau", "Pássaro");

		Animal[] animais = new Animal[] {scooby, gumball, pernalonga, picapau};

		mergeSort(0, animais.length, animais);

		for (int tamanho = 0; tamanho < animais.length; tamanho++) {
			System.out.println("Nome: "+animais[tamanho].getNome() +
					" - " + "Espécie: "+animais[tamanho].getEspecie());

		}
	}

	private static void mergeSort(int inicio, int fim, Animal[] animais) {
		if(inicio < fim - 1){
			int meio = (inicio + fim) / 2;

			mergeSort(inicio, meio, animais);
			mergeSort(meio, fim, animais);

			intercala(animais, inicio, meio, fim);
		}
	}

	private static void intercala(Animal[] animais, int inicio, int meio, int fim) {

		Animal novoVetor[] = new Animal[fim - inicio];

		int i = inicio;
		int m = meio;
		int pos = 0;

		/* Enquanto o inicio não chegar até o meio do vetor, ou o meio do vetor
	      não chegar até seu fim, compara os valores entre o inicio e o meio,
	      verificando em qual ordem vai guarda-los ordenado.*/
		while(i < meio && m < fim) {
			/* Se o vetor[i] for menor que o vetor[m], então guarda o valor do
	        vetor[i] pois este é menor. */
			if(animais[i].getNome().compareToIgnoreCase(animais[m].getNome()) <= 0) {
				novoVetor[pos] = animais[i];
				pos = pos + 1;
				i = i + 1;
				// Senão guarda o valor do vetor[m] pois este é o menor.
			} else {
				novoVetor[pos] = animais[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		// Adicionar no vetor os elementos que estão entre o inicio e meio,
		// que ainda não foram adicionados no vetor.
		while(i < meio) {
			novoVetor[pos] = animais[i];
			pos = pos + 1;
			i = i + 1;
		}

		// Adicionar no vetor os elementos que estão entre o meio e o fim,
		// que ainda não foram adicionados no vetor.
		while(m < fim) {
			novoVetor[pos] = animais[m];
			pos = pos + 1;
			m = m + 1;
		}

		// Coloca no vetor os valores já ordenados.
		for(pos = 0, i = inicio; i < fim; i++, pos++) {
			animais[i] = novoVetor[pos];
		}
	}
}


