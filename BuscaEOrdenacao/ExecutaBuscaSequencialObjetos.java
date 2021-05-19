package br.com.estudos.java.algoritmos;

public class ExecutaBuscaSequencialObjetos {

	public static void main(String[] args) {
		ExecutaBuscaSequencialObjetos sequencialObjetos = new ExecutaBuscaSequencialObjetos();
		Pessoa brian = new Pessoa("Brian", 25);
		Pessoa kevin = new Pessoa("Kévin", 25);
		Pessoa ana   = new Pessoa("Ana", 23);
		
		Pessoa[] pessoas ={brian, kevin, ana};
		Pessoa pessoaX = new Pessoa("Jean", 26);
		
		sequencialObjetos.pesquisarPessoa(pessoaX, pessoas);

	}
	
	public void pesquisarPessoa(Pessoa pessoa, Pessoa[] pessoas){
		int contador = 0;
		
		for(contador = 0; contador < pessoas.length; contador++){
			if(pessoas[contador].getNome().equals(pessoa.getNome())){
				System.out.println("Encontrou a pessoa "+pessoa.getNome());
				break;
			}
		}
		if(contador >= pessoas.length){
			System.out.println("Não encontrou a pessoa "+pessoa.getNome());
		}
	}
	

}
