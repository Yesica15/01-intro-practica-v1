package Ejercicio2;

public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private double sueldoBase;

    public Empleado(int dn, String nom, String ap, String em, double sueldo){
        this.dni = dn;
        this.nombre = nom;
        this.apellido = ap;
        this.email = em;
        this.sueldoBase = sueldo;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void presentar(){
        System.out.println( "DNI: " + this.dni +
                " Nombre: " + this.nombre +
                " Apellido: " + this.apellido +
                " Sueldo: " + this.getSueldo());
    }

    public abstract double getSueldo();
}
