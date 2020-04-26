package Ejercicio3.Ticket;

public class LineaTicket {
    String nombre;
    double precio;
    int unidadesVendidas;

    LineaTicket(String nom, double pre, int unidas){
        this.nombre = nom;
        this.precio = pre;
        this.unidadesVendidas = unidas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    double precioTotal(){
        return unidadesVendidas*precio;
    }

    @Override
    public String toString() {
        return  "\n" + "Nombre: " + nombre +
                ", Unidades Vendidas: " + unidadesVendidas +
                ", Precio Total: " + (this.precioTotal())
                ;
    }
}

