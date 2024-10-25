package EJ2_FACTURA;

public class Factura {

    private String nombrePlato;
    private double precioPlato;
    private int cantidad;

    public Factura(String nombre, double precio, int cantidad){
        this.nombrePlato = nombre;
        this.precioPlato = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal(){
        double total = precioPlato * cantidad;
        return total;
    }

    public void mostrarFactura(){
        System.out.println("El nombre del plato es: "+ nombrePlato);
        System.out.println("El precio del plato es: "+ precioPlato);
        System.out.println("La cantidad que ordeno: " + cantidad);
        System.out.println("\nEl total es de su factura es: " + calcularTotal());
    }
}
