package Ejercicio3.EmpresasYEmpleados;

import java.util.Objects;

public class Empleado {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private  String fechaContrato;

    public Empleado(String nombre, String apellido, String fechaNacimiento, String fechaContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContrato = fechaContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre +
                ", Apellido: " + apellido +
                ", Fecha de Nacimiento: " + fechaNacimiento +
                ", Fecha de Contrato: " + fechaContrato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado)) return false;
        Empleado empleado = (Empleado) o;
        return getNombre().equals(empleado.getNombre()) &&
                getApellido().equals(empleado.getApellido()) &&
                Objects.equals(getFechaNacimiento(), empleado.getFechaNacimiento()) &&
                Objects.equals(getFechaContrato(), empleado.getFechaContrato());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getApellido(), getFechaNacimiento());
    }
}
