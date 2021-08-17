package br.com.estudos.java.ordenacao;

public class TesteAnimalBubbleSort {

	public static void main(String[] args) {
		Animal scooby = new Animal("Scooby", "Cachorro");
		Animal gumball = new Animal("Gumball", "Gato");
		Animal pernalonga = new Animal("Pernalonga", "Coelho");
		Animal picapau = new Animal("Picapau", "Pássaro");

		Animal[] animais = new Animal[] {scooby, gumball, pernalonga, picapau};

		TesteAnimalBubbleSort nome = new TesteAnimalBubbleSort();
		nome.ordenarPorEspecieENome(animais);

		System.out.println("Ordenado por espécie:");
		for (int tamanho = 0; tamanho < animais.length; tamanho++) {
			System.out.println("Nome: "+animais[tamanho].getNome() +
					" - " + "Espécie: "+animais[tamanho].getEspecie());
			
		}
	}

	private void ordenarPorEspecieENome(Animal[] animais) {
		for (int i = 0; i < animais.length - 1; i++) {
			boolean ordenado = true;

			for (int j = 0; j < animais.length - 1 - i; j++) {
				/* Se o nome da especie do animal na posição atual do 
				 * vetor for maior  que o nome da especie do proximo animal,
				 *  então troca os animais de lugar no vetor. */
				if(animais[j].getEspecie().compareToIgnoreCase(animais[j+1].getEspecie()) > 0){
					Animal auxiliar = animais[j];
					animais[j] = animais[j+1];
					animais[j+1] = auxiliar;

					ordenado = false;
				}
				/* Se o nome do da especie do animal na posição atual do vetor for
		           igual o nome da especie do proximo animal, e o nome do animal
		           na posição atual do vetor for maior que o nome do proximo animel,
				   então troca os animais de lugar no vetor. */
				else if(animais[j].getEspecie().equals(animais[j+1].getEspecie()) &&
						animais[j].getNome().compareToIgnoreCase(animais[j + 1].getNome()) > 0){

					Animal auxiliar = animais[j];
					animais[j] = animais[j+1];
					animais[j+1] = auxiliar;
				}
			}
			if(ordenado){
				break;
			}
		}
	}
}
