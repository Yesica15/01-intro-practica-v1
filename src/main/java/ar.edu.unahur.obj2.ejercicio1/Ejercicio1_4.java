package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1_4 {
    private List<String> cargarCompaniero(){
        Scanner lecturaN = new Scanner(System.in);
        Scanner lecturaA = new Scanner(System.in);
        List<String> alumnos = new ArrayList<String>();
        System.out.print("ingrese la cantidad de alumnos: ");
        int cantidad = lecturaN.nextInt();
        for(int i = 0; i< cantidad; i++){
            System.out.print("ingrese nombre y apellido: ");
            String estudiante = lecturaA.nextLine();
            alumnos.add(estudiante);
        }
        return alumnos;
    }

    private void buscarCompaniero(List<String> alumnos){
        Scanner lectura = new Scanner(System.in);
        String inicial = "a";
        System.out.println("En caso de querer detener la busqueda ingrese Fin");
        while (!inicial.equalsIgnoreCase("FIN")){
            System.out.print("ingrese letra para buscar: ");
            inicial = lectura.nextLine();
            for (int i = 0; i <= alumnos.size() - 1; i++) {
                if (alumnos.get(i).charAt(0)==inicial.charAt(0)){
                    System.out.println(alumnos.get(i));
                }

            }
        }
        lectura.close();
    }

    public void listarCompClaseConLetra(){
        List<String> alumnos = this.cargarCompaniero();
        this.buscarCompaniero(alumnos);
    }
}
