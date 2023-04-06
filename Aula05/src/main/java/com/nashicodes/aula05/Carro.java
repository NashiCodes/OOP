package com.nashicodes.aula05;

public class Carro {

	private int Velocidade; // atributos;

	public Carro(int velocidadeInicial) { // Construtor
		Velocidade = velocidadeInicial;
	}

	public void acelera() { // Métodos
		Velocidade++;
	}

	public void freia() { // Métodos
		Velocidade--;
	}

}
