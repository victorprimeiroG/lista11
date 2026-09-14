package br.com.nexustech.exception;

// Exercício 8: Exceção Customizada Unchecked
public class NivelInsuficienteException extends RuntimeException {

    public NivelInsuficienteException() {
        super("Seu nível é muito baixo para esta masmorra!");
    }
}
