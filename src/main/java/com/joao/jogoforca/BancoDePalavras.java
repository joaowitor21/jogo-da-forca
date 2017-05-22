/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joao.jogoforca;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author João Witor
 */
public class BancoDePalavras {

    private static BancoDePalavras palavrasInstance = new BancoDePalavras();
  ArrayList<String> categoriaComidas = new ArrayList<>();
    ArrayList<String> categoriaAnimais = new ArrayList<>();
    ArrayList<String> categoriaCores = new ArrayList<>();
    
    Random gerador = new Random();

    private BancoDePalavras() {
    }

    public static BancoDePalavras getInstance() {
        return palavrasInstance;
    }

  

    public void inicializarCategoriaComidas() {
        categoriaComidas.add("BATATA");
        categoriaComidas.add("COMIDA");
        categoriaComidas.add("PAO");
        categoriaComidas.add("LASANHA");
        categoriaComidas.add("PIZZA");
        categoriaComidas.add("BRIGADEIRO");
        categoriaComidas.add("FARINHA");
        categoriaComidas.add("ESTROGONOFE");
        categoriaComidas.add("BOLO");
        categoriaComidas.add("ARROZ");
        categoriaComidas.add("DOCE");
        categoriaComidas.add("CHURRASCO");
        categoriaComidas.add("BALA");
        categoriaComidas.add("TAPIOCA");
        categoriaComidas.add("FEIJAO");
        categoriaComidas.add("AÇAI");
        categoriaComidas.add("PAÇOCA");
        categoriaComidas.add("ACARAJE");
        categoriaComidas.add("PAMONHA");
        categoriaComidas.add("DOBRADINHA");
        categoriaComidas.add("RAPADURA");
        categoriaComidas.add("FAROFA");
        categoriaComidas.add("PASTEL");
        categoriaComidas.add("COUVE");
        categoriaComidas.add("SANDUICHE");
        categoriaComidas.add("PALMITO");
        categoriaComidas.add("UMBU");
        categoriaComidas.add("CAMARAO");
        categoriaComidas.add("FEIJOADA");
        categoriaComidas.add("GALINHA");
        categoriaComidas.add("PEIXE");
        categoriaComidas.add("BISCOITO");
        categoriaComidas.add("BOLACHA");
        categoriaComidas.add("QUEIJO");
        categoriaComidas.add("CURAU");
        categoriaComidas.add("TORTA");
        categoriaComidas.add("CAFE");
        categoriaComidas.add("BUCHADA");
        categoriaComidas.add("CHA");
        categoriaComidas.add("RABADA");
        categoriaComidas.add("CUSCUZ");
        categoriaComidas.add("QUINDIM");
        categoriaComidas.add("CAJU");
        categoriaComidas.add("SORVETE");
        categoriaComidas.add("SARAPATEL");
        categoriaComidas.add("CANJICA");
        categoriaComidas.add("MOQUECA");
        categoriaComidas.add("MANDIOCA");
        categoriaComidas.add("JACA");
        categoriaComidas.add("SONHO");
        categoriaComidas.add("REQUEIJAO");
        categoriaComidas.add("ACEROLA");
        categoriaComidas.add("PUDIM");
        categoriaComidas.add("MANJAR");
        categoriaComidas.add("COXINHA");
        categoriaComidas.add("EMPADA");
        categoriaComidas.add("CHIMARRAO");
        categoriaComidas.add("JABUTICABA");
        categoriaComidas.add("CALDINHO");
        categoriaComidas.add("MELAO");
        categoriaComidas.add("MILHO");
        categoriaComidas.add("CAIPIRINHA");
        categoriaComidas.add("CACHAÇA");
    }

    public void inicializarCategoriaAnimais() {
        categoriaAnimais.add("ABELHA");
        categoriaAnimais.add("ACARO");
        categoriaAnimais.add("ANTA");
        categoriaAnimais.add("ALCE");
        categoriaAnimais.add("AGUIA");
        categoriaAnimais.add("ALBATROZ");
        categoriaAnimais.add("ARANHA");
        categoriaAnimais.add("BARATA");
        categoriaAnimais.add("BALEIA");
        categoriaAnimais.add("CALANGO");
        categoriaAnimais.add("CAMALEAO");
        categoriaAnimais.add("CACHORRO");
        categoriaAnimais.add("CASTOR");
        categoriaAnimais.add("CHIMPANZE");
        categoriaAnimais.add("DROMEDALIO");
        categoriaAnimais.add("ESQUILO");
        categoriaAnimais.add("FORMIGA");
        categoriaAnimais.add("GAFANHOTO");
        categoriaAnimais.add("GRALHA");
        categoriaAnimais.add("GUARA");
        categoriaAnimais.add("HOMEM");
        categoriaAnimais.add("JABUTI");
        categoriaAnimais.add("JACUTINGA");
        categoriaAnimais.add("MARRECO");
        categoriaAnimais.add("ORANGOTANGO");
        categoriaAnimais.add("PAPAGUAIO");
        categoriaAnimais.add("PIOLHO");
        categoriaAnimais.add("PIRAROCU");
        categoriaAnimais.add("ROBALO");
        categoriaAnimais.add("SALMAO");
        categoriaAnimais.add("SARACURA");
        categoriaAnimais.add("TAMANDUA");
        categoriaAnimais.add("XEXEU");
        categoriaAnimais.add("VESPA");
        categoriaAnimais.add("ZEBRA");
        categoriaAnimais.add("VEADO");
        categoriaAnimais.add("URUBU");
        categoriaAnimais.add("COELHO");
        categoriaAnimais.add("GATO");
        categoriaAnimais.add("LAGARTO");
        categoriaAnimais.add("TRAIRA");
        categoriaAnimais.add("PIRANHA");
        categoriaAnimais.add("PEIXE");
        categoriaAnimais.add("TUCANO");
        categoriaAnimais.add("PASSARO");
        categoriaAnimais.add("BESOURO");
        categoriaAnimais.add("TATU");
        categoriaAnimais.add("DODO");
        categoriaAnimais.add("SAUVA");
        categoriaAnimais.add("TIGRE");
    }

    public void inicializarCategoriaCores() {
        categoriaCores.add("AZUL");
        categoriaCores.add("ALIZARINA");
        categoriaCores.add("AMARELO");
        categoriaCores.add("AMETISTA");
        categoriaCores.add("ASPARGO");
        categoriaCores.add("BRANCO");
        categoriaCores.add("BORGONHA");
        categoriaCores.add("CASTANHO");
        categoriaCores.add("CARMIM");
        categoriaCores.add("CINZA");
        categoriaCores.add("DOURADO");
        categoriaCores.add("ESCARLATE");
        categoriaCores.add("ESMERALDA");
        categoriaCores.add("FERRUGEM");
        categoriaCores.add("FANDANGO");
        categoriaCores.add("GLITTER");
        categoriaCores.add("HERBAL");
        categoriaCores.add("IRIS");
        categoriaCores.add("JADE");
        categoriaCores.add("JAMBO");
        categoriaCores.add("KIWI");
        categoriaCores.add("LARANJA");
        categoriaCores.add("LILAS");
        categoriaCores.add("LAVANDA");
        categoriaCores.add("MARROM");
        categoriaCores.add("MARFIM");
        categoriaCores.add("OURO");
        categoriaCores.add("PRATA");
        categoriaCores.add("PRETO");
        categoriaCores.add("PURPURA");
        categoriaCores.add("ROSA");
        categoriaCores.add("ROXO");
        categoriaCores.add("SALMAO");
        categoriaCores.add("SEPIA");
        categoriaCores.add("TURQUESA");
        categoriaCores.add("VERDE");
        categoriaCores.add("ZINCO");
    }

    public String escolherPalavraAleatoria(ArrayList<String> categoriaX) {
        int indice = gerador.nextInt(categoriaX.size());
        String palavra = categoriaX.get(indice);
        categoriaX.remove(indice);
        return palavra;
    }
}