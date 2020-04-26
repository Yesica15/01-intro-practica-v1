package Ejercicio3.EmpresasYEmpleados;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Menu {
    private List<Empresa> empresas;

    public Menu() {
        this.empresas = new ArrayList<Empresa>();
    }

    public void ejecutarMenu(){
        Scanner opElegida = new Scanner(System.in);
        int opcion = 6;
        while (opcion != 5){
            this.listarOpciones();
            opcion = opElegida.nextInt();
            switch (opcion){
                case 1:
                    this.crearEmpresa();
                    break;
                case 2:
                    this.agregarEmpleado();
                    break;
                case 3:
                    this.listarEmpresas();
                    break;
                case 4:
                    this.listadoDetallado();
                    break;
            }
        }
    }

    public void crearEmpresa() {
        Scanner nom = new Scanner(System.in);
        Scanner anio = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la empresa: ");
        String nombre = nom.nextLine();
        System.out.print("Ingrese el año de fundacion de la empresa: ");
        String anioFundacion = anio.nextLine();
        empresas.add(new Empresa(nombre, anioFundacion));
    }

    public void agregarEmpleado() {
        Scanner nomEmpresa = new Scanner(System.in);
        Scanner nomEmpleado = new Scanner(System.in);
        Scanner apell = new Scanner(System.in);
        Scanner fecNacimiento = new Scanner(System.in);
        Scanner fecContrato = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la empresa que pertenece: ");
        String nombreEmpresa = nomEmpresa.nextLine();
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = nomEmpleado.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = apell.nextLine();
        System.out.print("Ingrese la fecha de nacimiento: ");
        String fechaDeNacimiento = fecNacimiento.nextLine();
        System.out.print("Ingrese la fecha de contratacion: ");
        String fechaContrato = fecContrato.nextLine();

        Empresa empresa = buscarEmpresa(nombreEmpresa);

        empresa.agregarEmpleado(nombreEmpleado, apellido, fechaDeNacimiento, fechaContrato);
    }

    public void listarEmpresas() {
        empresas.stream().forEach(empresa -> System.out.println(empresa.getNombre()));
    }

    public void listadoDetallado() {
        for(int i = 0; i< empresas.size(); i++) {
            Empresa empresa = empresas.get(i);
            System.out.println(empresa);
            System.out.println("Empleados: ");
            empresa.listarEmpleados();
        }
    }

    public void listarOpciones() {
        System.out.println("Seleccione una opción:");
        System.out.println("1- Crear una nueva empresa.");
        System.out.println("2- Añadir empleado a empresa ya existente.");
        System.out.println("3- Listado de empresas.");
        System.out.println("4- Listado detallado de empresas y empleados.");
        System.out.println("5- Salir.");
    }

    private Empresa buscarEmpresa(String nombreEmpresa) {
        List<Empresa> empresa = empresas.stream()
                .filter(e -> e.getNombre().equals(nombreEmpresa))
                .collect(Collectors.toList());
        return empresa.get(0);
    }
}
