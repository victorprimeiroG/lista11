package br.com.nexustech.model;

// Exercício 11: Classe Concreta
public class ModoCasual implements ModoJogo {

    @Override
    public void buscarPartida() {
        System.out.println("Buscando partida no Modo Casual...");
    }
}
