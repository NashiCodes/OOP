package com.nashicodes.aula05;

public class Pessoa implements Comparable<Pessoa> {

	private String nome;

	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		return nome.compareToIgnoreCase(outraPessoa.getNome());
	}

}
