package br.com.nexustech.model;

import br.com.nexustech.exception.NivelInsuficienteException;

// Exercício 9: Classe Masmorra
public class Masmorra {

    public void entrar(int nivelJogador) {
        if (nivelJogador < 50) {
            throw new NivelInsuficienteException();
        }
        System.out.println("Bem-vindo à Masmorra! Nível aceito.");
    }
}
