package br.com.nexustech.main;

import br.com.nexustech.exception.BanidoException;
import br.com.nexustech.exception.NivelInsuficienteException;
import br.com.nexustech.model.Masmorra;
import br.com.nexustech.model.Matchmaker;
import br.com.nexustech.model.ModoCasual;
import br.com.nexustech.model.ModoJogo;
import br.com.nexustech.model.ModoRanqueado;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== NÍVEL 1: UNCHECKED EXCEPTIONS ===");

        // Exercício 1 & 2: O Bug do K/D (Divisão por Zero)
        int kills = 15;
        int deaths = 0;
        try {
            System.out.println(kills / deaths);
        } catch (ArithmeticException e) {
            System.out.println("Taxa K/D: Jogador Invicto!");
        }

        // Exercício 3: O Inventário Bugado
        String[] inventario = new String[3];
        try {
            inventario[5] = "Espada";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inventário cheio!");
        }

        // Exercício 4: O Fantasma (NullPointer - Programação Defensiva)
        String jogador = null;
        if (jogador != null) {
            System.out.println("Nome do jogador: " + jogador);
        } else {
            System.out.println("Jogador desconectado");
        }

        System.out.println("\n=== NÍVEL 2: CHECKED EXCEPTIONS & FINALLY ===");

        // Exercício 6 & 7: Testando conexão e bloco finally
        try {
            conectarServidor();
        } catch (Exception e) {
            System.out.println("Mensagem: " + e.getMessage());
        } finally {
            System.out.println("Fechando portas de rede do jogo...");
        }

        System.out.println("\n=== NÍVEL 3: EXCEÇÃO CUSTOMIZADA ===");

        // Exercício 9: Testando a Masmorra
        Masmorra masmorra = new Masmorra();
        try {
            masmorra.entrar(20);
        } catch (NivelInsuficienteException e) {
            System.out.println("Acesso Negado: " + e.getMessage());
        }

        System.out.println("\n=== NÍVEL BOSS: ARQUITETO MATCHMAKER ===");

        // Exercício 14: Batalha Final
        Matchmaker matchmaker = new Matchmaker();
        ModoJogo casual = new ModoCasual();
        ModoJogo ranqueado = new ModoRanqueado();

        try {
            System.out.println("Buscando sala para jogador normal (Casual):");
            matchmaker.encontrarSala(casual, false);

            System.out.println("Buscando sala para jogador banido (Ranqueado):");
            matchmaker.encontrarSala(ranqueado, true);
        } catch (BanidoException e) {
            System.out.println(" Bloqueio de Segurança: " + e.getMessage());
        }
    }

    // Exercício 5: Método para simular queda de servidor
    public static void conectarServidor() throws Exception {
        throw new Exception("Servidor caiu!");
    }
}
