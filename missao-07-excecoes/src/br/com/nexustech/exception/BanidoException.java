package br.com.nexustech.exception;

// Exercício 12: Exceção Suprema (Checked Exception)
public class BanidoException extends Exception {

    public BanidoException() {
        super("Jogador Banido!");
    }
}
