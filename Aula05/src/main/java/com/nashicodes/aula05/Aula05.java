package com.nashicodes.aula05;

import java.util.*;

public class Aula05 {

    public static void carros() {
        Carro fusca = new Carro(10);
        Carro bmw = new Carro(15);
        fusca.freia();
        bmw.acelera();
        System.out.println("velocidade do fusca: " + fusca.getVelocidade());
        System.out.println("velocidade da BMW: " + bmw.getVelocidade());
    }

    public static void fPessoas() {
        final int NUM_PESSOAS = 5;

        Pessoa[] pessoas = new Pessoa[NUM_PESSOAS];
        try (Scanner ler = new Scanner(System.in)) {
            for (int i = 0; i < NUM_PESSOAS; i++) {
                String nome = ler.next();
                int idade = ler.nextInt();
                pessoas[i] = new Pessoa(nome, idade);
            }
        }

        Arrays.sort(pessoas);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
        }
        System.out.println("\n================================");

        Arrays.sort(pessoas, Comparator.comparingInt(Pessoa::getIdade));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
        }
        System.out.println("\n================================");

    }

    public static void main(String[] args) {
        carros();
        fPessoas();
    }
}