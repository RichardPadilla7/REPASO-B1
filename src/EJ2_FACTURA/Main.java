//Richard Padilla
package EJ2_FACTURA;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ingresar = new Scanner(System.in);
            System.out.println("Ingrese el nombre del plato: ");
            String nombre = ingresar.nextLine();

            System.out.println("Ingrese el precio: ");
            double precio = ingresar.nextDouble();

            System.out.println("Ingrese la cantidad de platos: ");
            int cantidad = ingresar.nextInt();
            ingresar.nextLine(); //limpiar buffer


            Factura factura1 = new Factura(nombre, precio, cantidad);
            factura1.mostrarFactura();

        }
}
