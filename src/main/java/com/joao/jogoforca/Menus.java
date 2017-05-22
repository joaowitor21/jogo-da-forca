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
public class Menus {
    
    public static Menus menuInstance = new Menus();
    
    private Menus(){
        
    }
    
    public static Menus getInstance(){
        return menuInstance;
    }
    
    public void menuInicial(){
        System.out.println("Olá! Vamos jogar o jogo da forca?");
        System.out.println("Só tenha cuidado para não se enforcar.");
    }
    
    public void menuOpcoes(){
        System.out.println();
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Iniciar um jogo");
        System.out.println("Qualquer outra coisa para sair");
    }
    
    public void menuCategorias(){
        System.out.println();
        System.out.println("Selecione uma cetegoria para jogar:");
        System.out.println("1 - Comidas");
        System.out.println("2 - Animais");
        System.out.println("Qualquer outra coisa para Cores");
    }
}
