package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1_2 {
    private void cargarVectorInt(@org.jetbrains.annotations.NotNull int[] vector){
        for(int i=0; i<vector.length; i++){
            vector[i] = this.cargarPosInt();
        }
    }

    private int cargarPosInt(){
        Scanner lectura = new Scanner(System.in);
        System.out.print("ingrese un numero ");
        int num = lectura.nextInt();
        lectura.close();
        return num;
    }

    public void listaMayorA(){
        System.out.println("Valor de referencia");
        int valorRe = this.cargarPosInt();
        int[] vector = new int[20];
        System.out.println("Valores a evaluar");
        this.cargarVectorInt(vector);
        System.out.println("Valores mayores a "+ valorRe);
        for(int i=0; i<vector.length; i++){
            if (vector[i] >= valorRe){
                System.out.print(vector[i] + " ");
            }
        }

    }
}
