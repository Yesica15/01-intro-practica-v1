package Ejercicio3.Ticket;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {
    private List<LineaTicket> listaCompra;

    Ticket(){
        listaCompra = new ArrayList<LineaTicket>();
    }

    private void registrarProducto(){
        Scanner nomb = new Scanner(System.in);
        Scanner pre = new Scanner(System.in);
        Scanner unid = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        String nombre = nomb.nextLine();
        System.out.println("Ingrese precio: ");
        double precio = pre.nextDouble();
        System.out.println("Ingrese la cantidad comprada: ");
        int unidades = unid.nextInt();
        listaCompra.add(new LineaTicket(nombre,precio,unidades));
    }

    public void cargarTicker(){
        Scanner lectura = new Scanner(System.in);
        String inicial = "a";
        while (!inicial.equalsIgnoreCase("SI")){
            this.registrarProducto();
            System.out.println("Desea terminar? (Si/No)");
            inicial = lectura.nextLine();
        }
    }

    @Override
    public String toString() {
        return "Su compra fue " + listaCompra + "\nY el total de compra es " + this.sumaTotalLineas();
    }

    public double sumaTotalLineas() {
        double total = 0;
        for(LineaTicket producto: this.listaCompra) {
            total += producto.precioTotal();
        }
        return total;
    }
}
