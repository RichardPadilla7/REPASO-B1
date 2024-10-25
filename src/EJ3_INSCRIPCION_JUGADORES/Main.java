//Richard Padilla
package EJ3_INSCRIPCION_JUGADORES;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ingresar = new Scanner(System.in);

        Equipo equipo1 = new Equipo("EQUIPO");
        System.out.println("Ingrese el nombre del jugador: ");
        String nombre = ingresar.nextLine();

        System.out.println("Ingrese el año de nacimiento del jugador: ");
        int anioNacimiento = ingresar.nextInt();

        System.out.println("Ingrese el numero de camiseta del jugador: ");
        int nCamiseta = ingresar.nextInt();

        Jugador jugador1 = new Jugador(nombre, anioNacimiento, nCamiseta);
        ingresar.nextLine(); //limpiar buffer
        equipo1.inscribirJugador(nombre, anioNacimiento, nCamiseta);

        System.out.println("\nJugador inscrito: ");
        equipo1.mostrarJugador();

        System.out.println("\nIngrese el nombre del jugador para cambiar el numero de camiseta: ");
        nombre = ingresar.nextLine();

        System.out.println("Ingresa el numero de camiseta para cambiar: ");
        int nuevoNumeroCamiseta = ingresar.nextInt();

        jugador1.setnCamiseta(nuevoNumeroCamiseta);System.out.println("Nuevo numero de camisa sin modificar los demas valores: ");
        jugador1.modificarNumeroCamiseta(nombre, nuevoNumeroCamiseta);

        //jugador1.mostrarInfo();
        System.out.println("\nIngrese la cantidad de camisetas a vender: ");
        int cantidad = ingresar.nextInt();

        ingresar.nextLine(); //limpiar buffer
        System.out.println("El total de la venta es: " + jugador1.calcularVenta(cantidad));
        }

}
