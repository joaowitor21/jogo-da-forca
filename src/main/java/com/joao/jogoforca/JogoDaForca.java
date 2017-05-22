/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joao.jogoforca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author João Witor
 */
public class JogoDaForca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Inicializando o jogo
        BancoDePalavras.getInstance().inicializarCategoriaComidas();
        BancoDePalavras.getInstance().inicializarCategoriaAnimais();
        BancoDePalavras.getInstance().inicializarCategoriaCores();

        Menus.getInstance().menuInicial();
        Menus.getInstance().menuOpcoes();
        String opcao = sc.next();

        while (opcao.equals("1")) {
            Menus.getInstance().menuCategorias();
            String opcaoCategoria = sc.next();

            String palavraDaJogada = "";
            switch (opcaoCategoria) {
                case "1":
                    palavraDaJogada = BancoDePalavras.getInstance().escolherPalavraAleatoria(BancoDePalavras.getInstance().categoriaComidas);
                    break;
                case "2":
                    palavraDaJogada = BancoDePalavras.getInstance().escolherPalavraAleatoria(BancoDePalavras.getInstance().categoriaAnimais);
                    break;
                default:
                    palavraDaJogada = BancoDePalavras.getInstance().escolherPalavraAleatoria(BancoDePalavras.getInstance().categoriaCores);
                    break;
            }

            //criando array da palavra da rodada
            char arrayCharPalavraDaJogada[] = palavraDaJogada.toCharArray();
            String arrayPalavraDaJogada[] = new String[arrayCharPalavraDaJogada.length];
            for (int i = 0; i < arrayCharPalavraDaJogada.length; i++) {
                arrayPalavraDaJogada[i] = "" + arrayCharPalavraDaJogada[i];
            }

            //criando array do jogador
            String arrayDoJogador[] = new String[arrayPalavraDaJogada.length];
            for (int i = 0; i < arrayDoJogador.length; i++) {
                arrayDoJogador[i] = "_";
            }

            //inicializando boneco da forca
            DesenhoForca.getInstance().inicializarForca();

            //Update do jogo
            DesenhoForca.getInstance().imprimirForca();
            Update.getInstance().imprimirPalavraProJogador(arrayDoJogador);
            
            ArrayList<String> letrasEscolhidas = new ArrayList<>();
            
            int vidas = 6;
            while (vidas > 0) {

                //escolhendo uma letra
                System.out.println("     Escolha uma letra:");
                String letraEscolhidaPeloJogador = sc.next();
                String letraComFormatacaoMaiuscula = letraEscolhidaPeloJogador.toUpperCase();
                letrasEscolhidas.add(letraComFormatacaoMaiuscula);
                
                //verificando se Ha a Letra
                int verificacao = Update.getInstance().verificarSeHaALetra(arrayPalavraDaJogada, arrayDoJogador, letraComFormatacaoMaiuscula);
                if (verificacao == 0) {
                    vidas--;
                }
                DesenhoForca.getInstance().acrescentarParteDoCorpo(vidas);

                //mostrando resultado pro jogador
                DesenhoForca.getInstance().imprimirForca();
                System.out.print("Letras Escolhidas: " + letrasEscolhidas.toString());
                Update.getInstance().imprimirPalavraProJogador(arrayDoJogador);

                //verifica se perdeu
                if (vidas == 0) {
                    System.out.println("\nPoxa, não foi dessa vez!");
                    System.out.println("A palavra era: " + palavraDaJogada);
                }

                //verifica se ganhou
                if (Update.getInstance().verificarSeGanhou(arrayDoJogador)) {
                    vidas = 0;
                    System.out.println("\nParabéns, você acertou a palavra!");
                }
            }
            Menus.menuInstance.menuOpcoes();
            opcao = sc.next();

            //verifica se saiu
            if (!opcao.equals("1")) {
                System.out.println("Adeus e até a proxima!");
            }
        }
    }

}
