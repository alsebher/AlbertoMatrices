/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Alumno Mañana
 */
public class TestMatrices {
    public static void main(String[] args) {
        int[][] matri = new int[3][3];
        int incrementador = 1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matri[i][j]= incrementador;
                incrementador++;
            }
        }
        System.out.println("MATRIZ:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("\t"+matri[i][j]);
            }
            System.out.println("");
        }
    }
}
