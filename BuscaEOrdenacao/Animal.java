package br.com.estudos.java.ordenacao;

public class Animal {
	private String nome, especie;

	public Animal(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
