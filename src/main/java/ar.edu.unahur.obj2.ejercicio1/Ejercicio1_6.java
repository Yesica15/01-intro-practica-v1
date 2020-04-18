package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1_6 {
    int matriz[][] = new int [3][3];

    private void cargarMatriz(){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el numero para la posición : ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("Matriz [" +i+ "][" +j+ "]");
                matriz[i][j] = lectura.nextInt();
            }
        }
    }

    private void mostrarMatriz(){
        System.out.println("La matriz ingresada luce tal que ");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void presentarMatriz3x3(){
        this.cargarMatriz();
        this.mostrarMatriz();
    }

}

