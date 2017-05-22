/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joao.jogoforca;

/**
 *
 * @author João Witor
 */
public class Update {

    private static Update jogadasInstance = new Update();

    private Update() {
    }

    public static Update getInstance() {
        return jogadasInstance;
    }

    public void imprimirPalavraProJogador(String[] arrayDoJogador) {
        System.out.print("\nPalavra da Rodada: ");
        for (int i = 0; i < arrayDoJogador.length; i++) {
            System.out.print(arrayDoJogador[i] + " ");
        }
    }

    public int verificarSeHaALetra(String[] arrayPalavraDaJogagada, String[] arrayDoJogador, String letraEscolhidaPeloJogador) {
        int verificacao = 0;
        for (int i = 0; i < arrayPalavraDaJogagada.length; i++) {
            if (arrayPalavraDaJogagada[i].equals(letraEscolhidaPeloJogador)) {
                arrayDoJogador[i] = letraEscolhidaPeloJogador;
                verificacao++;
            }
        }
        return verificacao;
    }

    public boolean verificarSeGanhou(String[] arrayDoJogador) {
        int x = 0;
        for (int i = 0; i < arrayDoJogador.length; i++) {
            if (arrayDoJogador[i].equals("_")) {
                x++;
            }
        }

        return x == 0;
    }
}
