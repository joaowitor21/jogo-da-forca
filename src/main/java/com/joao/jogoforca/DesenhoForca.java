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
public class DesenhoForca {

    private static DesenhoForca forcaInstance = new DesenhoForca();

    private DesenhoForca() {
    }

    public static DesenhoForca getInstance() {
        return forcaInstance;
    }

    String forca[][] = new String[7][5];

    public void inicializarForca() {
        forca[0][1] = "_";
        forca[0][2] = "_";
        forca[0][3] = "_";
        forca[0][4] = "_";
        forca[1][3] = "|";
        forca[1][0] = "|";
        forca[2][0] = "|";
        forca[3][0] = "|";
        forca[4][0] = "|";
        forca[5][0] = "|";
        forca[6][0] = "-";
        forca[3][3] = " ";

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (forca[i][j] == null) {
                    forca[i][j] = " ";
                } else if (!forca[i][j].equals("_") && !forca[i][j].equals("-") && !forca[i][j].equals("|")) {
                    forca[i][j] = " ";
                }
            }
        }
    }

    public void imprimirForca() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(forca[i][j]);
            }
            System.out.println("");
        }
    }

    public void acrescentarParteDoCorpo(int vidas) {
        if (vidas < 6) {
            switch (vidas) {
                case 5:
                    forca[2][3] = "0";
                    break;
                case 4:
                    forca[3][2] = "/";
                    break;
                case 3:
                    forca[3][4] = "\\";
                    break;
                case 2:
                    forca[3][3] = "|";
                    break;
                case 1:
                    forca[4][2] = "/";
                    break;
                default:
                    forca[4][4] = "\\";
                    break;
            }
        }
    }
}
