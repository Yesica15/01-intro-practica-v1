package Ejercicio2;

public class Administrativo extends Empleado {
    private double hrsExtra;
    private double hrsMes;

    public Administrativo(int dn, String nom, String ap, String em, double sueldo, double hrsM, double hrsE){
        super(dn, nom,ap, em,sueldo);
        this.hrsExtra = hrsE;
        this.hrsMes = hrsM;
    }

    public double getHrsExtra() {
        return hrsExtra;
    }

    public double getHrsMes() {
        return hrsMes;
    }

    @Override
    public double getSueldo() {
        return this.getSueldoBase() * ((this.hrsExtra*1.5)+ this.hrsMes) / this.hrsMes;
    }
}
