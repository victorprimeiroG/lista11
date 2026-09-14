package br.com.nexustech.model;

import br.com.nexustech.exception.BanidoException;

// Exercício 13: O Sistema Matchmaker
public class Matchmaker {

    public void encontrarSala(ModoJogo modo, boolean jogadorBanido) throws BanidoException {
        if (jogadorBanido) {
            throw new BanidoException();
        }
        modo.buscarPartida();
    }
}
