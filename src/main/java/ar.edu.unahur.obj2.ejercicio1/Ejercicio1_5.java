package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1_5 {
    int[] letrasContadas = new int[26];
    String texto;

    public int[] contarLetras(){
        int posicion;
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingrese el texto para contar:");
        texto = lectura.nextLine();
        for(int i=0; texto.length()>i; i++){
            posicion = texto.charAt(i);
            if (posicion>=65 && posicion<=90){
                letrasContadas[posicion-65] += 1;
            }else if (posicion>= 97 && posicion<=122){
                letrasContadas[posicion-97] += 1;
            }
        }
        return letrasContadas;
    }
    public void visualizarRecuento(){
        for(int i=0; letrasContadas.length>i; i++){
            System.out.println((char)(i + 65) + " aparece " + letrasContadas[i]+ " veces");
        }

    }
}
