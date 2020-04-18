package ar.edu.unahur.obj2.ejercicio1;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1_1 {

    public void ordenar() {
        int[] vectorInv = new int[10];
        this.cargarVectorInt(vectorInv);
        for(int i=9; i>=0; i--){
            System.out.print(vectorInv[i] + " ");
        }
    }

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

}
