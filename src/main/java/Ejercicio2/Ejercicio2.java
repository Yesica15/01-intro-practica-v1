package Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    List<Empleado> empleados = new ArrayList<Empleado>();

    public void cargarLista(){
        Scanner cant = new Scanner(System.in);
        Scanner categ = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de empleados para cargar (Max 20): ");
        int cantEmp = cant.nextInt();
        for(int i = 0; i<cantEmp; i++){
            System.out.println("Ingrese la categoría del empleado: ");
            String categoria = categ.nextLine();
            this.cargarEmpleado(categoria);
        }
    }

    public void cargarEmpleado(String categoria){
        Scanner nomb = new Scanner(System.in);
        Scanner ape = new Scanner(System.in);
        Scanner sueldo = new Scanner(System.in);
        Scanner email = new Scanner(System.in);
        Scanner docIn = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = nomb.nextLine();
        System.out.println("Apellido: ");
        String apellido = ape.nextLine();
        System.out.println("DNI: ");
        int dni = docIn.nextInt();
        System.out.println("Email: ");
        String ema = email.nextLine();
        System.out.println("Sueldo: ");
        double sueldoB = sueldo.nextDouble();
        if (categoria.equalsIgnoreCase("Administrativo")){
            this.cargarAdministrativo(dni, nombre, apellido, ema, sueldoB);
        }else{
            this.cargarVendedor(dni, nombre, apellido, ema, sueldoB);
        }

    }

    public void cargarVendedor(int dni, String nombre, String apellido, String ema, double sueldoB){
        Scanner porc = new Scanner(System.in);
        Scanner vent = new Scanner(System.in);
        System.out.println("Porcentaje de Comision: ");
        double comision = porc.nextDouble();
        System.out.println("Total Ventas: ");
        int ventas = vent.nextInt();
        empleados.add(new Vendedor(dni, nombre, apellido, ema, sueldoB,comision,ventas));
    }

    public void cargarAdministrativo(int dni, String nombre, String apellido, String ema, double sueldoB){
        Scanner hrsM = new Scanner(System.in);
        Scanner hrsE = new Scanner(System.in);
        System.out.println("Horas Extra: ");
        double hrasExtras = hrsE.nextDouble();
        System.out.println("Horas Al Mes: ");
        double hrasAlMes = hrsM.nextDouble();
        empleados.add(new Administrativo(dni, nombre, apellido, ema, sueldoB,hrasExtras,hrasAlMes));
    }

    public void mostrarEmpleados(){
        for (int i = 0; i <= empleados.size() - 1; i++) {
            empleados.get(i).presentar();
        }
    }
}
