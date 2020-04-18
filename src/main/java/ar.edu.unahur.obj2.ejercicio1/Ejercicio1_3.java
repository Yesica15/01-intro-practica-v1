package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1_3 {
    private double cargarPosDou(){
        Scanner lectura = new Scanner(System.in);
        System.out.print("ingrese la temperatura ");
        double num = lectura.nextDouble();
        return num;
    }



    private void mostrarTem(double tem, int hora){
        System.out.print(hora + " ");
        for (int i = 0; i<(int)tem; i++){
            System.out.print("*");
        }
        System.out.print(" " + tem);
    }

    private double buscarMin(double[] vec){
        double min = vec[0];
        for (int i=1; i<vec.length; i++){
            if (vec[i]<min){
                min= vec[i];
            }
        }
        return min;
    }

    private double buscarMax(double[] vec){
        double max = vec[0];
        for (int i=1; i<vec.length; i++){
            if (vec[i]>max){
                max= vec[i];
            }
        }
        return max;
    }

    private void marcarMaxMin(double min, double max, double temp){
        if(temp == max){
            System.out.print(" --> Max" );
        }else if(temp == min){
            System.out.print(" --> Min ");
        }
        System.out.println("");
    }

    public void temperaturaDelDia(){
        double[] temps = new double[24];
        for(int i=0; i<temps.length; i++){
            temps[i] = this.cargarPosDou();
        }
        double prom = 0.0;
        double min = this.buscarMin(temps);
        double max = this.buscarMax(temps);
        for (int i=0; i<temps.length; i++){
            this.mostrarTem(temps[i], i);
            this.marcarMaxMin(min, max, temps[i]);
            prom += temps[i];
        }
        System.out.printf("Promedio temperatura: %.3f%n", (prom/24));
    }

}
