package ar.edu.unahur.obj2.ejercicio1;

import java.util.Random;

public class Ejercicio1_7 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];

        Random numero = new Random();

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = numero.nextInt(100);
            }
        }

        System.out.println("La matriz luce tal que: ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if (matriz[i][j]>=10) {
                    System.out.print(matriz[i][j] + " ");
                } else{
                    System.out.print(matriz[i][j] + "  ");
                }// Solo para alinear los números en pantalla. No cumple otra función
            }
            System.out.println("");
        }
    }
}
