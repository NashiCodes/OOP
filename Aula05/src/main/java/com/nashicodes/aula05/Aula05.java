package com.nashicodes.aula05;

public class Aula05 {

	public static void main(String[] args) {
		Carro fusca = new Carro(10);
		Carro bmw = new Carro(15);
		fusca.freia();
		bmw.acelera();
		System.out.println("velocidade do fusca: " + fusca.getVelocidade());
		System.out.println("velocidade da BMW: " + bmw.getVelocidade());
	}

}