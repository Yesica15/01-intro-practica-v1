package Ejercicio3.EmpresasYEmpleados;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {
    private String nombre;
    private String anioFundacion;
    private List<Empleado> empleados;

    Empresa(String nom, String anio){
        this.nombre = nom;
        this.anioFundacion = anio;
        this.empleados = new ArrayList<Empleado>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnioFundacion() {
        return anioFundacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(String nombreEmpleado, String apellido, String fechaDeNacimiento, String fechaContrato){
        empleados.add(new Empleado(nombreEmpleado,apellido,fechaDeNacimiento,fechaContrato));
    }

    public void listarEmpleados(){
        empleados.stream().forEach(empleado -> System.out.println(empleado));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empresa)) return false;
        Empresa empresa = (Empresa) o;
        return nombre.equals(empresa.nombre) &&
            Objects.equals(anioFundacion, empresa.anioFundacion) &&
            empleados.equals(empresa.empleados);
}

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return  "- Empresa: " + nombre +
                ", Año de Fundacion: " + anioFundacion
                ;
    }
}
