package Ejercicio2;

public class Vendedor extends Empleado {
    private double porceComision;
    private int totalVentas;

    public Vendedor(int dn, String nom, String ap, String em, double sueldo, double porc, int ventas){
        super(dn, nom,ap, em,sueldo);
        this.porceComision =porc;
        this.totalVentas = ventas;
    }

    public double getPorceComision() {
        return porceComision;
    }

    public int getTotalVentas() {
        return totalVentas;
    }

    @Override
    public double getSueldo() {
        return this.getSueldoBase() + (this.porceComision*this.totalVentas/100);
    }

}
